package ar.com.materias.controladores;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.com.materias.servicios.ServicioInfo;

@Controller
public class ControladorIndex {
	
	@Inject
	private ServicioInfo servicioInfo;
	
	@RequestMapping("/")
	public ModelAndView irAIndex() {
		ModelMap modelo = new ModelMap();
		modelo.put("materiasAprobadas", servicioInfo.buscarMateriasAprobadas());
		modelo.put("cantidadAprobadas", servicioInfo.cantidadMateriasAprobadas());
		return new ModelAndView("index",modelo);
	}

	@RequestMapping("index")
	public ModelAndView redirijeAIndex() {
		ModelMap modelo = new ModelMap();
		modelo.put("materiasAprobadas", servicioInfo.buscarMateriasAprobadas());
		modelo.put("cantidadAprobadas", servicioInfo.cantidadMateriasAprobadas());
		return new ModelAndView("index",modelo);
	}
	
	@RequestMapping("adm-materias")
	public ModelAndView administrarMaterias(){
		ModelMap modelo = new ModelMap();
		
		modelo.put("materias", servicioInfo.buscarTodasLasMaterias());
		
		return new ModelAndView("adm-materias",modelo);
		
	}
	
	
	
}
