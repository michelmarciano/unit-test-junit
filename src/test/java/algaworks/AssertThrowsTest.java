package algaworks;

import org.example.algaworks.Saudar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AssertThrowsTest {

    @Test
    public void Dado_uma_hora_invalida_Quando_saudar_Entao_deve_lancar_uma_exception(){
        int horaInvalida = -10;
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
                () -> Saudar.saudar(horaInvalida));

        assertEquals("Hora invalida", illegalArgumentException.getMessage());
    }
}
