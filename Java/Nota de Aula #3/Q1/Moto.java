public class Moto extends Veiculo{

    private int cilindradas;

    public Moto() {
    }

    public Moto(String marca, String modelo, int anoFabricacao, int cilindradas) {
        super(marca, modelo, anoFabricacao);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void imprimirDetalhes() {
        System.out.println("Moto:");
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ano de Fabricação: " + this.getAnoFabricacao());
        System.out.println("Cilindradas: " + this.getCilindradas());
    }

}
