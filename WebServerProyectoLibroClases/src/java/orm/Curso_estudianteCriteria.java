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

public class Curso_estudianteCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression curso_id_fkId;
	public final AssociationExpression curso_id_fk;
	public final IntegerExpression estudiante_id_fkId;
	public final AssociationExpression estudiante_id_fk;
	
	public Curso_estudianteCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		curso_id_fkId = new IntegerExpression("curso_id_fk.id", this);
		curso_id_fk = new AssociationExpression("curso_id_fk", this);
		estudiante_id_fkId = new IntegerExpression("estudiante_id_fk.id", this);
		estudiante_id_fk = new AssociationExpression("estudiante_id_fk", this);
	}
	
	public Curso_estudianteCriteria(PersistentSession session) {
		this(session.createCriteria(Curso_estudiante.class));
	}
	
	public Curso_estudianteCriteria() throws PersistentException {
		this(orm.LibroClasePersistentManager.instance().getSession());
	}
	
	public CursoCriteria createCurso_id_fkCriteria() {
		return new CursoCriteria(createCriteria("curso_id_fk"));
	}
	
	public EstudianteCriteria createEstudiante_id_fkCriteria() {
		return new EstudianteCriteria(createCriteria("estudiante_id_fk"));
	}
	
	public Curso_estudiante uniqueCurso_estudiante() {
		return (Curso_estudiante) super.uniqueResult();
	}
	
	public Curso_estudiante[] listCurso_estudiante() {
		java.util.List list = super.list();
		return (Curso_estudiante[]) list.toArray(new Curso_estudiante[list.size()]);
	}

    @Override
    public Criteria addQueryHint(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

