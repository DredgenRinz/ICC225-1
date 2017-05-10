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

public class DirectivoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression persona_id_fkId;
	public final AssociationExpression persona_id_fk;
	public final IntegerExpression institucion_id_fkId;
	public final AssociationExpression institucion_id_fk;
	
	public DirectivoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		persona_id_fkId = new IntegerExpression("persona_id_fk.id", this);
		persona_id_fk = new AssociationExpression("persona_id_fk", this);
		institucion_id_fkId = new IntegerExpression("institucion_id_fk.id", this);
		institucion_id_fk = new AssociationExpression("institucion_id_fk", this);
	}
	
	public DirectivoCriteria(PersistentSession session) {
		this(session.createCriteria(Directivo.class));
	}
	
	public DirectivoCriteria() throws PersistentException {
		this(orm.LibroClasePersistentManager.instance().getSession());
	}
	
	public PersonaCriteria createPersona_id_fkCriteria() {
		return new PersonaCriteria(createCriteria("persona_id_fk"));
	}
	
	public InstitucionCriteria createInstitucion_id_fkCriteria() {
		return new InstitucionCriteria(createCriteria("institucion_id_fk"));
	}
	
	public Directivo uniqueDirectivo() {
		return (Directivo) super.uniqueResult();
	}
	
	public Directivo[] listDirectivo() {
		java.util.List list = super.list();
		return (Directivo[]) list.toArray(new Directivo[list.size()]);
	}

    @Override
    public Criteria addQueryHint(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

