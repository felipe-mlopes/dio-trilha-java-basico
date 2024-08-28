package list.Ordenacao.OrdenacaoDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendentes = new ArrayList<>(numeros);

        if (!numerosAscendentes.isEmpty()) {
            Collections.sort(numerosAscendentes);

            return numerosAscendentes;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendentes = new ArrayList<>(numeros);

        if (!numerosDescendentes.isEmpty()) {
            Collections.sort(numerosDescendentes, Collections.reverseOrder());

            return numerosDescendentes;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(2151);
        ordenacaoNumeros.adicionarNumero(6565);
        ordenacaoNumeros.adicionarNumero(8572);
        ordenacaoNumeros.adicionarNumero(2324);
        ordenacaoNumeros.adicionarNumero(1654);

        System.out.println("Lista ordenada em ordem ascendente: " + ordenacaoNumeros.ordenarAscendente());
        System.out.println("Lista ordenada em ordem descendente: " + ordenacaoNumeros.ordenarDescendente());

    }
}
