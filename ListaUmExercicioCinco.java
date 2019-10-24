
import java.util.Scanner;

//Exercicio5 - BHASKARA
//5) Crie um programa que calcule _bhaskara_

public class ListaUmExercicioCinco {
    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("By Ricardo");
        System.out.println("==============\n");

        float a, b, c, delta, x1, x2;

        System.out.println("Digite o valor de A:");
        Scanner in = new Scanner(System.in);
        a = in.nextFloat();

        System.out.println("Digite o valor de B:");
        b = in.nextFloat();

        System.out.println("Digite o valor de C:");
        c = in.nextFloat();

        in.close();
        delta = b * b - 4 * a * c;
        System.out.println("\n Valor de Delta é: " + delta);

        if (delta > 0) { // se condicao for verdadeira executa
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            // x= -b +/-
            // Raiz de delta
            // (div/) por 2 * a

            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));// x"
            // Math.sqrt
            // calcula a
            // raiz, raiz do
            // reaultado de
            // delta

            System.out.println("Valor de X1 e = " + x1 + "\n Valor de X2 e = " + x2);

        } else {
            System.out.println("Não e possivel calcular esta Raiz, não e um numero real ");

        }
        System.out.println("\n===== FIM ====");
    }

}
