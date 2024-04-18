package algaworks;

import org.example.algaworks.Saudar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class AssertTimeout {

    @Test
    public void deveValidarTempoExecucao(){
        List<Integer> expected = Arrays.asList(2,4,6,8,10);

        //cenario
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //validacao
        List<Integer> listaAtual = Saudar.inteiros(list);

        assertIterableEquals(expected, listaAtual);
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(1), () -> Saudar.inteiros(list));
    }
}
