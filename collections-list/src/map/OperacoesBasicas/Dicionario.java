package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicaoDaPalavraEncontrada = null;

        if (!dicionarioMap.isEmpty()) {
            definicaoDaPalavraEncontrada = dicionarioMap.get(palavra);
        }

        return definicaoDaPalavraEncontrada;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("constituição", "Ato, processo ou efeito de constituir.");
        dicionario.adicionarPalavra("justiça", "Prática e exercício do que é de direito.");
        dicionario.adicionarPalavra("força", "Faculdade de operar, de executar, de mover, etc.");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("constituição");
        dicionario.exibirPalavras();

        System.out.println("A definição da palavra encontrada é: " + dicionario.pesquisarPorPalavra("força"));
    }
}
