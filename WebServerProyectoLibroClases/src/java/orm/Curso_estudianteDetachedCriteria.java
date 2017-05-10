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

public class Curso_estudianteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression curso_id_fkId;
	public final AssociationExpression curso_id_fk;
	public final IntegerExpression estudiante_id_fkId;
	public final AssociationExpression estudiante_id_fk;
	
	public Curso_estudianteDetachedCriteria() {
		super(orm.Curso_estudiante.class, orm.Curso_estudianteCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		curso_id_fkId = new IntegerExpression("curso_id_fk.id", this.getDetachedCriteria());
		curso_id_fk = new AssociationExpression("curso_id_fk", this.getDetachedCriteria());
		estudiante_id_fkId = new IntegerExpression("estudiante_id_fk.id", this.getDetachedCriteria());
		estudiante_id_fk = new AssociationExpression("estudiante_id_fk", this.getDetachedCriteria());
	}
	
	public Curso_estudianteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Curso_estudianteCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		curso_id_fkId = new IntegerExpression("curso_id_fk.id", this.getDetachedCriteria());
		curso_id_fk = new AssociationExpression("curso_id_fk", this.getDetachedCriteria());
		estudiante_id_fkId = new IntegerExpression("estudiante_id_fk.id", this.getDetachedCriteria());
		estudiante_id_fk = new AssociationExpression("estudiante_id_fk", this.getDetachedCriteria());
	}
	
	public CursoDetachedCriteria createCurso_id_fkCriteria() {
		return new CursoDetachedCriteria(createCriteria("curso_id_fk"));
	}
	
	public EstudianteDetachedCriteria createEstudiante_id_fkCriteria() {
		return new EstudianteDetachedCriteria(createCriteria("estudiante_id_fk"));
	}
	
	public Curso_estudiante uniqueCurso_estudiante(PersistentSession session) {
		return (Curso_estudiante) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Curso_estudiante[] listCurso_estudiante(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Curso_estudiante[]) list.toArray(new Curso_estudiante[list.size()]);
	}
}

