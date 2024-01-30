import exempl.herenca.banco.ContaEspecial;
import exempl.herenca.banco.Titular;


public class Principal3 {

    public static void main(String[] args) {
        Titular titular = new Titular("Vinicius da Silva", "223344567888");
        ContaEspecial conta2 = new ContaEspecial(titular, 567899, 664732, 30);


        conta2.depositar(100);


        conta2.imprimirDemonstrativo();

//        conta2.depositar(200);
//        conta2.sacar(300);
//        conta2.imprimirDemonstrativo();


    }
}
