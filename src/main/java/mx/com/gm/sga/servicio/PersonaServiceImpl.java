package mx.com.gm.sga.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.eis.PersonaDao;

@Stateless
@WebService(endpointInterface = "mx.com.gm.sga.servicio.PersonaServiceWS")
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService, PersonaServiceWS {
	
	@EJB
	private PersonaDao personaDao;

        @Override
	public List<Persona> listarPersonas() {
		return personaDao.findAllPersonas();
	}

        @Override
	public Persona encontrarPersonaPorId(Persona persona) {
		return personaDao.findPersonaById(persona);
	}

        @Override
	public Persona encontrarPersonaPorEmail(Persona persona) {
		return personaDao.findPersonaByEmail(persona);
	}

        @Override
	public void registrarPersona(Persona persona) {
		personaDao.insertPersona(persona);
	}

        @Override
	public void modificarPersona(Persona persona) {
		personaDao.updatePersona(persona);
	}

        @Override
	public void eliminarPersona(Persona persona) {
		personaDao.deletePersona(persona);
	}
}
