package com.spring.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.data.model.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{
	
	@Query("Select o from Alumno o where o.nombres = ?1 and o.apellidos1 = ?2")
	List<Alumno> obtenerAlumnosPorNombre(String nombres, String apellidos);

	
}
