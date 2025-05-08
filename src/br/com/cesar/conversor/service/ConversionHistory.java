package br.com.cesar.conversor.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ConversionHistory {
    private final List<String> historico = new ArrayList<>();

    public void adicionarRegistro(String registro) {
        String timestamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        historico.add("[" + timestamp + "] " + registro);
    }

    public void imprimirHistorico() {
        if (historico.isEmpty()) {
            System.out.println("Nenhuma conversão registrada.");
        } else {
            System.out.println("=== Histórico de Conversões ===");
            historico.forEach(System.out::println);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("=== Histórico de Conversões ===\n");
        for (String linha : historico) {
            builder.append(linha).append("\n");
        }
        return builder.toString();
    }
}
