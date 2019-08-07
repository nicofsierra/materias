package ar.com.materias.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import ar.com.materias.modelo.Materia;

@Service("infoDao")
public class InfoDaoImpl implements InfoDao{
	
	@Inject
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Materia> buscarMateriasAprobadas(){
		final Session session = sessionFactory.getCurrentSession();
		return (List<Materia>) session.createCriteria(Materia.class).
				add(Restrictions.eq("aprobada", true)).list();
	}
	
	@Override
	public Long cantidadMateriasAprobadas(){
		final Session session = sessionFactory.getCurrentSession();
		return (Long) session.createCriteria(Materia.class)
				.setProjection(Projections.count("codigo"))
				.add(Restrictions.eq("aprobada", true)).uniqueResult();
				
	}

}
