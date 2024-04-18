package algaworks;

import org.example.algaworks.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class AnnotationDisabled {

    @Test
    @Disabled("Não será mais usado até corrigir o bug")
    public void desabilitaTest(){
        Pessoa pessoa = new Pessoa("mike", 39);

        int expectedidade = 39;

        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(1), () -> Assertions.assertEquals(expectedidade, pessoa.getIdade()));
    }


}
