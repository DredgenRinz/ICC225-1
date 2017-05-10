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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PersonaCriteria extends AbstractORMCriteria {
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
	
	public PersonaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		nombre = new StringExpression("nombre", this);
		rut = new StringExpression("rut", this);
		estudianteId = new IntegerExpression("estudiante.id", this);
		estudiante = new AssociationExpression("estudiante", this);
		apoderadoId = new IntegerExpression("apoderado.id", this);
		apoderado = new AssociationExpression("apoderado", this);
		directivoId = new IntegerExpression("directivo.id", this);
		directivo = new AssociationExpression("directivo", this);
		profesorId = new IntegerExpression("profesor.id", this);
		profesor = new AssociationExpression("profesor", this);
	}
	
	public PersonaCriteria(PersistentSession session) {
		this(session.createCriteria(Persona.class));
	}
	
	public PersonaCriteria() throws PersistentException {
		this(orm.LibroClasePersistentManager.instance().getSession());
	}
	
	public EstudianteCriteria createEstudianteCriteria() {
		return new EstudianteCriteria(createCriteria("estudiante"));
	}
	
	public ApoderadoCriteria createApoderadoCriteria() {
		return new ApoderadoCriteria(createCriteria("apoderado"));
	}
	
	public DirectivoCriteria createDirectivoCriteria() {
		return new DirectivoCriteria(createCriteria("directivo"));
	}
	
	public ProfesorCriteria createProfesorCriteria() {
		return new ProfesorCriteria(createCriteria("profesor"));
	}
	
	public Persona uniquePersona() {
		return (Persona) super.uniqueResult();
	}
	
	public Persona[] listPersona() {
		java.util.List list = super.list();
		return (Persona[]) list.toArray(new Persona[list.size()]);
	}

    @Override
    public Criteria addQueryHint(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

