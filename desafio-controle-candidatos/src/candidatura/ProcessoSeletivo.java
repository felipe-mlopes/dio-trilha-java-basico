import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};

        for (String candidato: candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do { 
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;
            }
        } while (continuarTentando && tentativasRealizadas <= 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas);
        } else {
            System.out.println("Não conseguimos contato com " + candidato + ", número máximo tentativas " + tentativasRealizadas + " realizadas");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

        for (int indice=0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº" + (indice+1) + " é " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação for each");

        for (String candidato: candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "João"};
        double salarioBase = 2000.00;

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido );
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para vaga");
                candidatosSelecionados++;
            }

            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.00;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
