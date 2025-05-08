package br.com.cesar.conversor.service;

import java.util.Scanner;

public class CurrencyConverter {
    private final CurrencyService service = new CurrencyService();

    public void executarMenu(Scanner scanner) {
        int opcao = -1;

        while (opcao != 8) {
            System.out.println("\n=== CONVERSOR DE MOEDAS ===");
            System.out.println("1. BRL para USD");
            System.out.println("2. USD para BRL");
            System.out.println("3. BRL para ARS");
            System.out.println("4. ARS para BRL");
            System.out.println("5. BRL para CLP");
            System.out.println("6. CLP para BRL");
            System.out.println("7. Ver Histórico");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());

                if (opcao >= 1 && opcao <= 6) {
                    System.out.print("Informe o valor: ");
                    double valor = Double.parseDouble(scanner.nextLine());

                    if (valor <= 0) {
                        System.out.println("O valor deve ser maior que zero.");
                        continue;
                    }

                    String de = "", para = "";
                    switch (opcao) {
                        case 1 -> { de = "BRL"; para = "USD"; }
                        case 2 -> { de = "USD"; para = "BRL"; }
                        case 3 -> { de = "BRL"; para = "ARS"; }
                        case 4 -> { de = "ARS"; para = "BRL"; }
                        case 5 -> { de = "BRL"; para = "CLP"; }
                        case 6 -> { de = "CLP"; para = "BRL"; }
                    }

                    String resultado = service.converter(valor, de, para);
                    System.out.println(resultado);

                } else if (opcao == 7) {
                    service.exibirHistorico();
                } else if (opcao != 8) {
                    System.out.println("Opção inválida. Tente novamente.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
            }
        }
    }
}
