package ar.com.materias.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Correlativa {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Integer codigo;
	
	@ManyToOne
	@JoinColumn(name="idCorrelativa")
	private Materia idCorrelativa = new Materia();
	
	public Correlativa(){}

	public Correlativa(Long id,Integer codigo, Materia idCorrelativa) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.idCorrelativa = idCorrelativa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Materia getIdCorrelativa() {
		return idCorrelativa;
	}

	public void setIdCorrelativa(Materia idCorrelativa) {
		this.idCorrelativa = idCorrelativa;
	}
	
}
