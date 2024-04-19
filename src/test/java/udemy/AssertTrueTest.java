package udemy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import udemy.negocio.*;

@DisplayName("Dado dois numeros inteiros")
public class AssertTrueTest {

    @DisplayName("Quando somar")
    @Nested
    class QuandoSomar {

        @DisplayName("Entao deve retornar a soma ")
        @Test
        void entaoDeveAlugarcomSucesso() {

            //Arange(cenario)
            Soma soma = new Soma();

            //Act
            int calc = soma.calc(2, 4);

            //Assert
            Assertions.assertEquals(6, calc);

        }

    }
}
