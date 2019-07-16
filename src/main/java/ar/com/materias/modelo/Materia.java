package ar.com.materias.modelo;

import java.util.ArrayList;
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
	private Boolean aprobada;
	
	@OneToMany(mappedBy="idCorrelativa")
	private List<Correlativa> materia = new ArrayList<>();
	
	public Materia(){}

	public Materia(Integer codigo, String nombre, Integer cargaHoraria, Integer anio, Boolean aprobada,
			List<Correlativa> materia) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.cargaHoraria = cargaHoraria;
		this.anio = anio;
		this.aprobada = aprobada;
		this.materia = materia;
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
