import java.util.Scanner;

public class Entrada {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor a ser sacado: ");
        int valor = entrada.nextInt();
        CaixaEletronico caixa = new CaixaEletronico();
        caixa.retirar(valor);


//        Conta conta = new Conta();
//        conta.adicionarChavePix("meu@email.com");
//        conta.adicionarChavePix("379");
//        conta.adicionarChavePix("(19)992219299");
//        System.out.println(conta.getChavePix(0));




    }
}





//        Conta ContaCorrente = new Conta();
//        ContaCorrente.adicionarChavePix("1999");
//        ContaCorrente.setNomeCorrentista("Amanda Sacchi");
//        ContaCorrente.setNumeroConta("000001-0");
//        ContaCorrente.setNumeroAgencia("01");
//
//        System.out.println("saldo: R$"+ ContaCorrente.getSaldo());
//        System.out.println("Chave PIX " + ContaCorrente.getChavePix());
//        System.out.println("Correntista: " + ContaCorrente.getNomeCorrentista());
//
//
//        Conta contaDaAna = new Conta();
//        contaDaAna.depositar(100);
//        contaDaAna.adicionarChavePix("email");
//
//        Conta contaDaGi = new Conta();
//        contaDaGi.depositar(15);