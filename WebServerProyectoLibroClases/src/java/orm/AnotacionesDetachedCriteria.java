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

public class AnotacionesDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression estudiante_id_fkId;
	public final AssociationExpression estudiante_id_fk;
	public final IntegerExpression profesor_id_fkId;
	public final AssociationExpression profesor_id_fk;
	public final StringExpression anotacion;
	
	public AnotacionesDetachedCriteria() {
		super(orm.Anotaciones.class, orm.AnotacionesCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		estudiante_id_fkId = new IntegerExpression("estudiante_id_fk.id", this.getDetachedCriteria());
		estudiante_id_fk = new AssociationExpression("estudiante_id_fk", this.getDetachedCriteria());
		profesor_id_fkId = new IntegerExpression("profesor_id_fk.id", this.getDetachedCriteria());
		profesor_id_fk = new AssociationExpression("profesor_id_fk", this.getDetachedCriteria());
		anotacion = new StringExpression("anotacion", this.getDetachedCriteria());
	}
	
	public AnotacionesDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.AnotacionesCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		estudiante_id_fkId = new IntegerExpression("estudiante_id_fk.id", this.getDetachedCriteria());
		estudiante_id_fk = new AssociationExpression("estudiante_id_fk", this.getDetachedCriteria());
		profesor_id_fkId = new IntegerExpression("profesor_id_fk.id", this.getDetachedCriteria());
		profesor_id_fk = new AssociationExpression("profesor_id_fk", this.getDetachedCriteria());
		anotacion = new StringExpression("anotacion", this.getDetachedCriteria());
	}
	
	public EstudianteDetachedCriteria createEstudiante_id_fkCriteria() {
		return new EstudianteDetachedCriteria(createCriteria("estudiante_id_fk"));
	}
	
	public ProfesorDetachedCriteria createProfesor_id_fkCriteria() {
		return new ProfesorDetachedCriteria(createCriteria("profesor_id_fk"));
	}
	
	public Anotaciones uniqueAnotaciones(PersistentSession session) {
		return (Anotaciones) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Anotaciones[] listAnotaciones(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Anotaciones[]) list.toArray(new Anotaciones[list.size()]);
	}
}

