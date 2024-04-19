package algaworks;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.example.algaworks.Saudar.saudar;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@ExtendWith(MockitoExtension.class)
public class AssertJThrowsTest {

    @Nested
    @DisplayName("Teste Saudacao com Sucesso")
    class SaudarComSucesso {

        @Test
        public void deveLancarUmaException(){
            int expected = -10;

            IllegalArgumentException e = Assertions.catchThrowableOfType(() -> saudar(expected), IllegalArgumentException.class);
            // O hasMessage compara a mensagem lançada
            assertThat(e).hasMessage("Hora invalida");
        }
    }
}
