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

public class InstitucionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final CollectionExpression curso;
	public final CollectionExpression directivo;
	
	public InstitucionDetachedCriteria() {
		super(orm.Institucion.class, orm.InstitucionCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		curso = new CollectionExpression("ORM_Curso", this.getDetachedCriteria());
		directivo = new CollectionExpression("ORM_Directivo", this.getDetachedCriteria());
	}
	
	public InstitucionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.InstitucionCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		curso = new CollectionExpression("ORM_Curso", this.getDetachedCriteria());
		directivo = new CollectionExpression("ORM_Directivo", this.getDetachedCriteria());
	}
	
	public CursoDetachedCriteria createCursoCriteria() {
		return new CursoDetachedCriteria(createCriteria("ORM_Curso"));
	}
	
	public DirectivoDetachedCriteria createDirectivoCriteria() {
		return new DirectivoDetachedCriteria(createCriteria("ORM_Directivo"));
	}
	
	public Institucion uniqueInstitucion(PersistentSession session) {
		return (Institucion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Institucion[] listInstitucion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Institucion[]) list.toArray(new Institucion[list.size()]);
	}
}

