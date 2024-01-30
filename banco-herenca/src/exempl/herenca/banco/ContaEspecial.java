package exempl.herenca.banco;

public class ContaEspecial extends ContaInvestimento {

    private double tarifaMensal;
    private double limiteChequeEspecial;

    public ContaEspecial(Titular titular, int agencia, int numero, double tarifaMensal) {
        super(titular, agencia, numero);
        this.tarifaMensal = tarifaMensal;
    }

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }


    public double getSaldodisponivel() {
        return getSaldo() + getLimiteChequeEspecial();
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {


        this.limiteChequeEspecial = limiteChequeEspecial;
    }


    @Override
    public final void imprimirDemonstrativo() {

        super.imprimirDemonstrativo();
        System.out.printf("Saldo disponivel: %.2f%n", getSaldodisponivel());
    }

    @Override
    protected void validarsaldoparaSaque(double valorSaque) {
        if (getSaldodisponivel() < valorSaque) {
            throw new RuntimeException("Saldo insuficiente para saque");
        }

    }

    public void debitarTarifaMensal() {
        sacar(getTarifaMensal());

    }

    @Override
    public String toString() {
        return "ContaEspecial {" +
                " titular = " + getTitular().getNome()+
                ", agencia = " + getAgencia() +
                ", numero = " + getNumero() +
                ", valorTotalRendimento =" + getValorTotalRendimento() +
                ", tarifa mensal: " + tarifaMensal +
                ", limite cheque especial" + limiteChequeEspecial +
                '}';
    }

}
