package udemy.negocio;

import java.util.Date;

import static udemy.negocio.DataUtils.adicionarDias;

public class LocacaoService {

    public Locacao alugarFilme(Usuario usuario, Filme filme){
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
