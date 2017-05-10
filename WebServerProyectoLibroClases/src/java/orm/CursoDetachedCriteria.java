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

public class CursoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression institucion_id_fkId;
	public final AssociationExpression institucion_id_fk;
	public final IntegerExpression grado;
	public final StringExpression letra;
	public final CollectionExpression asignatura;
	public final CollectionExpression curso_estudiante;
	
	public CursoDetachedCriteria() {
		super(orm.Curso.class, orm.CursoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		institucion_id_fkId = new IntegerExpression("institucion_id_fk.id", this.getDetachedCriteria());
		institucion_id_fk = new AssociationExpression("institucion_id_fk", this.getDetachedCriteria());
		grado = new IntegerExpression("grado", this.getDetachedCriteria());
		letra = new StringExpression("letra", this.getDetachedCriteria());
		asignatura = new CollectionExpression("ORM_Asignatura", this.getDetachedCriteria());
		curso_estudiante = new CollectionExpression("ORM_Curso_estudiante", this.getDetachedCriteria());
	}
	
	public CursoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.CursoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		institucion_id_fkId = new IntegerExpression("institucion_id_fk.id", this.getDetachedCriteria());
		institucion_id_fk = new AssociationExpression("institucion_id_fk", this.getDetachedCriteria());
		grado = new IntegerExpression("grado", this.getDetachedCriteria());
		letra = new StringExpression("letra", this.getDetachedCriteria());
		asignatura = new CollectionExpression("ORM_Asignatura", this.getDetachedCriteria());
		curso_estudiante = new CollectionExpression("ORM_Curso_estudiante", this.getDetachedCriteria());
	}
	
	public InstitucionDetachedCriteria createInstitucion_id_fkCriteria() {
		return new InstitucionDetachedCriteria(createCriteria("institucion_id_fk"));
	}
	
	public AsignaturaDetachedCriteria createAsignaturaCriteria() {
		return new AsignaturaDetachedCriteria(createCriteria("ORM_Asignatura"));
	}
	
	public Curso_estudianteDetachedCriteria createCurso_estudianteCriteria() {
		return new Curso_estudianteDetachedCriteria(createCriteria("ORM_Curso_estudiante"));
	}
	
	public Curso uniqueCurso(PersistentSession session) {
		return (Curso) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Curso[] listCurso(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Curso[]) list.toArray(new Curso[list.size()]);
	}
}

