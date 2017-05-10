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

public class ProfesorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression persona_id_fkId;
	public final AssociationExpression persona_id_fk;
	public final CollectionExpression anotaciones;
	public final CollectionExpression asignatura;
	
	public ProfesorDetachedCriteria() {
		super(orm.Profesor.class, orm.ProfesorCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		persona_id_fkId = new IntegerExpression("persona_id_fk.id", this.getDetachedCriteria());
		persona_id_fk = new AssociationExpression("persona_id_fk", this.getDetachedCriteria());
		anotaciones = new CollectionExpression("ORM_Anotaciones", this.getDetachedCriteria());
		asignatura = new CollectionExpression("ORM_Asignatura", this.getDetachedCriteria());
	}
	
	public ProfesorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.ProfesorCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		persona_id_fkId = new IntegerExpression("persona_id_fk.id", this.getDetachedCriteria());
		persona_id_fk = new AssociationExpression("persona_id_fk", this.getDetachedCriteria());
		anotaciones = new CollectionExpression("ORM_Anotaciones", this.getDetachedCriteria());
		asignatura = new CollectionExpression("ORM_Asignatura", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria createPersona_id_fkCriteria() {
		return new PersonaDetachedCriteria(createCriteria("persona_id_fk"));
	}
	
	public AnotacionesDetachedCriteria createAnotacionesCriteria() {
		return new AnotacionesDetachedCriteria(createCriteria("ORM_Anotaciones"));
	}
	
	public AsignaturaDetachedCriteria createAsignaturaCriteria() {
		return new AsignaturaDetachedCriteria(createCriteria("ORM_Asignatura"));
	}
	
	public Profesor uniqueProfesor(PersistentSession session) {
		return (Profesor) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Profesor[] listProfesor(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Profesor[]) list.toArray(new Profesor[list.size()]);
	}
}

