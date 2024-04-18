package algaworks;

import org.example.algaworks.Saudar;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class AssertEquals {

    @Nested
    @DisplayName("Teste Saudacao com Sucesso")
    class SaudarComSucesso {
        @Test
        public void Dado_uma_hora_valida_Quando_saudar_Entao_deve_saudar_bom_dia(){

            //Arange
            String expected = "Bom dia";

            //Act
            String saudacao = Saudar.saudar(9);

            //Assert
            assertEquals(expected, saudacao, "Saudacao incorreta" );

        }
    }
}
