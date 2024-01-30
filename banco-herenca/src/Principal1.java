import exempl.herenca.banco.Conta;
import exempl.herenca.banco.Titular;

public class Principal1 {
    public static void main(String[] args) {
        Titular titular = new Titular("Marcus da Silva", "123456544565");
        Conta conta1 = new Conta(titular, 2234, 66798);


        conta1.imprimirDemonstrativo();

        conta1.depositar(300);

        conta1.imprimirDemonstrativo();

        conta1.sacar(30);

        conta1.imprimirDemonstrativo();


    }
}