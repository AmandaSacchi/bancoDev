public class ContaInvestimento extends Conta{

    public void invertir(float valorInvestido){
        setSaldo((float) ((valorInvestido *1.1)+getSaldo()));
    }

}
