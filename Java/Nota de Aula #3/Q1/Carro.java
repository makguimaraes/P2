public class Carro extends Veiculo{

    private int numPortas;

    public Carro() {
    }

    public Carro(String marca, String modelo, int anoFabricacao, int numPortas) {
        super(marca, modelo, anoFabricacao);
        this.numPortas = numPortas;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public void imprimirDetalhes() {
        System.out.println("Carro:");
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ano de Fabricação: " + this.getAnoFabricacao());
        System.out.println("Número de Portas: " + this.getNumPortas());
    }

}
