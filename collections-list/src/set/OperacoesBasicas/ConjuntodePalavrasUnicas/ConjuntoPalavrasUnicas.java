
import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        String palavraParaRemover = null;

        for (String p : palavrasUnicas) {
            if (p.equalsIgnoreCase(palavra)) {
                palavraParaRemover = p;
                break;
            }
        }

        palavrasUnicas.remove(palavraParaRemover);
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasUnicas);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Leão");
        conjuntoPalavrasUnicas.adicionarPalavra("Urso");
        conjuntoPalavrasUnicas.adicionarPalavra("Ganso");
        conjuntoPalavrasUnicas.adicionarPalavra("Pato");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Urso");

        System.out.println("A palavra Ganso está contida no conjunto: " + conjuntoPalavrasUnicas.verificarPalavra("Ganso"));
        System.out.println("A palavra Cachorro está contida no conjunto: " + conjuntoPalavrasUnicas.verificarPalavra("Cachorro"));

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
