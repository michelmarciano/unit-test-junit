package algaworks;

import org.example.algaworks.Saudar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AssertThrowsTest {

    @Test
    public void deveLancarUmaException(){
        String expected = "Hora invalida";
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
                () -> Saudar.saudar(-10));

        assertEquals(expected, illegalArgumentException.getMessage());
    }
}
