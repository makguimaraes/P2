import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Imc imc = new Imc();

        System.out.print("Informe o peso: ");
        imc.setPeso(sc.nextDouble());

        System.out.print("Informe a altura: ");
        imc.setAltura(sc.nextDouble());

        System.out.printf("A pessoa com %.2f kg e %.2f m tem imc de %.2f.", imc.getPeso(), imc.getAltura(), imc.imcPessoa());
    }

}
