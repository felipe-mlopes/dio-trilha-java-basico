package set.Pesquisa.ListaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefas.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;

        for (Tarefa t : listaTarefas) {
            if (t.getDescription().equalsIgnoreCase(descricao)) {
                tarefaParaRemover = t;
                break;
            }
        }

        listaTarefas.remove(tarefaParaRemover);
    }

    public void exibirTarefas() {
        System.out.println(listaTarefas);
    }

    public int contarTarefas() {
        return listaTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for (Tarefa t : listaTarefas) {
            if (t.getIsDone() == true) {
                tarefasConcluidas.add(t);
            }
        }

        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        for (Tarefa t : listaTarefas) {
            if (t.getIsDone() == false) {
                tarefasPendentes.add(t);
            }
        }

        return tarefasPendentes;
    }

    public Tarefa marcarTarefaConcluida(String descricao) {
        Tarefa tarefaAtualizada = null;

        for (Tarefa t : listaTarefas) {
            if (t.getDescription().equalsIgnoreCase(descricao)) {
                t.setDone(true);
                tarefaAtualizada = t;
                break;
            }
        }

        return tarefaAtualizada;
    }

    public Tarefa marcarTarefaPendente(String descricao) {
        Tarefa tarefaAtualizada = null;

        for (Tarefa t : listaTarefas) {
            if (t.getDescription().equalsIgnoreCase(descricao)) {
                t.setDone(false);
                tarefaAtualizada = t;
                break;
            }
        }

        return tarefaAtualizada;
    }

    public void limparListaTarefas() {
        listaTarefas.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.exibirTarefas();

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");
        listaTarefas.adicionarTarefa("Tarefa 4");

        listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaConcluida("Tarefa 1");
        listaTarefas.marcarTarefaConcluida("Tarefa 2");

        System.out.println("Lista de tarefas pendentes: " + listaTarefas.obterTarefasPendentes());
        System.out.println("Lista de tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());

        listaTarefas.marcarTarefaPendente("Tarefa 1");

        System.out.println("Lista de tarefas pendentes atualizada: " + listaTarefas.obterTarefasPendentes());
        System.out.println("Lista de tarefas concluídas atualizada: " + listaTarefas.obterTarefasConcluidas());

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
