package com.spring.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.spring.data.model.Alumno;
import com.spring.data.repository.AlumnoRepository;

@SpringBootApplication
@ComponentScan(basePackages = "com.spring.data")
public class SpringDataBootApplication implements CommandLineRunner{
	
	@Autowired
	private AlumnoRepository alumnoRepository;

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SpringDataBootApplication.class);
		application.run();
	}
	
	@Override
	public void run(String... args) throws Exception {
		Alumno alumno = new Alumno();
		alumno.setNombres("Edson");
		alumno.setApellidos("Gabriel");
		alumno.setEstado(0);
		alumnoRepository.save(alumno);
		
		List<Alumno> lista = alumnoRepository.findAll();
		
		for(Alumno a: lista) {
			System.out.println(a.getNombres());
		}
		
		lista.stream().forEach(a -> {
			System.out.println(a.getNombres());
			System.out.println(a.getApellidos());
		});
	
	}
	
	

}
