package dominio;
import static util.Validador.validaCPF;

public class Cliente{
    private String cpfCorrentista;
    private String nomeCorrentista;

    public String getCpfCorrentista() {
        return cpfCorrentista;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public Cliente(String nome, String cpf) {
        if (validaCPF(cpf)){
            this.cpfCorrentista = cpf;
            this.nomeCorrentista = nome;
        }else{

        }
    }
}
