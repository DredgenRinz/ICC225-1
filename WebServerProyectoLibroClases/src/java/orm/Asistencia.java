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

public class Asistencia {
	public Asistencia() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_ASISTENCIA_ESTUDIANTE_ID_FK) {
			this.estudiante_id_fk = (orm.Estudiante) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Estudiante estudiante_id_fk;
	
	private java.util.Date fecha;
	
	private Byte asist;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setFecha(java.util.Date value) {
		this.fecha = value;
	}
	
	public java.util.Date getFecha() {
		return fecha;
	}
	
	public void setAsist(byte value) {
		setAsist(new Byte(value));
	}
	
	public void setAsist(Byte value) {
		this.asist = value;
	}
	
	public Byte getAsist() {
		return asist;
	}
	
	public void setEstudiante_id_fk(orm.Estudiante value) {
		if (estudiante_id_fk != null) {
			estudiante_id_fk.asistencia.remove(this);
		}
		if (value != null) {
			value.asistencia.add(this);
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
