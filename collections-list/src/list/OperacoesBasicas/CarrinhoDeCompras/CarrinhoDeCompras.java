package list.OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras() {

        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {

        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {

        List<Item> itensParaRemover = new ArrayList<>();

        if (!carrinhoDeCompras.isEmpty()) {
            for (Item i : carrinhoDeCompras) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }

            carrinhoDeCompras.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {

        double valorTotal = 0.00;

        for (Item i : carrinhoDeCompras) {
            double valorItem = i.getPreco() * i.getQuantidade();
            valorTotal += valorItem;
        }

        return valorTotal;
    }

    public void exibirItens() {

        if (!carrinhoDeCompras.isEmpty()) {
            System.out.println(this.carrinhoDeCompras);
          } else {
            System.out.println("A lista está vazia!");
          }
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Tênis", 399.99, 2);
        carrinhoDeCompras.adicionarItem("Camiseta", 99.99, 5);
        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularValorTotal());
    }
}
