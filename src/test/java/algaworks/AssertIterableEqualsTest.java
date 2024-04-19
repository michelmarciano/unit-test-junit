package algaworks;

import org.example.algaworks.Listas;
import org.example.algaworks.Saudar;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

public class AssertIterableEqualsTest {
        @Test
        public void Dado_uma_lista_de_inteiros_Quando_filtrar_Entao_deve_retornar_numeros_pares(){

            List<Integer> experado = Arrays.asList(2, 4, 6, 8, 10);

            //Arange
            List<Integer> numerosInteiros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 10);
            //Act
            List<Integer> list = Listas.retornaNumerosPares(numerosInteiros);
            //Assert AssertJ
            Assertions.assertIterableEquals(experado, list);

    }
}
