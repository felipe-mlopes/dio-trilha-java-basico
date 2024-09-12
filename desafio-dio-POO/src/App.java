
import java.time.LocalDate;


public class App {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição de mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFelipe = new Dev();
        devFelipe.setNome("Felipe");
        devFelipe.inscreverBootCamp(bootcamp);
        System.out.println("Conteúdos Inscritos - Felipe: " + devFelipe.getConteudosIncristos());
        devFelipe.progedir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos - Felipe: " + devFelipe.getConteudosIncristos());
        System.out.println("Conteúdos Concluídos - Felipe: " + devFelipe.getConteudosConcluidos());
        System.out.println("XP: " + devFelipe.calcularTotalXP());

        System.out.println("------");

        Dev devPacoca = new Dev();
        devPacoca.setNome("Paçoca");
        devPacoca.inscreverBootCamp(bootcamp);
        System.out.println("Conteúdos Inscritos - Paçoca: " + devPacoca.getConteudosIncristos());
        devPacoca.progedir();
        devPacoca.progedir();
        devPacoca.progedir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos - Paçoca: " + devPacoca.getConteudosIncristos());
        System.out.println("Conteúdos Concluídos - Paçoca: " + devPacoca.getConteudosConcluidos());
        System.out.println("XP: " + devPacoca.calcularTotalXP());
    }
}
