public class Main {

    public static void main(String[] args) {

        Gerente g1 = new Gerente("Augusto", 5000.00, "Finanças");
        Diretor d1 = new Diretor("Milton", 10000.00, 1000);

        System.out.println("Gerente:");
        System.out.println("Nome: " + g1.getNome());
        System.out.println("Salário: " + g1.getSalario());
        System.out.println("Departamento: " + g1.getDepartamento());

        System.out.println();

        System.out.println("Diretor:");
        System.out.println("Nome: " + d1.getNome());
        System.out.println("Salário: " + d1.getSalario());
        System.out.println("Número de ações: " + d1.getAcoes());

    }

}
