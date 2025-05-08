package br.com.cesar.conversor.service;

import java.util.Scanner;

public class Main {
    public  static void main(String[] args) {
        // Criação de um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Instanciando a classe CurrencyConverter que já possui o menu
        CurrencyConverter converter = new CurrencyConverter();

        // Chamando o método para iniciar a conversão de moedas e interagir com o usuário
        converter.executarMenu(scanner);
    }
}
