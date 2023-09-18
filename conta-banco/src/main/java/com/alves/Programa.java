package com.alves;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Conta conta;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite numero da conta");
        int numero = scan.nextInt();

        System.out.println("Digite a agencia");
        String agencia = scan.next();

        System.out.println("Digite seu nome");
        String nome = scan.next();

        System.out.println("Digite o saldo");
        double saldo = scan.nextDouble();

        conta = new Conta(numero,agencia,nome,saldo);

        System.out.println(conta);

    }
}
