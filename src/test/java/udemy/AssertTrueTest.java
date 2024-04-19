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
public class AssertTrueTest {

    @DisplayName("Quando realizar um aluguel")
    @Nested
    class QuandoRealizarUmAluguel {

        @DisplayName("Entao deve retornar o valor com sucesso")
        @Test
        void entaoDeveAlugarcomSucesso() {

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

            //Assert
            Assertions.assertTrue(primeiraLocacao.getFilme().getPreLocacao().equals(10.0));

        }

    }
}
