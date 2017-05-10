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

public class AsignaturaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression curso_id_fkId;
	public final AssociationExpression curso_id_fk;
	public final IntegerExpression profesorid_pkId;
	public final AssociationExpression profesorid_pk;
	public final StringExpression objetivos;
	public final CollectionExpression actividad;
	
	public AsignaturaDetachedCriteria() {
		super(orm.Asignatura.class, orm.AsignaturaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		curso_id_fkId = new IntegerExpression("curso_id_fk.id", this.getDetachedCriteria());
		curso_id_fk = new AssociationExpression("curso_id_fk", this.getDetachedCriteria());
		profesorid_pkId = new IntegerExpression("profesorid_pk.id", this.getDetachedCriteria());
		profesorid_pk = new AssociationExpression("profesorid_pk", this.getDetachedCriteria());
		objetivos = new StringExpression("objetivos", this.getDetachedCriteria());
		actividad = new CollectionExpression("ORM_Actividad", this.getDetachedCriteria());
	}
	
	public AsignaturaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.AsignaturaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		curso_id_fkId = new IntegerExpression("curso_id_fk.id", this.getDetachedCriteria());
		curso_id_fk = new AssociationExpression("curso_id_fk", this.getDetachedCriteria());
		profesorid_pkId = new IntegerExpression("profesorid_pk.id", this.getDetachedCriteria());
		profesorid_pk = new AssociationExpression("profesorid_pk", this.getDetachedCriteria());
		objetivos = new StringExpression("objetivos", this.getDetachedCriteria());
		actividad = new CollectionExpression("ORM_Actividad", this.getDetachedCriteria());
	}
	
	public CursoDetachedCriteria createCurso_id_fkCriteria() {
		return new CursoDetachedCriteria(createCriteria("curso_id_fk"));
	}
	
	public ProfesorDetachedCriteria createProfesorid_pkCriteria() {
		return new ProfesorDetachedCriteria(createCriteria("profesorid_pk"));
	}
	
	public ActividadDetachedCriteria createActividadCriteria() {
		return new ActividadDetachedCriteria(createCriteria("ORM_Actividad"));
	}
	
	public Asignatura uniqueAsignatura(PersistentSession session) {
		return (Asignatura) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Asignatura[] listAsignatura(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Asignatura[]) list.toArray(new Asignatura[list.size()]);
	}
}

