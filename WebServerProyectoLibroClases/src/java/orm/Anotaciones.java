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

public class Anotaciones {
	public Anotaciones() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_ANOTACIONES_ESTUDIANTE_ID_FK) {
			this.estudiante_id_fk = (orm.Estudiante) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_ANOTACIONES_PROFESOR_ID_FK) {
			this.profesor_id_fk = (orm.Profesor) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Estudiante estudiante_id_fk;
	
	private orm.Profesor profesor_id_fk;
	
	private String anotacion;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setAnotacion(String value) {
		this.anotacion = value;
	}
	
	public String getAnotacion() {
		return anotacion;
	}
	
	public void setEstudiante_id_fk(orm.Estudiante value) {
		if (estudiante_id_fk != null) {
			estudiante_id_fk.anotaciones.remove(this);
		}
		if (value != null) {
			value.anotaciones.add(this);
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
	
	public void setProfesor_id_fk(orm.Profesor value) {
		if (profesor_id_fk != null) {
			profesor_id_fk.anotaciones.remove(this);
		}
		if (value != null) {
			value.anotaciones.add(this);
		}
	}
	
	public orm.Profesor getProfesor_id_fk() {
		return profesor_id_fk;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Profesor_id_fk(orm.Profesor value) {
		this.profesor_id_fk = value;
	}
	
	private orm.Profesor getORM_Profesor_id_fk() {
		return profesor_id_fk;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
