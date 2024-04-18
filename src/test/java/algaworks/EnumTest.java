package algaworks;

import org.example.algaworks.Multiplicador;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class EnumTest {

    @ParameterizedTest
    @EnumSource(value = Multiplicador.class, names = {"DOBRO", "TRIPLO", "QUADRUPLO"})
    void aplicarMultiplicador(Multiplicador multiplicador){

        Assertions.assertNotNull(multiplicador.aplicarMultiplicador(10.0));
    }

    @ParameterizedTest
    @EnumSource(value = Multiplicador.class)
    void deveTestarTodosOsvaloresDoEnum(Multiplicador multiplicador){

        Assertions.assertNotNull(multiplicador.aplicarMultiplicador(10.0));
    }
}
