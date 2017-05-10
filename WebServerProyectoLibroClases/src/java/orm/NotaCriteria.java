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

public class NotaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression actividad_id_fkId;
	public final AssociationExpression actividad_id_fk;
	public final IntegerExpression estudiante_id_fkId;
	public final AssociationExpression estudiante_id_fk;
	public final DoubleExpression nota;
	
	public NotaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		actividad_id_fkId = new IntegerExpression("actividad_id_fk.id", this);
		actividad_id_fk = new AssociationExpression("actividad_id_fk", this);
		estudiante_id_fkId = new IntegerExpression("estudiante_id_fk.id", this);
		estudiante_id_fk = new AssociationExpression("estudiante_id_fk", this);
		nota = new DoubleExpression("nota", this);
	}
	
	public NotaCriteria(PersistentSession session) {
		this(session.createCriteria(Nota.class));
	}
	
	public NotaCriteria() throws PersistentException {
		this(orm.LibroClasePersistentManager.instance().getSession());
	}
	
	public ActividadCriteria createActividad_id_fkCriteria() {
		return new ActividadCriteria(createCriteria("actividad_id_fk"));
	}
	
	public EstudianteCriteria createEstudiante_id_fkCriteria() {
		return new EstudianteCriteria(createCriteria("estudiante_id_fk"));
	}
	
	public Nota uniqueNota() {
		return (Nota) super.uniqueResult();
	}
	
	public Nota[] listNota() {
		java.util.List list = super.list();
		return (Nota[]) list.toArray(new Nota[list.size()]);
	}

    @Override
    public Criteria addQueryHint(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

