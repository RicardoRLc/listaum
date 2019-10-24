
import java.util.Scanner;
//Exercicio7 - IMPOSTO
// 7) Crie um programa que calcule o percentual de imposto pago (faturamento \ qtd imposto)

public class ListaUmExercicioSete {
    public static void main(String[] args) {
        System.out.println("==============");
        System.out.println("By Ricardo");
        System.out.println("==============\n");

        Scanner scanner = new Scanner (System.in);   
        float pip;
        float faturamento;
        float qtimposto;
    
     System.out.println("Qual o faturamento:");
     faturamento = scanner.nextFloat();
     System.out.println("Quantidade de imposto pago?:");
     qtimposto = scanner.nextFloat();
     scannner.close();   
       pip = ( faturamento / qtimposto);
    System.out.println("Seu percentual de imposto pago  é: " + pip); 
    System.out.println("\n===== FIM ====");
    }

}
