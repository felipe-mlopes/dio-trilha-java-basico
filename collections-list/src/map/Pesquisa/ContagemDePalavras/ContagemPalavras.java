package map.Pesquisa.ContagemDePalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!contagemPalavrasMap.isEmpty()) {
            contagemPalavrasMap.remove(palavra);
        } else {
            System.out.println("O Map está vazio.");
        }
    }

    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        
        for (int contagem : contagemPalavrasMap.values()) {
            contagemTotal += contagem;
        }

        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorContagem = 0;

        for (Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }

        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Java", 5);
        contagemPalavras.adicionarPalavra("Typescript", 8);
        contagemPalavras.adicionarPalavra("Ruby", 3);
        contagemPalavras.adicionarPalavra("Phyton", 6);

        System.out.println("Existem " + contagemPalavras.exibirContagemPalavras() + " palavras.");

        String palavraMaisFrequente = contagemPalavras.encontrarPalavraMaisFrequente();
        System.out.println("A palavra mais frequente é: " + palavraMaisFrequente);
    }
}
