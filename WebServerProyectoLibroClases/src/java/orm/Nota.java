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

public class Nota {
	public Nota() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_NOTA_ACTIVIDAD_ID_FK) {
			this.actividad_id_fk = (orm.Actividad) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_NOTA_ESTUDIANTE_ID_FK) {
			this.estudiante_id_fk = (orm.Estudiante) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Actividad actividad_id_fk;
	
	private orm.Estudiante estudiante_id_fk;
	
	private Double nota;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNota(double value) {
		setNota(new Double(value));
	}
	
	public void setNota(Double value) {
		this.nota = value;
	}
	
	public Double getNota() {
		return nota;
	}
	
	public void setActividad_id_fk(orm.Actividad value) {
		if (this.actividad_id_fk != value) {
			orm.Actividad lactividad_id_fk = this.actividad_id_fk;
			this.actividad_id_fk = value;
			if (value != null) {
				actividad_id_fk.setNota(this);
			}
			if (lactividad_id_fk != null && lactividad_id_fk.getNota() == this) {
				lactividad_id_fk.setNota(null);
			}
		}
	}
	
	public orm.Actividad getActividad_id_fk() {
		return actividad_id_fk;
	}
	
	public void setEstudiante_id_fk(orm.Estudiante value) {
		if (estudiante_id_fk != null) {
			estudiante_id_fk.nota.remove(this);
		}
		if (value != null) {
			value.nota.add(this);
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
