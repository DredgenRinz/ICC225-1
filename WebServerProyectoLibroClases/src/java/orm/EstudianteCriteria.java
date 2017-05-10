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

public class EstudianteCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression persona_id_fkId;
	public final AssociationExpression persona_id_fk;
	public final IntegerExpression apoderado_id_fkId;
	public final AssociationExpression apoderado_id_fk;
	public final CollectionExpression nota;
	public final CollectionExpression curso_estudiante;
	public final CollectionExpression anotaciones;
	public final CollectionExpression asistencia;
	
	public EstudianteCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		persona_id_fkId = new IntegerExpression("persona_id_fk.id", this);
		persona_id_fk = new AssociationExpression("persona_id_fk", this);
		apoderado_id_fkId = new IntegerExpression("apoderado_id_fk.id", this);
		apoderado_id_fk = new AssociationExpression("apoderado_id_fk", this);
		nota = new CollectionExpression("ORM_Nota", this);
		curso_estudiante = new CollectionExpression("ORM_Curso_estudiante", this);
		anotaciones = new CollectionExpression("ORM_Anotaciones", this);
		asistencia = new CollectionExpression("ORM_Asistencia", this);
	}
	
	public EstudianteCriteria(PersistentSession session) {
		this(session.createCriteria(Estudiante.class));
	}
	
	public EstudianteCriteria() throws PersistentException {
		this(orm.LibroClasePersistentManager.instance().getSession());
	}
	
	public PersonaCriteria createPersona_id_fkCriteria() {
		return new PersonaCriteria(createCriteria("persona_id_fk"));
	}
	
	public ApoderadoCriteria createApoderado_id_fkCriteria() {
		return new ApoderadoCriteria(createCriteria("apoderado_id_fk"));
	}
	
	public NotaCriteria createNotaCriteria() {
		return new NotaCriteria(createCriteria("ORM_Nota"));
	}
	
	public Curso_estudianteCriteria createCurso_estudianteCriteria() {
		return new Curso_estudianteCriteria(createCriteria("ORM_Curso_estudiante"));
	}
	
	public AnotacionesCriteria createAnotacionesCriteria() {
		return new AnotacionesCriteria(createCriteria("ORM_Anotaciones"));
	}
	
	public AsistenciaCriteria createAsistenciaCriteria() {
		return new AsistenciaCriteria(createCriteria("ORM_Asistencia"));
	}
	
	public Estudiante uniqueEstudiante() {
		return (Estudiante) super.uniqueResult();
	}
	
	public Estudiante[] listEstudiante() {
		java.util.List list = super.list();
		return (Estudiante[]) list.toArray(new Estudiante[list.size()]);
	}

    @Override
    public Criteria addQueryHint(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

