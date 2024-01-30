package exempl.herenca.banco;

public class ContaInvestimento extends Conta {

    private double valorTotalRendimento;


    public double getValorTotalRendimento() {
        return valorTotalRendimento;
    }

    @Override
    public boolean possuirGratuidadeImmpressao() {
        return getValorTotalRendimento() > 0;

    }

    public ContaInvestimento(Titular titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    public void creditarRendimento(double percentualJuros) {


        double valorRendimentos = getSaldo() * percentualJuros / 100;
        this.valorTotalRendimento += valorRendimentos;
        depositar(valorRendimentos);

    }

    @Override
    public String toString() {
        return "ContaInvestimento {" +
                " titular = " + getTitular().getNome() +
                ", agencia = " + getAgencia() +
                ", numero = " + getNumero() +
                ", valorTotalRendimento = " + valorTotalRendimento +
                '}';
    }


}


