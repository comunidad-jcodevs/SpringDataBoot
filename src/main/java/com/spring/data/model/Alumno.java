package com.spring.data.model;
// Generated 08/03/2018 10:10:55 PM by Hibernate Tools 5.2.8.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Alumno 
 */
@Entity
@Table(name = "alumno", catalog = "escueladb")
public class Alumno implements java.io.Serializable {

	private Integer idAlumno;
	private String nombres;
	private String apellidos;
	private Integer estado;
	private Set<Alumnocurso> alumnocursos = new HashSet<Alumnocurso>(0);

	public Alumno() {
	}

	public Alumno(String nombres, String apellidos, Integer estado, Set<Alumnocurso> alumnocursos) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.estado = estado;
		this.alumnocursos = alumnocursos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idAlumno", unique = true, nullable = false)
	public Integer getIdAlumno() {
		return this.idAlumno;
	}

	public void setIdAlumno(Integer idAlumno) {
		this.idAlumno = idAlumno;
	}

	@Column(name = "nombres", length = 100)
	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	@Column(name = "apellidos", length = 100)
	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Column(name = "estado")
	public Integer getEstado() {
		return this.estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "alumno")
	public Set<Alumnocurso> getAlumnocursos() {
		return this.alumnocursos;
	}

	public void setAlumnocursos(Set<Alumnocurso> alumnocursos) {
		this.alumnocursos = alumnocursos;
	}

}
/**
Primer Cambio desde la Rama 001
*/