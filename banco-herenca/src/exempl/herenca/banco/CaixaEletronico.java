package exempl.herenca.banco;

public class CaixaEletronico {

    public static final double TARIFA_TRANSFERENCIA = 25;

    public static final double TARIFA_IMPRESSAO_DEMOSNTRATIVO = 15;

    public void transferir(Conta contaOrigem, Conta contaDestino, double valorTransferencia) {
        System.out.printf("Transferindo R$%.2f da conta %d%d para %d%d%n", valorTransferencia, contaOrigem.getAgencia(), contaOrigem.getNumero(), contaDestino.getAgencia(), contaDestino.getNumero());

        contaOrigem.sacar(valorTransferencia + TARIFA_TRANSFERENCIA);
        contaDestino.depositar(valorTransferencia);


    }

    public void imprimirDesmonstrativo(Conta conta) {
        if (conta.possuirGratuidadeImmpressao()) {
            System.out.println("Impressão desmontrativo gratuita");
        } else {
            DebitarTarifaDemonsTrativo(conta);
        }
        conta.imprimirDemonstrativo();
    }


    private static void DebitarTarifaDemonsTrativo(Conta conta) {
        System.out.printf("Custo de impressâo: R$%.2f%n", TARIFA_IMPRESSAO_DEMOSNTRATIVO);
        conta.sacar(TARIFA_IMPRESSAO_DEMOSNTRATIVO);
    }

}
