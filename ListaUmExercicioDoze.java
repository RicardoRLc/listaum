
//Exercicio12
/* 12) Crie um programa que receba o salário e diga o valor de imposto de renda conforme abaixo:

Base	                   Alíquota
Até 1.903,98	           Isento
De 1.903,99 até 2.826,65	7,5%
De 2.826,66 até 3.751,05	15%
De 3.751,06 até 4.664,68	22,5%
Acima de 4.664,68	        27,5% */

import java.util.Scanner;

public class ListaUmExercicioDoze {
    public static void main(String[] args) {
            
           System.out.println("==============");
           System.out.println("By Ricardo");
           System.out.println("==============\n");

            double salario;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Qual seu salário?:");

            salario = scanner.nextDouble();

            if (salario < 1903.98) {
                System.out.println("Você esta isento de impostos:");
            } else if (salario < 2826.65) {
                System.out.println("Seu imposto é de 7,5%");
            } else if (salario < 3751.05) {
                System.out.println("Seu imposto é de 15%");
            } else if (salario < 4664.68) {
                System.out.println("Seu imposto é de 22.5%");

            } else if (salario > 4664.68) {
                System.out.println("Seu imposto é de 27.5%");
            }
            System.out.println("\n===== FIM ====");
        
    }
}