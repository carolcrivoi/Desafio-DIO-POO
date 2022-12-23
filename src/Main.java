import br.com.dio.desafio.Dominio.Bootcamp;
import br.com.dio.desafio.Dominio.Curso;
import br.com.dio.desafio.Dominio.Dev;
import br.com.dio.desafio.Dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso: Primeiros passos em Java");
        curso1.setDescricao("Descrição: Curso de Java para devs iniciantes");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso: Conhecendo Javascript");
        curso2.setDescricao("Descrição: Ideal para você se aprofundar na linguagem ");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCarol = new Dev();
        devCarol.setNome("Carol");
        devCarol.inscreverBootcamp(bootcamp);
        devCarol.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Carol: " + devCarol.getConteudosInscritos());
        System.out.println("-");
        devCarol.progredir();
        System.out.println("Conteúdos concluídos Carol: " + devCarol.getConteudosInscritos());
        devCarol.progredir();
        System.out.println("-");
        System.out.println("XP: " + devCarol.calcularTotalXp());

        System.out.println("-");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("-");
        devCamila.progredir();
        System.out.println("Conteúdos concluídos Camila: " + devCarol.getConteudosConcluidos());
        System.out.println("-");
        System.out.println("XP: " + devCamila.calcularTotalXp());

    }
}
