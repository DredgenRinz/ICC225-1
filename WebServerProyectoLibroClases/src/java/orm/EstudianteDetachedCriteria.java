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

public class EstudianteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression persona_id_fkId;
	public final AssociationExpression persona_id_fk;
	public final IntegerExpression apoderado_id_fkId;
	public final AssociationExpression apoderado_id_fk;
	public final CollectionExpression nota;
	public final CollectionExpression curso_estudiante;
	public final CollectionExpression anotaciones;
	public final CollectionExpression asistencia;
	
	public EstudianteDetachedCriteria() {
		super(orm.Estudiante.class, orm.EstudianteCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		persona_id_fkId = new IntegerExpression("persona_id_fk.id", this.getDetachedCriteria());
		persona_id_fk = new AssociationExpression("persona_id_fk", this.getDetachedCriteria());
		apoderado_id_fkId = new IntegerExpression("apoderado_id_fk.id", this.getDetachedCriteria());
		apoderado_id_fk = new AssociationExpression("apoderado_id_fk", this.getDetachedCriteria());
		nota = new CollectionExpression("ORM_Nota", this.getDetachedCriteria());
		curso_estudiante = new CollectionExpression("ORM_Curso_estudiante", this.getDetachedCriteria());
		anotaciones = new CollectionExpression("ORM_Anotaciones", this.getDetachedCriteria());
		asistencia = new CollectionExpression("ORM_Asistencia", this.getDetachedCriteria());
	}
	
	public EstudianteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.EstudianteCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		persona_id_fkId = new IntegerExpression("persona_id_fk.id", this.getDetachedCriteria());
		persona_id_fk = new AssociationExpression("persona_id_fk", this.getDetachedCriteria());
		apoderado_id_fkId = new IntegerExpression("apoderado_id_fk.id", this.getDetachedCriteria());
		apoderado_id_fk = new AssociationExpression("apoderado_id_fk", this.getDetachedCriteria());
		nota = new CollectionExpression("ORM_Nota", this.getDetachedCriteria());
		curso_estudiante = new CollectionExpression("ORM_Curso_estudiante", this.getDetachedCriteria());
		anotaciones = new CollectionExpression("ORM_Anotaciones", this.getDetachedCriteria());
		asistencia = new CollectionExpression("ORM_Asistencia", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria createPersona_id_fkCriteria() {
		return new PersonaDetachedCriteria(createCriteria("persona_id_fk"));
	}
	
	public ApoderadoDetachedCriteria createApoderado_id_fkCriteria() {
		return new ApoderadoDetachedCriteria(createCriteria("apoderado_id_fk"));
	}
	
	public NotaDetachedCriteria createNotaCriteria() {
		return new NotaDetachedCriteria(createCriteria("ORM_Nota"));
	}
	
	public Curso_estudianteDetachedCriteria createCurso_estudianteCriteria() {
		return new Curso_estudianteDetachedCriteria(createCriteria("ORM_Curso_estudiante"));
	}
	
	public AnotacionesDetachedCriteria createAnotacionesCriteria() {
		return new AnotacionesDetachedCriteria(createCriteria("ORM_Anotaciones"));
	}
	
	public AsistenciaDetachedCriteria createAsistenciaCriteria() {
		return new AsistenciaDetachedCriteria(createCriteria("ORM_Asistencia"));
	}
	
	public Estudiante uniqueEstudiante(PersistentSession session) {
		return (Estudiante) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Estudiante[] listEstudiante(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Estudiante[]) list.toArray(new Estudiante[list.size()]);
	}
}

