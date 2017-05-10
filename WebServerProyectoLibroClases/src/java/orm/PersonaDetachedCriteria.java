/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package orm;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PersonaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final StringExpression rut;
	public final IntegerExpression estudianteId;
	public final AssociationExpression estudiante;
	public final IntegerExpression apoderadoId;
	public final AssociationExpression apoderado;
	public final IntegerExpression directivoId;
	public final AssociationExpression directivo;
	public final IntegerExpression profesorId;
	public final AssociationExpression profesor;
	
	public PersonaDetachedCriteria() {
		super(orm.Persona.class, orm.PersonaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		rut = new StringExpression("rut", this.getDetachedCriteria());
		estudianteId = new IntegerExpression("estudiante.id", this.getDetachedCriteria());
		estudiante = new AssociationExpression("estudiante", this.getDetachedCriteria());
		apoderadoId = new IntegerExpression("apoderado.id", this.getDetachedCriteria());
		apoderado = new AssociationExpression("apoderado", this.getDetachedCriteria());
		directivoId = new IntegerExpression("directivo.id", this.getDetachedCriteria());
		directivo = new AssociationExpression("directivo", this.getDetachedCriteria());
		profesorId = new IntegerExpression("profesor.id", this.getDetachedCriteria());
		profesor = new AssociationExpression("profesor", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.PersonaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		rut = new StringExpression("rut", this.getDetachedCriteria());
		estudianteId = new IntegerExpression("estudiante.id", this.getDetachedCriteria());
		estudiante = new AssociationExpression("estudiante", this.getDetachedCriteria());
		apoderadoId = new IntegerExpression("apoderado.id", this.getDetachedCriteria());
		apoderado = new AssociationExpression("apoderado", this.getDetachedCriteria());
		directivoId = new IntegerExpression("directivo.id", this.getDetachedCriteria());
		directivo = new AssociationExpression("directivo", this.getDetachedCriteria());
		profesorId = new IntegerExpression("profesor.id", this.getDetachedCriteria());
		profesor = new AssociationExpression("profesor", this.getDetachedCriteria());
	}
	
	public EstudianteDetachedCriteria createEstudianteCriteria() {
		return new EstudianteDetachedCriteria(createCriteria("estudiante"));
	}
	
	public ApoderadoDetachedCriteria createApoderadoCriteria() {
		return new ApoderadoDetachedCriteria(createCriteria("apoderado"));
	}
	
	public DirectivoDetachedCriteria createDirectivoCriteria() {
		return new DirectivoDetachedCriteria(createCriteria("directivo"));
	}
	
	public ProfesorDetachedCriteria createProfesorCriteria() {
		return new ProfesorDetachedCriteria(createCriteria("profesor"));
	}
	
	public Persona uniquePersona(PersistentSession session) {
		return (Persona) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Persona[] listPersona(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Persona[]) list.toArray(new Persona[list.size()]);
	}
}

