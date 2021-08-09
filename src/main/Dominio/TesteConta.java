import org.junit.jupiter.api.Assertions;
import  org.junit.jupiter.api.Test;

public class TesteConta extends Conta{
    @Test
    void deveSerPossivelCriarUmaConta() {
        //preparação e execução
        Conta conta = new Conta();
        //validação
        Assertions.assertTrue(conta != null);
    }

    @Test
            void deveSerPssivelAdicionarUmaChavePix() {
        //preparação
        Conta conta = new Conta();
        //execução
        conta.adicionarChavePix("email@email.com");
        //validação
        Assertions.assertTrue(conta.getChavePix(0).equals("email@email.com"));
    }

    @Test
    void deveSerPossivelSacarQuandoTemLimite(){
        //preparação
        Conta conta = new Conta();
        conta.depositar(1000);
        //execução
        conta.sacar(200);
        //validação
        Assertions.assertTrue(conta.consultarSaldo() == 800);
    }




}
