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

public class DirectivoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression persona_id_fkId;
	public final AssociationExpression persona_id_fk;
	public final IntegerExpression institucion_id_fkId;
	public final AssociationExpression institucion_id_fk;
	
	public DirectivoDetachedCriteria() {
		super(orm.Directivo.class, orm.DirectivoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		persona_id_fkId = new IntegerExpression("persona_id_fk.id", this.getDetachedCriteria());
		persona_id_fk = new AssociationExpression("persona_id_fk", this.getDetachedCriteria());
		institucion_id_fkId = new IntegerExpression("institucion_id_fk.id", this.getDetachedCriteria());
		institucion_id_fk = new AssociationExpression("institucion_id_fk", this.getDetachedCriteria());
	}
	
	public DirectivoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.DirectivoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		persona_id_fkId = new IntegerExpression("persona_id_fk.id", this.getDetachedCriteria());
		persona_id_fk = new AssociationExpression("persona_id_fk", this.getDetachedCriteria());
		institucion_id_fkId = new IntegerExpression("institucion_id_fk.id", this.getDetachedCriteria());
		institucion_id_fk = new AssociationExpression("institucion_id_fk", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria createPersona_id_fkCriteria() {
		return new PersonaDetachedCriteria(createCriteria("persona_id_fk"));
	}
	
	public InstitucionDetachedCriteria createInstitucion_id_fkCriteria() {
		return new InstitucionDetachedCriteria(createCriteria("institucion_id_fk"));
	}
	
	public Directivo uniqueDirectivo(PersistentSession session) {
		return (Directivo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Directivo[] listDirectivo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Directivo[]) list.toArray(new Directivo[list.size()]);
	}
}

