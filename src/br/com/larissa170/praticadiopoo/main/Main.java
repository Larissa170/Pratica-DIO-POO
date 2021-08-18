package br.com.larissa170.praticadiopoo.main;

import java.time.LocalDate;

import br.com.larissa170.praticadiopoo.dominio.Curso;
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
		
		System.out.println(curso1);
		System.out.println(curso2);
		
		Mentoria mentoria = new Mentoria();
		
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Mentoria para alunos do curso de Java");
		mentoria.setData(LocalDate.now());
		
		System.out.println(mentoria);

	}

}
