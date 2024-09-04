import java.util.Arrays;
import java.util.List;

public class App {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    // Desafio 01 - Ordem crescente
    public List<Integer> numerosEmOrdemCrescente() {
        return numeros.stream().sorted().toList();
    }

    // Desafio 02 - Soma dos números pares
    public Integer somaNumerosPares() {
        return numeros.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
    }

    // Desafio 03 - Verificar se todos os números são inteiros
    public  Boolean validaApenasNumerosInteiros() {
        return numeros.stream().allMatch(n -> n instanceof Integer);
    }

    // Desafio 04 - Remova todos os valores ímpares
    public  List<Integer> removeNumerosImpares() {
        return numeros.stream().filter(n -> n % 2 == 0).toList();
    }

    // Desafio 05 - Calcule a média dos números maiores que 5
    public  Double mediaNumerosMaioresQueCinco() {
        return numeros.stream().filter(n -> n > 5).mapToInt(Integer::intValue).average().getAsDouble();
    }

    // Desafio 06 - Verificar se a lista contém algum número maior que 10
    public  Boolean verificaNumeroExistenteMaiorQueDez() {
        return numeros.stream().anyMatch(n -> n > 10);
    }

    // Desafio 7 - Encontrar o segundo número maior da lista
    public Integer segundoNumeroMaiorDaLista() {
        int maiorNumero = numeros.stream().max(Integer::compareTo).get();

        return numeros.stream().filter(n -> n < maiorNumero).max(Integer::compareTo).get();
    }

    // Desafio 8 - Somar os dígitos de todos os números da lista
    public Integer somaDigitosNumerosLista() {

         return numeros.stream()
                .mapToInt(Integer::intValue)
                .flatMap(n -> String.valueOf(n)
                    .chars()
                    .map(Character::getNumericValue))
                .sum();
    }

    public static void main(String[] args) throws Exception {
        App app = new App();

        System.out.println("Números em ordem crescente: " + app.numerosEmOrdemCrescente());
        System.out.println("A soma dos números pares é: " + app.somaNumerosPares());
        System.out.println("Todos os números são inteiros: " + app.validaApenasNumerosInteiros());
        System.out.println("Lista sem os números ímpares: " + app.removeNumerosImpares());
        System.out.println("Média dos números maiores que 5: " + app.mediaNumerosMaioresQueCinco());
        System.out.println("Existem algum número maior que 10: " + app.verificaNumeroExistenteMaiorQueDez());
        System.out.println("O segundo maior número da lista é: " + app.segundoNumeroMaiorDaLista());
        System.out.println("A soma dos dígitos de cada número é: " + app.somaDigitosNumerosLista());
    }
}
