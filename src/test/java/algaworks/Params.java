package algaworks;

import org.example.algaworks.Saudar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Testes com Parametros")
public class Params {

    @Nested
    @DisplayName("Dado um horario Matutivo")
    class DadoUmHoraioMatutino {

        @Nested
        @DisplayName("Quando saudar")
        class QuandoSaudar{


            @ParameterizedTest
            @ValueSource(ints = { 1,2,3,4,5,6,7,8})
            @DisplayName("Entao devolve Bom dia")
            public void deveDevolverBomDia(int hora){
                String saudar = Saudar.saudar(hora);
                Assertions.assertEquals("Bom dia", saudar);
            }
        }


    }
}
