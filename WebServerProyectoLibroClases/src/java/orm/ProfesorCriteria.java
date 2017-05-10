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

public class ProfesorCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression persona_id_fkId;
	public final AssociationExpression persona_id_fk;
	public final CollectionExpression anotaciones;
	public final CollectionExpression asignatura;
	
	public ProfesorCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		persona_id_fkId = new IntegerExpression("persona_id_fk.id", this);
		persona_id_fk = new AssociationExpression("persona_id_fk", this);
		anotaciones = new CollectionExpression("ORM_Anotaciones", this);
		asignatura = new CollectionExpression("ORM_Asignatura", this);
	}
	
	public ProfesorCriteria(PersistentSession session) {
		this(session.createCriteria(Profesor.class));
	}
	
	public ProfesorCriteria() throws PersistentException {
		this(orm.LibroClasePersistentManager.instance().getSession());
	}
	
	public PersonaCriteria createPersona_id_fkCriteria() {
		return new PersonaCriteria(createCriteria("persona_id_fk"));
	}
	
	public AnotacionesCriteria createAnotacionesCriteria() {
		return new AnotacionesCriteria(createCriteria("ORM_Anotaciones"));
	}
	
	public AsignaturaCriteria createAsignaturaCriteria() {
		return new AsignaturaCriteria(createCriteria("ORM_Asignatura"));
	}
	
	public Profesor uniqueProfesor() {
		return (Profesor) super.uniqueResult();
	}
	
	public Profesor[] listProfesor() {
		java.util.List list = super.list();
		return (Profesor[]) list.toArray(new Profesor[list.size()]);
	}

    @Override
    public Criteria addQueryHint(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

