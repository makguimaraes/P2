public class Imc {

    private double peso;
    private double altura;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double imcPessoa () {

        double vlrIMC = getPeso() / Math.pow(getAltura(), 2);
        return vlrIMC;

    }
    
}
