package com.company;

import java.util.Scanner;

public class Numero12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int cargo;
        double salario,valorReajuste,novoSalario;

        System.out.println("Vamos lá! Para saber o valor do seu aumento e o valor do seu novo salário precisamos de algumas informações!");
        System.out.println("1. Escriturário\n 2. Secretário\n 3. Caixa\n 4. Gerente\n 5. Diretor\n Informe o número do seu cargo: ");
        cargo=scanner.nextInt();
        System.out.println("Informe o valor do seu salário: ");
        salario=scanner.nextDouble();
        if (cargo==1){
            valorReajuste=salario*0.5;
            novoSalario=valorReajuste+salario;
            System.out.println("Seu cargo é: Escriturário");
            System.out.println("O valor do seu reajuste é: " +valorReajuste);
            System.out.println("O valor do seu novo salário é: " +novoSalario);
        }else if (cargo==2){
            valorReajuste=salario*0.35;
            novoSalario=valorReajuste+salario;
            System.out.println("Seu cargo é: Secretário");
            System.out.println("O valor do seu reajuste é: " +valorReajuste);
            System.out.println("O valor do seu novo salário é: " +novoSalario);
        }else if (cargo==3){
            valorReajuste=salario*0.2;
            novoSalario=valorReajuste+salario;
            System.out.println("Seu cargo é: Caixa");
            System.out.println("O valor do seu reajuste é: " +valorReajuste);
            System.out.println("O valor do seu novo salário é: " +novoSalario);
        }else if (cargo==4){
            valorReajuste=salario*0.1;
            novoSalario=valorReajuste+salario;
            System.out.println("Seu cargo é: Gerente");
            System.out.println("O valor do seu reajuste é: " +valorReajuste);
            System.out.println("O valor do seu novo salário é: " +novoSalario);
        }else{
            System.out.println("Seu cargo é: Diretor");
            System.out.println("Infelizmente você não possui reajuste no seu salário e continua sendo: " +salario);
        }
        System.out.println("Obrigado por usar nosso programa!");
    }
}
