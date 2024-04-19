package algaworks;

import org.example.algaworks.Saudar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class AssertDoesNotExceptionTest {

    @Test
    public void Dado_uma_hora_valida_Quando_saudar_Entao_deve_nao_deve_lancar_uma_exception(){
        int horaValida = 10;
        assertDoesNotThrow(()-> Saudar.saudar(horaValida));
    }
}
