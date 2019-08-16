package ar.com.materias.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.JDBCException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Subqueries;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.stereotype.Service;

import ar.com.materias.modelo.Correlativa;
import ar.com.materias.modelo.Materia;

@Service("infoDao")
public class InfoDaoImpl implements InfoDao{
	
	@Inject
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Materia> buscarMateriasAprobadas(){
		final Session session = sessionFactory.getCurrentSession();
		return (List<Materia>) session.createCriteria(Materia.class)
				.add(Restrictions.eq("aprobada", true)).list();
	}
	
	@Override
	public Long cantidadMateriasAprobadas(){
		final Session session = sessionFactory.getCurrentSession();
		return (Long) session.createCriteria(Materia.class)
				.setProjection(Projections.count("codigo"))
				.add(Restrictions.eq("aprobada", true)).uniqueResult();
				
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Materia> buscarTodasLasMaterias(){
		final Session session = sessionFactory.getCurrentSession();
		return (List<Materia>) session.createCriteria(Materia.class)
				.list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Materia> buscarMateriasPositivas(){
		final Session session = sessionFactory.getCurrentSession();
		
		/*select m.codigo,m.nombre from materia m join 
		(select a.codigo,sum(b.aprobada) as sapr,count(b.aprobada) as capr from correlativa a join materia b on a.idCorrelativa = b.codigo 
		group by a.codigo having sapr=capr) as corr 
		on corr.codigo = m.codigo where m.aprobada=0;*/
		
/*.add(Projections.sqlGroupProjection("cuit","cuit having sum( (mto_emit-mto_impu) + ( (mto_emit-mto_impu)*(24*(timestampdiff(DAY,vto,'"+fechaAct+"')/36500) ) ) ) >"+deudaTotal,
				new String[]{"deuda"},new org.hibernate.type.Type[]{StandardBasicTypes.STRING})))*/
		
		DetachedCriteria subConsulta = DetachedCriteria.forClass(Correlativa.class,"c").createAlias("idCorrelativa","id")
				.setProjection(Projections.sqlGroupProjection("c_.codigo","c_.codigo having sum(aprobada)=count(aprobada)", new String[]{"c_.codigo"},
								new org.hibernate.type.Type[]{StandardBasicTypes.STRING}));				
						/*.add(Projections.sum("c.aprobada").as("sapr"))
						.add(Projections.count("c.aprobada").as("capr")));*/
		
		return (List<Materia>) session.createCriteria(Materia.class,"m").add(Subqueries.propertyIn("m.codigo", subConsulta))
				.add(Restrictions.eq("m.aprobada",false)).list();
		
	}
	
	@Override
	public Boolean actualizarAprobada(Materia materia){
		final Session session = sessionFactory.getCurrentSession();
		try{
			session.saveOrUpdate(materia);
			return true;
		}catch(JDBCException e ){
			return false;
		}
	}
	
	@Override
	public Materia buscarMateria(Integer codigo){
		final Session session = sessionFactory.getCurrentSession();
		return (Materia) session.createCriteria(Materia.class).add(Restrictions.eq("codigo", codigo)).uniqueResult();
	}


}
