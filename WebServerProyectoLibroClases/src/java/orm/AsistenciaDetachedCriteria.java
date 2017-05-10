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

public class AsistenciaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression estudiante_id_fkId;
	public final AssociationExpression estudiante_id_fk;
	public final DateExpression fecha;
	
	public AsistenciaDetachedCriteria() {
		super(orm.Asistencia.class, orm.AsistenciaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		estudiante_id_fkId = new IntegerExpression("estudiante_id_fk.id", this.getDetachedCriteria());
		estudiante_id_fk = new AssociationExpression("estudiante_id_fk", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
	}
	
	public AsistenciaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.AsistenciaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		estudiante_id_fkId = new IntegerExpression("estudiante_id_fk.id", this.getDetachedCriteria());
		estudiante_id_fk = new AssociationExpression("estudiante_id_fk", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
	}
	
	public EstudianteDetachedCriteria createEstudiante_id_fkCriteria() {
		return new EstudianteDetachedCriteria(createCriteria("estudiante_id_fk"));
	}
	
	public Asistencia uniqueAsistencia(PersistentSession session) {
		return (Asistencia) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Asistencia[] listAsistencia(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Asistencia[]) list.toArray(new Asistencia[list.size()]);
	}
}

