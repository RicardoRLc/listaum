import java.util.Scanner;
//Exercicio8 - PARIMPAR
//  8) Crie um programa que teste se um valor é par ou ímpar 

public class ListaumExercicioOito {
    public static void main(String[] args) {

       System.out.println("==============");
        System.out.println("By Ricardo");
        System.out.println("==============\n");

        int num;
     Scanner scanner = new Scanner (System.in);
     System.out.println("Qual o número:");
     num = scanner.nextInt();
     if (num %=0) {
     System.out.println("É par.");    
     }  
     else {
     System.out.println("É impar.");
     System.out.println("\n===== FIM ====");    
     } 
    }

}