package algaworks;

import org.example.algaworks.Saudar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class AssertDoesNotExceptionTest {

    @Test
    public void naoDeveLancarException(){
        assertDoesNotThrow(()-> Saudar.saudar(9));
    }
}
