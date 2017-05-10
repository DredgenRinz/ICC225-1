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

public class Curso_estudiante {
	public Curso_estudiante() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_CURSO_ESTUDIANTE_CURSO_ID_FK) {
			this.curso_id_fk = (orm.Curso) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_CURSO_ESTUDIANTE_ESTUDIANTE_ID_FK) {
			this.estudiante_id_fk = (orm.Estudiante) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Curso curso_id_fk;
	
	private orm.Estudiante estudiante_id_fk;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setCurso_id_fk(orm.Curso value) {
		if (curso_id_fk != null) {
			curso_id_fk.curso_estudiante.remove(this);
		}
		if (value != null) {
			value.curso_estudiante.add(this);
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
	
	public void setEstudiante_id_fk(orm.Estudiante value) {
		if (estudiante_id_fk != null) {
			estudiante_id_fk.curso_estudiante.remove(this);
		}
		if (value != null) {
			value.curso_estudiante.add(this);
		}
	}
	
	public orm.Estudiante getEstudiante_id_fk() {
		return estudiante_id_fk;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Estudiante_id_fk(orm.Estudiante value) {
		this.estudiante_id_fk = value;
	}
	
	private orm.Estudiante getORM_Estudiante_id_fk() {
		return estudiante_id_fk;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
