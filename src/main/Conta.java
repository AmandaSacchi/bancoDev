public class Conta {
    private String numeroConta;
    private String numeroAgencia;
    private float saldo;
    private String chavePix[] = new String[3];
    private String tipoConta = "corrente";
    private String cpfCorrentista;
    private String nomeCorrentista;

    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }
    public void setNomeCorrentista(String correntista) {
        this.nomeCorrentista = correntista;
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

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void depositar(float valorDeposito) {
        setSaldo(saldo + valorDeposito);
    }

//    public void transferir(float valorDaTransf, Conta outraConta) {
//        sacar(valorDaTransf);
//        outraConta.depositar(valorDaTransf);
//    }

}


