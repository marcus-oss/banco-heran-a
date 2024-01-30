import exempl.herenca.banco.ContaInvestimento;
import exempl.herenca.banco.Titular;

public class Principal2 {

    public static void main(String[] args) {
        Titular titular = new Titular("Vinicius da Silva", "223344567888");
        ContaInvestimento conta2 = new ContaInvestimento(titular, 664732, 567899);


        conta2.imprimirDemonstrativo();

        conta2.depositar(500);

        conta2.imprimirDemonstrativo();

        conta2.sacar(130);

        conta2.imprimirDemonstrativo();

        conta2.creditarRendimento(7);

        conta2.imprimirDemonstrativo();

    }
}
