package dominio;

public class Conta {
    private String numeroConta;
    private String numeroAgencia;
    private String chavePix[] = new String[3];
    private float saldo;
    private int chequeEspecial = 500;

    public float consultarSaldo() {
        return saldo;
    }
    public void depositar(float saldo) {
        this.saldo = saldo;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public void adicionarChavePix(String chavePix){
        int i = 0;
        if (i < this.chavePix.length){
            while (this.chavePix[i] !=null) {
                i++;
            }
            this.chavePix[i] = chavePix;
        }else {
            System.out.println("Todas as chaves já cadastradas");
        }
    }

    public String getChavePix(int posicao) {
        return chavePix[posicao];
    }

    public void sacar(float valorSaque){
        this.saldo -= valorSaque;
    }

   public void transferir(float valorDaTransf, Conta outraConta) {
       sacar(valorDaTransf);
       outraConta.depositar(valorDaTransf);
    }

}


