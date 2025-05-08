package br.com.cesar.conversor.service;

import java.io.IOException;

public class CurrencyService {
    private final ExchangeRateApiClient apiClient = new ExchangeRateApiClient();
    private final ConversionHistory historico = new ConversionHistory();

    public String converter(double valor, String de, String para) {
        try {
            double taxa = apiClient.obterTaxa(de, para);
            double convertido = valor * taxa;

            String resultado = String.format("%.2f %s = %.2f %s", valor, de, convertido, para);
            historico.adicionarRegistro(resultado);
            return resultado;

        } catch (IOException | InterruptedException e) {
            return "Erro ao consultar a API: " + e.getMessage();
        } catch (Exception e) {
            return "Erro inesperado: " + e.getMessage();
        }
    }

    public void exibirHistorico() {
        historico.imprimirHistorico();
    }
}