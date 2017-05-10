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

public class AsignaturaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression curso_id_fkId;
	public final AssociationExpression curso_id_fk;
	public final IntegerExpression profesorid_pkId;
	public final AssociationExpression profesorid_pk;
	public final StringExpression objetivos;
	public final CollectionExpression actividad;
	
	public AsignaturaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		curso_id_fkId = new IntegerExpression("curso_id_fk.id", this);
		curso_id_fk = new AssociationExpression("curso_id_fk", this);
		profesorid_pkId = new IntegerExpression("profesorid_pk.id", this);
		profesorid_pk = new AssociationExpression("profesorid_pk", this);
		objetivos = new StringExpression("objetivos", this);
		actividad = new CollectionExpression("ORM_Actividad", this);
	}
	
	public AsignaturaCriteria(PersistentSession session) {
		this(session.createCriteria(Asignatura.class));
	}
	
	public AsignaturaCriteria() throws PersistentException {
		this(orm.LibroClasePersistentManager.instance().getSession());
	}
	
	public CursoCriteria createCurso_id_fkCriteria() {
		return new CursoCriteria(createCriteria("curso_id_fk"));
	}
	
	public ProfesorCriteria createProfesorid_pkCriteria() {
		return new ProfesorCriteria(createCriteria("profesorid_pk"));
	}
	
	public ActividadCriteria createActividadCriteria() {
		return new ActividadCriteria(createCriteria("ORM_Actividad"));
	}
	
	public Asignatura uniqueAsignatura() {
		return (Asignatura) super.uniqueResult();
	}
	
	public Asignatura[] listAsignatura() {
		java.util.List list = super.list();
		return (Asignatura[]) list.toArray(new Asignatura[list.size()]);
	}

    @Override
    public Criteria addQueryHint(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

