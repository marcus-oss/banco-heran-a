import exempl.herenca.banco.*;


public class Principal {
    public static void main(String[] args) {
//        Titular titular = new Titular("Marcus da Silva", "123456544565");
//        Conta conta = new ContaSalario(titular, 1234, 6565);


        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial(new Titular("João da Silva", "12312312300"),
                1234, 999999, 90);
        conta1.setLimiteChequeEspecial(1000);
        conta1.depositar(19);
        conta1.creditarRendimento(9);

        ContaInvestimento conta2 = new ContaInvestimento(new Titular("João da Silva", "12312312300"),
                1234, 999999);

        conta2.depositar(120);
        conta2.creditarRendimento(23);

        ContaSalario conta3 = new ContaSalario(new Titular("João da Silva", "12312312300"),
                1234, 999999);

        conta3.depositar(200);

        caixaEletronico.imprimirDesmonstrativo(conta1);

    }


}
