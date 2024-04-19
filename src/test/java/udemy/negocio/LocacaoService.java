package udemy.negocio;

import java.util.Date;

import static udemy.negocio.DataUtils.adicionarDias;

public class LocacaoService {

    public Locacao alugarFilme(Usuario usuario, Filme filme) throws Exception {
        if(filme.getEstoque() == 0){
            throw new Exception("Sem estoque");
        }
        Date dataAtual = new Date();

        Locacao locacao = new Locacao();
        locacao.setFilme(filme);
        locacao.setUsuario(usuario);
        locacao.setDataLocacao(dataAtual);
        locacao.setValor(filme.getPreLocacao());

        adicionarDias(dataAtual, 1);

        return locacao;
    }
}
