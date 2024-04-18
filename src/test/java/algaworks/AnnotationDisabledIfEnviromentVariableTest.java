package algaworks;

import org.example.algaworks.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;

import java.time.Duration;

public class AnnotationDisabledIfEnviromentVariableTest {

    @Test
    @DisabledIfEnvironmentVariable(named = "ENV", matches = "PROD")
    public void desabilitaTest(){
        Pessoa pessoa = new Pessoa("mike", 39);

        int expectedidade = 39;

        Assumptions.assumeTrue("PROD".equals(System.getenv("ENV")), () -> "Abortado teste: Não deve ser executado Prod");
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(1), () -> Assertions.assertEquals(expectedidade, pessoa.getIdade()));
    }


}
