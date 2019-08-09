package ar.com.materias.dao;

import java.util.List;

import ar.com.materias.modelo.Materia;

public interface InfoDao {
	
	public List<Materia> buscarMateriasAprobadas();
	public Long cantidadMateriasAprobadas();
	public List<Materia> buscarTodasLasMaterias();

}
