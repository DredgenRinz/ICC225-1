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

public class AsistenciaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression estudiante_id_fkId;
	public final AssociationExpression estudiante_id_fk;
	public final DateExpression fecha;
	
	public AsistenciaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		estudiante_id_fkId = new IntegerExpression("estudiante_id_fk.id", this);
		estudiante_id_fk = new AssociationExpression("estudiante_id_fk", this);
		fecha = new DateExpression("fecha", this);
	}
	
	public AsistenciaCriteria(PersistentSession session) {
		this(session.createCriteria(Asistencia.class));
	}
	
	public AsistenciaCriteria() throws PersistentException {
		this(orm.LibroClasePersistentManager.instance().getSession());
	}
	
	public EstudianteCriteria createEstudiante_id_fkCriteria() {
		return new EstudianteCriteria(createCriteria("estudiante_id_fk"));
	}
	
	public Asistencia uniqueAsistencia() {
		return (Asistencia) super.uniqueResult();
	}
	
	public Asistencia[] listAsistencia() {
		java.util.List list = super.list();
		return (Asistencia[]) list.toArray(new Asistencia[list.size()]);
	}

    @Override
    public Criteria addQueryHint(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

