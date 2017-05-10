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

public class InstitucionCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final CollectionExpression curso;
	public final CollectionExpression directivo;
	
	public InstitucionCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		nombre = new StringExpression("nombre", this);
		curso = new CollectionExpression("ORM_Curso", this);
		directivo = new CollectionExpression("ORM_Directivo", this);
	}
	
	public InstitucionCriteria(PersistentSession session) {
		this(session.createCriteria(Institucion.class));
	}
	
	public InstitucionCriteria() throws PersistentException {
		this(orm.LibroClasePersistentManager.instance().getSession());
	}
	
	public CursoCriteria createCursoCriteria() {
		return new CursoCriteria(createCriteria("ORM_Curso"));
	}
	
	public DirectivoCriteria createDirectivoCriteria() {
		return new DirectivoCriteria(createCriteria("ORM_Directivo"));
	}
	
	public Institucion uniqueInstitucion() {
		return (Institucion) super.uniqueResult();
	}
	
	public Institucion[] listInstitucion() {
		java.util.List list = super.list();
		return (Institucion[]) list.toArray(new Institucion[list.size()]);
	}

    @Override
    public Criteria addQueryHint(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

