package map.Ordenacao.LivrariaOnline;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LivrariaOnline {
    private Map<String, Livro> livrosMap;

    public LivrariaOnline() {
        this.livrosMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        Livro livro = new Livro(titulo, autor, preco);
        livrosMap.put(link, livro);
    }

    public void removerLivro(String titulo) {
        if (!livrosMap.isEmpty()) {
            livrosMap.remove(titulo);
        }
    }

    public void exibirLivrosOrdenadosPorPreco() {
        Map<String, Livro> livrosTreeMap = new TreeMap<>(livrosMap);
        System.out.println(livrosTreeMap);
    }
    
    public void pesquisarLivrosPorAutor(String autor) {}

    public void obterLivroMaisCaro() {}

    public void exibirLivroMaisBarato() {}

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("https://encurtador.com.br/JasMO", "Storytelling com dados: vamos praticar", "Cole Nussbaumer Knaflic", 67.80);

        livrariaOnline.exibirLivrosOrdenadosPorPreco();
    }
}
