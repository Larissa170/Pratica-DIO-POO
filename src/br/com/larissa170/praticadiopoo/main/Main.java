package br.com.larissa170.praticadiopoo.main;

import java.time.LocalDate;

import br.com.larissa170.praticadiopoo.dominio.Bootcamp;
import br.com.larissa170.praticadiopoo.dominio.Conteudo;
import br.com.larissa170.praticadiopoo.dominio.Curso;
import br.com.larissa170.praticadiopoo.dominio.Dev;
import br.com.larissa170.praticadiopoo.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Curso para aprender JAVA");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso PHP");
		curso2.setDescricao("Curso para aprender PHP");
		curso2.setCargaHoraria(6);
		
//		System.out.println(curso1);
//		System.out.println(curso2);
		
		Mentoria mentoria = new Mentoria();
		
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Mentoria para alunos do curso de Java");
		mentoria.setData(LocalDate.now());
		
//		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("BootCamp JAVA Dev ");
		bootcamp.setDescricao("BootCamp para aprendizagem JAVA");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev1 = new Dev();
		dev1.setNome("Lucas");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos " + dev1.getNome() + " : " + dev1.getConteudosInscritos());
		dev1.progredir();
		dev1.progredir();
		System.out.println("--");
		System.out.println("Conteudos Inscritos " + dev1.getNome() + " : " + dev1.getConteudosInscritos());
		System.out.println("Conteudos Concluidos " + dev1.getConteudosConcluidos());
		System.out.println("XP: " + dev1.calcularTotalXp());
		System.out.println("---------------------");
		
		Dev dev2 = new Dev();
		dev2.setNome("Luna");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos " + dev2.getNome() + " : " + dev2.getConteudosInscritos());
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();
		System.out.println("--");
		System.out.println("Conteudos Inscritos " + dev2.getNome() + " : " + dev2.getConteudosInscritos());
		System.out.println("Conteudos Concluidos " + dev2.getConteudosConcluidos());
		System.out.println("XP: " + dev2.calcularTotalXp());
		System.out.println("---------------------");
	}

}
