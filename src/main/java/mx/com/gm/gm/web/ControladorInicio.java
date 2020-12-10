package mx.com.gm.gm.web;

//Se agrega la siguiente anotacion para que Spring pueda reconocer esta clase de java
import java.util.*;
import lombok.extern.slf4j.Slf4j;
import lombok.var;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import mx.com.gm.gm.domain.Persona;
import mx.com.gm.gm.dao.PersonaDao;
import org.springframework.beans.factory.annotation.Autowired;
//Vamos a usar un controlador Spring MVC

@Controller
//La siguiente anotacion es para un login
@Slf4j
public class ControladorInicio {
    
    //Autowired se usa para inyectar nuestra interfaz PersonaDao en esta clase controlador, y la interfaz al extender
    //de la clase CrudRepository, esta clase tendra los permisos de usar los metodos para obtener y modificar
    //la base de datos
    @Autowired
    private PersonaDao personaDao;


    @GetMapping("/")
    public String inicio(Model model) {
        
        
        
        List<Persona> personas = (List<Persona>)personaDao.findAll();
        
       
        log.info("Ejecutando el controlador Spring MVC");
        log.info(personas.toString());
        
        model.addAttribute("personas", personas);
        
        return "index";
    }
}
