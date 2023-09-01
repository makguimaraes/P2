public class Transacoes {

    double saldo = 0.0;

    public double ConsultarSaldo() {
        return saldo;
    }

    public void Deposito(double quantia) {
        saldo = saldo + quantia;
    }

    public void Saque(double quantia) {
        saldo = saldo - quantia;
    }

    public void Transferir(double quantia, String destinatario) {
        saldo = saldo - quantia;
    }
}
