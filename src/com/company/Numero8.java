package com.company;

import java.util.Scanner;

public class Numero8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcaoDesejada,primeiroNumero,segundoNumero,somaNumeros;
        double numeroRaiz,raiz;

        System.out.println("Menu de opções:\n 1. Somar dois números inteiros\n 2. Raiz quadrada de um número");
        System.out.println("Informe a opção desejada: ");
        opcaoDesejada=scanner.nextInt();
        if (opcaoDesejada==1){
            System.out.println("Informe o primeiro número a ser somado: ");
            primeiroNumero=scanner.nextInt();
            System.out.println("Agora informe o segundo número: ");
            segundoNumero=scanner.nextInt();
            somaNumeros=primeiroNumero+segundoNumero;
            System.out.println("A soma dos números é: " +somaNumeros);
        }else{
            System.out.println("Informe o número para verificar a raiz quadrada: ");
            numeroRaiz=scanner.nextDouble();
            raiz=Math.sqrt(numeroRaiz);
            System.out.println("A raiz quadrada do seu número é: " +raiz);
        }
        System.out.println("Obrigado por usar nosso programa!");
    }
}
