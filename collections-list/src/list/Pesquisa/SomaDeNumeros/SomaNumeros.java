package list.Pesquisa.SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Numeros> numerosList;

    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerosList.add(new Numeros(numero));
    }

    public int calcularSoma() {
        int soma = 0;

        for (Numeros n : numerosList) {
            soma += n.getNumero();
        }

        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;

        for (Numeros n : numerosList) {
            if (n.getNumero() >= maiorNumero) {
                maiorNumero = n.getNumero();
            } 
        }

        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;

        for (Numeros n : numerosList) {
            if (n.getNumero() <= menorNumero) {
                menorNumero = n.getNumero();
            } 
        }

        return menorNumero;
    }

    public void exibirNumeros() {
        System.out.println(numerosList);
    }

    public static void main(String[] args) {
        SomaNumeros numerosList = new SomaNumeros();

        numerosList.adicionarNumero(1);
        numerosList.adicionarNumero(2);

        System.out.println("A soma dos números é: " + numerosList.calcularSoma());
        System.out.println("O maior número encontrado é: " + numerosList.encontrarMaiorNumero());
        System.out.println("O menor número encontrado é: " +numerosList.encontrarMenorNumero());
        
        numerosList.exibirNumeros();
    }
}
