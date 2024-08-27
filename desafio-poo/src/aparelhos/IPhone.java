package aparelhos;

import aplicativos.AparelhoTelefonico;
import aplicativos.NavegadorInternet;
import aplicativos.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Tocar música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionar a música " + musica);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibir a página com endereço: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar página");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligar para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atender");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz");
    }
    
}
