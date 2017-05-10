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

public class ApoderadoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression persona_id_fkId;
	public final AssociationExpression persona_id_fk;
	public final CollectionExpression estudiante;
	
	public ApoderadoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		persona_id_fkId = new IntegerExpression("persona_id_fk.id", this);
		persona_id_fk = new AssociationExpression("persona_id_fk", this);
		estudiante = new CollectionExpression("ORM_Estudiante", this);
	}
	
	public ApoderadoCriteria(PersistentSession session) {
		this(session.createCriteria(Apoderado.class));
	}
	
	public ApoderadoCriteria() throws PersistentException {
		this(orm.LibroClasePersistentManager.instance().getSession());
	}
	
	public PersonaCriteria createPersona_id_fkCriteria() {
		return new PersonaCriteria(createCriteria("persona_id_fk"));
	}
	
	public EstudianteCriteria createEstudianteCriteria() {
		return new EstudianteCriteria(createCriteria("ORM_Estudiante"));
	}
	
	public Apoderado uniqueApoderado() {
		return (Apoderado) super.uniqueResult();
	}
	
	public Apoderado[] listApoderado() {
		java.util.List list = super.list();
		return (Apoderado[]) list.toArray(new Apoderado[list.size()]);
	}

    @Override
    public Criteria addQueryHint(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

