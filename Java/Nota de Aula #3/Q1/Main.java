import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Carro c1 = new Carro("Citroen", "C3", 2020, 4);
        Moto m1 = new Moto("Honda", "CG125", 2020, 125);

        c1.imprimirDetalhes();

        System.out.println();

        m1.imprimirDetalhes();

    }

}
