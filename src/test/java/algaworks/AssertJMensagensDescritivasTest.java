package algaworks;

import org.assertj.core.api.Assertions;
import org.example.algaworks.Saudar;
import org.junit.jupiter.api.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class AssertJMensagensDescritivasTest {

    @Nested
    @DisplayName("Teste Saudacao com Sucesso")
    class SaudarComSucesso {
        @Test
        public void Dado_uma_hora_valida_Quando_saudar_Entao_deve_saudar_bom_dia(){

            //Arange
            String expected = "Bom dia";

            //Act
            String saudacao = Saudar.saudar(9);

            //Assert AssertJ
            Assertions.assertThat(saudacao)
                    //O as é uma descrição
                    .as("Validando se a saudacao é %s", saudacao)
                    //O withFailMessage é uma mensagem descritiva
                    .withFailMessage("Erro: Saudacao incorreta! Resultado %s", saudacao)
                    //O isEqualTo é a compracao que faremos
                    .isEqualTo(expected);

        }
    }
}
