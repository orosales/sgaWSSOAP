package mx.com.gm.sga.domain.prod;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.domain.Usuario;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2018-08-12T00:40:02")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> password;
    public static volatile SingularAttribute<Usuario, Persona> persona;
    public static volatile SingularAttribute<Usuario, Integer> idUsuario;
    public static volatile SingularAttribute<Usuario, String> username;

}