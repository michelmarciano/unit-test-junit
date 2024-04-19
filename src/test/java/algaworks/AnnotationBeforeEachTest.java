package algaworks;

import org.example.algaworks.blog.modelo.Editor;
import org.example.algaworks.blog.modelo.Ganhos;
import org.example.algaworks.blog.modelo.Post;
import org.example.algaworks.blog.negocio.CalculadoraGanhos;
import org.example.algaworks.blog.utilidade.ProcessadorTextoSimples;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class AnnotationBeforeEachTest {

    static CalculadoraGanhos calculadora;
    Editor autor;
    Post post;

    @BeforeEach
    void beforeEach() {
        autor = new Editor(1l, "mike", "michel.marciano1984@gmail.com", new BigDecimal(5), true);
        post = new Post(1l, "Ecossistema Java", "O ecossistema do java é muito maduro", autor, "ecossistem-java-abc", null, false, false);
        calculadora = new CalculadoraGanhos(new ProcessadorTextoSimples(), BigDecimal.TEN);
    }

    @Test
    public void deveCalcularGanhos() {

        Ganhos ganhos = calculadora.calcular(post);

        Assertions.assertEquals(new BigDecimal(45), ganhos.getTotalGanho());
    }

    @Test
    public void deveCalcularGanhosSemPremium() {
        autor.setPremium(false);

        Ganhos ganhos = calculadora.calcular(post);

        Assertions.assertEquals(new BigDecimal(35), ganhos.getTotalGanho());
    }
}
