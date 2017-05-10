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

public class Asignatura {
	public Asignatura() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_ASIGNATURA_ACTIVIDAD) {
			return ORM_actividad;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_ASIGNATURA_CURSO_ID_FK) {
			this.curso_id_fk = (orm.Curso) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_ASIGNATURA_PROFESORID_PK) {
			this.profesorid_pk = (orm.Profesor) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Curso curso_id_fk;
	
	private orm.Profesor profesorid_pk;
	
	private String objetivos;
	
	private java.util.Set ORM_actividad = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setObjetivos(String value) {
		this.objetivos = value;
	}
	
	public String getObjetivos() {
		return objetivos;
	}
	
	public void setCurso_id_fk(orm.Curso value) {
		if (curso_id_fk != null) {
			curso_id_fk.asignatura.remove(this);
		}
		if (value != null) {
			value.asignatura.add(this);
		}
	}
	
	public orm.Curso getCurso_id_fk() {
		return curso_id_fk;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Curso_id_fk(orm.Curso value) {
		this.curso_id_fk = value;
	}
	
	private orm.Curso getORM_Curso_id_fk() {
		return curso_id_fk;
	}
	
	public void setProfesorid_pk(orm.Profesor value) {
		if (profesorid_pk != null) {
			profesorid_pk.asignatura.remove(this);
		}
		if (value != null) {
			value.asignatura.add(this);
		}
	}
	
	public orm.Profesor getProfesorid_pk() {
		return profesorid_pk;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Profesorid_pk(orm.Profesor value) {
		this.profesorid_pk = value;
	}
	
	private orm.Profesor getORM_Profesorid_pk() {
		return profesorid_pk;
	}
	
	private void setORM_Actividad(java.util.Set value) {
		this.ORM_actividad = value;
	}
	
	private java.util.Set getORM_Actividad() {
		return ORM_actividad;
	}
	
	public final orm.ActividadSetCollection actividad = new orm.ActividadSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_ASIGNATURA_ACTIVIDAD, orm.ORMConstants.KEY_ACTIVIDAD_ASIGNATURA_ID_FK, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
