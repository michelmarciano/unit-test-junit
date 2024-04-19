package algaworks;

import org.example.algaworks.Listas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class AnnotationDisplayNameGenerationTest {

    @Test
    public void Dado_uma_lista_de_inteiros_Quando_filtrar_Entao_deve_retornar_numeros_pares() {

        List<Integer> experado = Arrays.asList(2, 4, 6, 8, 10);

        //Arange
        List<Integer> numerosInteiros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 10);
        //Act
        List<Integer> list = Listas.retornaNumerosPares(numerosInteiros);
        //Assert AssertJ
        Assertions.assertArrayEquals(experado.toArray(), list.toArray());

    }

}