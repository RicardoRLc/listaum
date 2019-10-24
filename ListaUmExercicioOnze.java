import org.graalvm.compiler.nodes.extended.GetClassNode;

//Exercicio11
//11) Crie um programa que tenha uma variável com ponto em String e converta seu valor para inteiro


public class ListaUmExercicioOnze {
    public static void main(String[] args) {
        System.out.println("==============");
        System.out.println("By Ricardo");
        System.out.println("==============\n");

        String numero = "12.2";
        Float conversao = Float.parseFloat(numero);
        System.out.println("Conversão é:" +conversao);
        System.out.println("\n===== FIM ====");   
    }
}

