package exempl.herenca.banco;

public class ContaSalario extends Conta {

    private double salarioMnesal;

    public ContaSalario(Titular titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    public double getSalarioMnesal() {
        return salarioMnesal;
    }

    public void setSalarioMnesal(double salarioMnesal) {
        this.salarioMnesal = salarioMnesal;
    }
}
