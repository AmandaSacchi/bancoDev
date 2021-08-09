package dominio;

public class ContaInvestimento extends Conta{

    public void invertir(float valorInvestido){
        depositar((float) ((valorInvestido *1.1)+consultarSaldo()));
    }

}
