package algaworks;

import org.example.algaworks.Saudar;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/***
 * Usamos o Test no final da classe para o Maven entender
 * que essa classe é de Test e na hora do build eles serem executados
 */
public class AssertEqualsTest {

    @Test
    public void Dado_uma_hora_valida_Quando_saudar_Entao_deve_saudar_bom_dia() {

        //Arange
        int hora = 9;
        //Act
        String saudacao = Saudar.saudar(hora);
        //Assert
        assertEquals("Bom dia", saudacao, "Saudacao incorreta");

    }
}
