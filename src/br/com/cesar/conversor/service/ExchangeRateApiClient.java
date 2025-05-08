package br.com.cesar.conversor.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateApiClient {
    private static final String API_KEY = "d40f765e5a44c70e76580b97";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";
    private final HttpClient client = HttpClient.newHttpClient();

    public double obterTaxa(String de, String para) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + de))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new IOException("Erro ao consultar API. Código: " + response.statusCode());
        }

        JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
        JsonObject taxas = json.getAsJsonObject("conversion_rates");

        if (!taxas.has(para)) {
            throw new IllegalArgumentException("Moeda de destino inválida ou não disponível.");
        }

        return taxas.get(para).getAsDouble();
    }
}
