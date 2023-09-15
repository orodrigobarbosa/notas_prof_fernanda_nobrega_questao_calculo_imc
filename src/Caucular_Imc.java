import java.util.Scanner;
public class Caucular_Imc {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Pessoa op = new Pessoa();

        float imc = 0;

        System.out.println("Digite seu peso: ");
        op.setPeso(teclado.nextFloat());


        System.out.println("Digite sua altura: ");
        op.setAltura(teclado.nextFloat());

        imc = (op.getPeso()/(op.Altura *op.getAltura()));

        System.out.println("Peso: " + op.getPeso());
        System.out.println("Altura: " + op.getAltura());
        System.out.println("Seu IMC É: " + imc );


        }

}
