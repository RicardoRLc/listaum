package listaum;

import java.util.Scanner;
//Exercicio6 - MEDIAVIAJEM
//6) Crie um programa que calcule a velocidade média de uma viagem (distancia (km) / tempo (h))

public class ListaUmExercicioSeis {
    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("By Ricardo");
        System.out.println("==============\n");

        float velmedia;
        float distancia;
        float tempo;
        Scanner scanner = new Scanner(System.in);
            System.out.println("Qual a distancia em KM:");
            distancia = scanner.nextFloat();
            System.out.println("Quantas horas de viagem?");
            tempo = scanner.nextFloat();
            velmedia = (distancia / tempo);
            System.out.println("velocidade media é: " + velmedia);
            System.out.println("\n===== FIM ====");
    }   
         

}