package mx.com.gm.gm.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

//Teniendo la libreria de Lombok y con la anotacion de Data, podemos agregar automaticamente los metodos get
//set, toString, hashCode e equals, pero solo es visible en la pestania Navigator. Asi convertimos una clase en Java Bean
@Data
//Con la notacion Entity se agrega el javax.persistance.Entity para convertir la clase en una clase de entidad
@Entity
//La siguiente notacion de Table() importa una clase de javax.persistance.table. Esta importacion se usa para que
//al momento de hacer las consultas, no hayan errores al hacer las consultas  SQL debido a que la clase Persona
//empieza en mayuscula y en la base de datos la tabla es persona, en minusculas
@Table(name = "persona")
public class Persona implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    //La anotacion Id es para indicar cual sera la variable primaria
    @Id
    //Con la anotacion GeneratedValue se generara la llave primaria con la estrategia GenerationType.IDENTITY
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
}
