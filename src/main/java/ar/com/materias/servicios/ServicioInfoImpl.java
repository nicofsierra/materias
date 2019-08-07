package ar.com.materias.servicios;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.com.materias.dao.InfoDao;
import ar.com.materias.modelo.Materia;

@Service("servicioInfo")
@Transactional
public class ServicioInfoImpl implements ServicioInfo {
	
	@Inject
	private InfoDao infoDao;
	
	@Override
	public List<Materia> buscarMateriasAprobadas(){
		return infoDao.buscarMateriasAprobadas();
	}
	
	@Override
	public Long cantidadMateriasAprobadas(){
		return infoDao.cantidadMateriasAprobadas();
	}


}
