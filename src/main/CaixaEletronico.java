import java.util.Scanner;

public class CaixaEletronico {
    //notas de 2, 10, 20, 50

    public void retirar(int valor){
        int notas[] = {100,50,20,10,2};
        int resto = valor;
        int i = 0;
        int quantidadeDeNotas[] = new int[notas.length];
        //enquanto o resto for divisivel pelas notas a divisao contunua
        while (resto>0) {
            while (resto >= notas[i]) {
                resto -= notas[i];
                quantidadeDeNotas[i]++;
            }
            System.out.println("O numero de notas de R$"+notas[i] +" é " + quantidadeDeNotas[i]);
            i++;
        }
    }

}
