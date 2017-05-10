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

public class NotaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression actividad_id_fkId;
	public final AssociationExpression actividad_id_fk;
	public final IntegerExpression estudiante_id_fkId;
	public final AssociationExpression estudiante_id_fk;
	public final DoubleExpression nota;
	
	public NotaDetachedCriteria() {
		super(orm.Nota.class, orm.NotaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		actividad_id_fkId = new IntegerExpression("actividad_id_fk.id", this.getDetachedCriteria());
		actividad_id_fk = new AssociationExpression("actividad_id_fk", this.getDetachedCriteria());
		estudiante_id_fkId = new IntegerExpression("estudiante_id_fk.id", this.getDetachedCriteria());
		estudiante_id_fk = new AssociationExpression("estudiante_id_fk", this.getDetachedCriteria());
		nota = new DoubleExpression("nota", this.getDetachedCriteria());
	}
	
	public NotaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.NotaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		actividad_id_fkId = new IntegerExpression("actividad_id_fk.id", this.getDetachedCriteria());
		actividad_id_fk = new AssociationExpression("actividad_id_fk", this.getDetachedCriteria());
		estudiante_id_fkId = new IntegerExpression("estudiante_id_fk.id", this.getDetachedCriteria());
		estudiante_id_fk = new AssociationExpression("estudiante_id_fk", this.getDetachedCriteria());
		nota = new DoubleExpression("nota", this.getDetachedCriteria());
	}
	
	public ActividadDetachedCriteria createActividad_id_fkCriteria() {
		return new ActividadDetachedCriteria(createCriteria("actividad_id_fk"));
	}
	
	public EstudianteDetachedCriteria createEstudiante_id_fkCriteria() {
		return new EstudianteDetachedCriteria(createCriteria("estudiante_id_fk"));
	}
	
	public Nota uniqueNota(PersistentSession session) {
		return (Nota) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Nota[] listNota(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Nota[]) list.toArray(new Nota[list.size()]);
	}
}

