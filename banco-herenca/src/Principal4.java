import exempl.herenca.banco.Conta;
import exempl.herenca.banco.ContaEspecial;
import exempl.herenca.banco.ContaInvestimento;
import exempl.herenca.banco.Titular;

public class Principal4 {

    public static void main(String[] args) {
        Titular titular = new Titular("Vinicius da Silva", "223344567888");
       Conta conta1 = new Conta(titular, 6677, 344);

//   ContaInvestimento contaInvestimento = new ContaInvestimento(titular, 6677, 344);

//        ContaEspecial contaEspecial = new ContaEspecial(titular, 558, 990, 30);
        System.out.println("Sua conta é: " + conta1);

    }
}
