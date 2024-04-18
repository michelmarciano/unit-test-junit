package algaworks;

import org.example.algaworks.Saudar;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/***
 * Usamos o Test no final da classe para o Maven entender
 * que essa classe é de Test e na hora do build eles serem executados
 */
public class AssertTrueTest {
    @Test
    public void Dado_uma_hora_valida_Quando_saudar_Entao_deve_saudar_bom_dia() {

        //Arange
        String expected = "Bom dia";
        //Act
        String saudacao = Saudar.saudar(9);
        //Assert
        assertTrue(saudacao == expected);

    }
}
