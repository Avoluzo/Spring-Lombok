package com.example.projetoescola;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.projetoescola.models.CategoriaCurso;
import com.example.projetoescola.models.Curso;
import com.example.projetoescola.repositories.CategoriaCursoRepository;
import com.example.projetoescola.repositories.CursoRepository;

@SpringBootApplication
public class ProjetoescolaApplication {

	@Bean
	public CommandLineRunner init(
		    @Autowired CategoriaCursoRepository categoriaCursoRepository,
			@Autowired CursoRepository cursoRepository) {
		return args -> {
			System.out.println("*** CRIANDO AS CATEGORIAS ***");
			CategoriaCurso c1 = categoriaCursoRepository.save(
				new CategoriaCurso(0, "Tecnologo",null));
		    CategoriaCurso c2 = categoriaCursoRepository.save(
				new CategoriaCurso(0, "Bacharelado",null));
			cursoRepository.save(
					new Curso(0L, "ADS", 2000,c1));
			cursoRepository.save(
					new Curso(0L, "SI", 2050,c2));
			 List<Curso> listaCursos = cursoRepository.findAll();
			 listaCursos.forEach(System.out::println);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ProjetoescolaApplication.class, args);
	}

}
