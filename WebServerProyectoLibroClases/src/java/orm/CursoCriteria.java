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

public class CursoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression institucion_id_fkId;
	public final AssociationExpression institucion_id_fk;
	public final IntegerExpression grado;
	public final StringExpression letra;
	public final CollectionExpression asignatura;
	public final CollectionExpression curso_estudiante;
	
	public CursoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		institucion_id_fkId = new IntegerExpression("institucion_id_fk.id", this);
		institucion_id_fk = new AssociationExpression("institucion_id_fk", this);
		grado = new IntegerExpression("grado", this);
		letra = new StringExpression("letra", this);
		asignatura = new CollectionExpression("ORM_Asignatura", this);
		curso_estudiante = new CollectionExpression("ORM_Curso_estudiante", this);
	}
	
	public CursoCriteria(PersistentSession session) {
		this(session.createCriteria(Curso.class));
	}
	
	public CursoCriteria() throws PersistentException {
		this(orm.LibroClasePersistentManager.instance().getSession());
	}
	
	public InstitucionCriteria createInstitucion_id_fkCriteria() {
		return new InstitucionCriteria(createCriteria("institucion_id_fk"));
	}
	
	public AsignaturaCriteria createAsignaturaCriteria() {
		return new AsignaturaCriteria(createCriteria("ORM_Asignatura"));
	}
	
	public Curso_estudianteCriteria createCurso_estudianteCriteria() {
		return new Curso_estudianteCriteria(createCriteria("ORM_Curso_estudiante"));
	}
	
	public Curso uniqueCurso() {
		return (Curso) super.uniqueResult();
	}
	
	public Curso[] listCurso() {
		java.util.List list = super.list();
		return (Curso[]) list.toArray(new Curso[list.size()]);
	}

    @Override
    public Criteria addQueryHint(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

