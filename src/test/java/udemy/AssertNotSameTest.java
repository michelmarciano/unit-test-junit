package udemy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import udemy.negocio.Filme;
import udemy.negocio.Locacao;
import udemy.negocio.LocacaoService;
import udemy.negocio.Usuario;

@DisplayName("Dado um filme")
public class AssertNotSameTest {

    @Nested
    @DisplayName("Quando Alugar")
    class QuandoAlugar {


        @DisplayName("Entao deve alugar com sucesso")
        @Test
        void deveRetornarComSucesso() throws Exception {
            //Arange(cenario)

            Usuario usuario = new Usuario();
            usuario.setNome("Mike");

            Filme filme = new Filme();
            filme.setNome("velozes e furiosos");
            filme.setPreLocacao(10.0);
            filme.setEstoque(1);

            Locacao locacao = new Locacao();
            locacao.setFilme(filme);
            locacao.setUsuario(usuario);

            //Act
            LocacaoService locacaoFilme = new LocacaoService();
            Locacao primeiraLocacao = locacaoFilme.alugarFilme(usuario, filme);
            Locacao segundaLocacao = locacaoFilme.alugarFilme(usuario, filme);

            //Assert
            Assertions.assertNotSame(segundaLocacao, primeiraLocacao);


        }
    }
}
