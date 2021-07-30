import org.junit.jupiter.api.Assertions;
import  org.junit.jupiter.api.Test;

public class ContaTeste extends Conta{
    @Test
    void deveSerPossivelRealizarSaqueQundoTenhoSaldo(){
        Conta conta = new Conta();
        conta.depositar(100);
//        conta.sacar(100);
        Assertions.assertTrue(conta.getSaldo() == 0);
    }
}
