public class Gerente extends Funcionario{

    private String departamento;
    private double bonus;

    public Gerente() {
    }

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double calcularBonus() {
        bonus = getSalario()*0.1;
        return bonus;
    }

}
