package algaworks;

import org.example.algaworks.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

@DisplayName("Display name pode ser usado em classe")
public class AnnotationDisplayNameTest {

    @Test
    @DisplayName("Display name pode ser usado em metodo")
    public void desabilitaTest(){
        Pessoa pessoa = new Pessoa("mike", 39);

        int expectedidade = 39;

        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(1), () -> Assertions.assertEquals(expectedidade, pessoa.getIdade()));
    }


}
