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
 * Curso 
 */
@Entity
@Table(name = "curso", catalog = "escueladb")
public class Curso implements java.io.Serializable {

	private Integer idCurso;
	private String nombre;
	private String descripcion;
	private Integer estado;
	private Set<Alumnocurso> alumnocursos = new HashSet<Alumnocurso>(0);

	public Curso() {
	}

	public Curso(String nombre, String descripcion, Integer estado, Set<Alumnocurso> alumnocursos) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
		this.alumnocursos = alumnocursos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idCurso", unique = true, nullable = false)
	public Integer getIdCurso() {
		return this.idCurso;
	}

	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}

	@Column(name = "nombre", length = 100)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "descripcion", length = 500)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "estado")
	public Integer getEstado() {
		return this.estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "curso")
	public Set<Alumnocurso> getAlumnocursos() {
		return this.alumnocursos;
	}

	public void setAlumnocursos(Set<Alumnocurso> alumnocursos) {
		this.alumnocursos = alumnocursos;
	}

}
/**
Comentario de prueba para Segundo Commit
*/