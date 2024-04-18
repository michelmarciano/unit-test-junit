package algaworks;

import org.example.algaworks.Pessoa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertAll {

    @Test
    public void deveRealizarAssercaoAgrupada(){
        String nameExpected = "mike";
        int idadeExpected = 39;
        Pessoa pessoa = new Pessoa("mike", 39);

        assertAll(
                () -> assertEquals(nameExpected, pessoa.getNome()),
                () -> assertEquals(idadeExpected, pessoa.getIdade())
        );
    }
}
