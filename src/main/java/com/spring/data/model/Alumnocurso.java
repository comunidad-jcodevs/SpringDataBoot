package com.spring.data.model;
// Generated 08/03/2018 10:10:55 PM by Hibernate Tools 5.2.8.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Alumnocurso 
 */
@Entity
@Table(name = "alumnocurso", catalog = "escueladb")
public class Alumnocurso implements java.io.Serializable {

	private Integer idAlumnoCurso;
	private Alumno alumno;
	private Curso curso;
	private Date fechaInicio;
	private Date fechaFin;
	private Integer estado;

	public Alumnocurso() {
	}

	public Alumnocurso(Alumno alumno, Curso curso, Date fechaInicio, Date fechaFin, Integer estado) {
		this.alumno = alumno;
		this.curso = curso;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.estado = estado;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idAlumnoCurso", unique = true, nullable = false)
	public Integer getIdAlumnoCurso() {
		return this.idAlumnoCurso;
	}

	public void setIdAlumnoCurso(Integer idAlumnoCurso) {
		this.idAlumnoCurso = idAlumnoCurso;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idAlumno")
	public Alumno getAlumno() {
		return this.alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCurso")
	public Curso getCurso() {
		return this.curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaInicio", length = 19)
	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaFin", length = 19)
	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	@Column(name = "estado")
	public Integer getEstado() {
		return this.estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

}
