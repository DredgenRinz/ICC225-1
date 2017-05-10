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

public class Actividad {
	public Actividad() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_ACTIVIDAD_ASIGNATURA_ID_FK) {
			this.asignatura_id_fk = (orm.Asignatura) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_ACTIVIDAD_NOTA) {
			this.nota = (orm.Nota) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Asignatura asignatura_id_fk;
	
	private String informacion;
	
	private orm.Nota nota;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setInformacion(String value) {
		this.informacion = value;
	}
	
	public String getInformacion() {
		return informacion;
	}
	
	public void setAsignatura_id_fk(orm.Asignatura value) {
		if (asignatura_id_fk != null) {
			asignatura_id_fk.actividad.remove(this);
		}
		if (value != null) {
			value.actividad.add(this);
		}
	}
	
	public orm.Asignatura getAsignatura_id_fk() {
		return asignatura_id_fk;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Asignatura_id_fk(orm.Asignatura value) {
		this.asignatura_id_fk = value;
	}
	
	private orm.Asignatura getORM_Asignatura_id_fk() {
		return asignatura_id_fk;
	}
	
	public void setNota(orm.Nota value) {
		if (this.nota != value) {
			orm.Nota lnota = this.nota;
			this.nota = value;
			if (value != null) {
				nota.setActividad_id_fk(this);
			}
			if (lnota != null && lnota.getActividad_id_fk() == this) {
				lnota.setActividad_id_fk(null);
			}
		}
	}
	
	public orm.Nota getNota() {
		return nota;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
