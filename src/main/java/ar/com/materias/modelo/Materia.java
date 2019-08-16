package ar.com.materias.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Materia {
	@Id
	private Integer codigo;
	private String nombre;
	private Integer cargaHoraria;
	private Integer anio;
	private Date fechaAprobacion;
	private Boolean aprobada;
	private Long nroActa;
	private Boolean cursando;
	
	@OneToMany(mappedBy="idCorrelativa")
	private List<Correlativa> materia = new ArrayList<>();
	
	public Materia(){}

	public Materia(Integer codigo, String nombre, Integer cargaHoraria, Integer anio, Boolean aprobada,
			List<Correlativa> materia, Date fechaAprobacion,Long nroActa,Boolean cursando) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.cargaHoraria = cargaHoraria;
		this.anio = anio;
		this.aprobada = aprobada;
		this.materia = materia;
		this.fechaAprobacion = fechaAprobacion;
		this.nroActa = nroActa;
		this.cursando = cursando;
	}
	
	public Boolean getCursando() {
		return cursando;
	}

	public void setCursando(Boolean cursando) {
		this.cursando = cursando;
	}

	public Long getNroActa() {
		return nroActa;
	}

	public void setNroActa(Long nroActa) {
		this.nroActa = nroActa;
	}

	public Date getFechaAprobacion() {
		return fechaAprobacion;
	}

	public void setFechaAprobacion(Date fechaAprobacion) {
		this.fechaAprobacion = fechaAprobacion;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public Boolean getAprobada() {
		return aprobada;
	}

	public void setAprobada(Boolean aprobada) {
		this.aprobada = aprobada;
	}

	public List<Correlativa> getMateria() {
		return materia;
	}

	public void setMateria(List<Correlativa> materia) {
		this.materia = materia;
	}
	
}
