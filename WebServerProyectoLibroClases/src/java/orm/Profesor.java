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

public class Profesor {
	public Profesor() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_PROFESOR_ANOTACIONES) {
			return ORM_anotaciones;
		}
		else if (key == orm.ORMConstants.KEY_PROFESOR_ASIGNATURA) {
			return ORM_asignatura;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id;
	
	private orm.Persona persona_id_fk;
	
	private java.util.Set ORM_anotaciones = new java.util.HashSet();
	
	private java.util.Set ORM_asignatura = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setPersona_id_fk(orm.Persona value) {
		if (this.persona_id_fk != value) {
			orm.Persona lpersona_id_fk = this.persona_id_fk;
			this.persona_id_fk = value;
			if (value != null) {
				persona_id_fk.setProfesor(this);
			}
			if (lpersona_id_fk != null && lpersona_id_fk.getProfesor() == this) {
				lpersona_id_fk.setProfesor(null);
			}
		}
	}
	
	public orm.Persona getPersona_id_fk() {
		return persona_id_fk;
	}
	
	private void setORM_Anotaciones(java.util.Set value) {
		this.ORM_anotaciones = value;
	}
	
	private java.util.Set getORM_Anotaciones() {
		return ORM_anotaciones;
	}
	
	public final orm.AnotacionesSetCollection anotaciones = new orm.AnotacionesSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_PROFESOR_ANOTACIONES, orm.ORMConstants.KEY_ANOTACIONES_PROFESOR_ID_FK, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Asignatura(java.util.Set value) {
		this.ORM_asignatura = value;
	}
	
	private java.util.Set getORM_Asignatura() {
		return ORM_asignatura;
	}
	
	public final orm.AsignaturaSetCollection asignatura = new orm.AsignaturaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_PROFESOR_ASIGNATURA, orm.ORMConstants.KEY_ASIGNATURA_PROFESORID_PK, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
