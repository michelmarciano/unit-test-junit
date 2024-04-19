package algaworks;

import org.assertj.core.api.Assertions;
import org.example.algaworks.Saudar;
import org.junit.jupiter.api.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class AssertJEqualsEncadeadoTest {

    @Nested
    @DisplayName("Teste Saudacao com Sucesso")
    public class SaudarComSucesso {
        @Test
        public void Dado_uma_hora_valida_Quando_saudar_Entao_deve_saudar_bom_dia(){

            //Arange
            String expected = "Bom dia";
            //Act
            String saudacao = Saudar.saudar(9);
            //Assert AssertJ
            Assertions.assertThat(saudacao)
                    .isNotBlank()
                    .isNotEmpty()
                    .isEqualTo(expected);
        }
    }
}
