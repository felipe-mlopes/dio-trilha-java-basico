package map.Ordenacao.LivrariaOnline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        List<String> chavesRemover = new ArrayList<>();

        for (Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                chavesRemover.add(entry.getKey());
            }
        }

        for (String chave : chavesRemover) {
            livrosMap.remove(chave);
        }
    }

    public void exibirLivrosOrdenadosPorPreco() {
        Map<String, Livro> livrosTreeMap = new TreeMap<>(livrosMap);
        System.out.println(livrosTreeMap);
    }
    
    public void pesquisarLivrosPorAutor(String autor) {
        if (!livrosMap.isEmpty()) {
            for (Map.Entry<String, Livro> livro : livrosMap.entrySet()) {
                if (livro.getValue().getAutor().equalsIgnoreCase(autor)) {
                     System.out.println(livro.getValue());
                }
            }
        } else {
            System.out.println("O livro não foi encontrado.");
        }
    }

    public Livro obterLivroMaisCaro() {
        Livro livroMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if (!livrosMap.isEmpty()) {
            for (Map.Entry<String, Livro> livro : livrosMap.entrySet()) {
                if (livro.getValue().getPreco() > maiorPreco) {
                    livroMaisCaro = livro.getValue();
                    maiorPreco = livro.getValue().getPreco();
                }
            }
        }

        return livroMaisCaro;
    }

    public Livro exibirLivroMaisBarato() {
        Livro livroMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        if (!livrosMap.isEmpty()) {
            for (Map.Entry<String, Livro> livro : livrosMap.entrySet()) {
                if (livro.getValue().getPreco() < menorPreco) {
                    livroMaisBarato = livro.getValue();
                    menorPreco = livro.getValue().getPreco();
                }
            }
        }

        return livroMaisBarato;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("https://www.livraria.com/livro-01", "Livro 01", "Autor 01", 67.80);
        livrariaOnline.adicionarLivro("https://www.livraria.com/livro-02", "Livro 02", "Autor 01", 45.90);
        livrariaOnline.adicionarLivro("https://www.livraria.com/livro-03", "Livro 03", "Autor 02", 134.50);
        livrariaOnline.adicionarLivro("https://www.livraria.com/livro-04", "Livro 04", "Autor 02", 20.35);

        livrariaOnline.exibirLivrosOrdenadosPorPreco();

        livrariaOnline.pesquisarLivrosPorAutor("Autor 01");

        livrariaOnline.removerLivro("Livro 04");
        livrariaOnline.exibirLivrosOrdenadosPorPreco();

        System.out.println("O livro mais caro é: " + livrariaOnline.obterLivroMaisCaro());
        System.out.println("O livro mais caro é: " + livrariaOnline.exibirLivroMaisBarato());
    }
}
