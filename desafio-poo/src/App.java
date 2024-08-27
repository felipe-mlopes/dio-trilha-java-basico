import aparelhos.IPhone;
import aplicativos.AparelhoTelefonico;
import aplicativos.NavegadorInternet;
import aplicativos.ReprodutorMusical;

public class App {
    public static void main(String[] args) throws Exception {

        IPhone iphone = new IPhone();

        AparelhoTelefonico ligacao = iphone;
        NavegadorInternet web = iphone;
        ReprodutorMusical musica = iphone;

        System.out.println("--- LIGAÇÃO ---");
        ligacao.ligar("21 99999-9999");
        ligacao.atender();
        ligacao.iniciarCorreioVoz();

        System.out.println("--- WEB ---");
        web.exibirPagina("https://www.google.com.br");
        web.adicionarNovaAba();
        web.atualizarPagina();

        System.out.println("--- MÚSICA ---");
        musica.selecionarMusica("Bla bla");
        musica.tocar();
        musica.pausar();
    }
}
