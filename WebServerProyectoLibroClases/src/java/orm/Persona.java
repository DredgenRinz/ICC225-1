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

/**
 * Tabla que contiene todos los registros transversales de persona
 */
public class Persona {
	public Persona() {
	}
	
	private int id;
	
	private String nombre;
	
	private String rut;
	
	private orm.Estudiante estudiante;
	
	private orm.Apoderado apoderado;
	
	private orm.Directivo directivo;
	
	private orm.Profesor profesor;
	
	/**
	 * Clave primaria de Persona
	 */
	private void setId(int value) {
		this.id = value;
	}
	
	/**
	 * Clave primaria de Persona
	 */
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setRut(String value) {
		this.rut = value;
	}
	
	public String getRut() {
		return rut;
	}
	
	public void setEstudiante(orm.Estudiante value) {
		if (this.estudiante != value) {
			orm.Estudiante lestudiante = this.estudiante;
			this.estudiante = value;
			if (value != null) {
				estudiante.setPersona_id_fk(this);
			}
			if (lestudiante != null && lestudiante.getPersona_id_fk() == this) {
				lestudiante.setPersona_id_fk(null);
			}
		}
	}
	
	public orm.Estudiante getEstudiante() {
		return estudiante;
	}
	
	public void setApoderado(orm.Apoderado value) {
		if (this.apoderado != value) {
			orm.Apoderado lapoderado = this.apoderado;
			this.apoderado = value;
			if (value != null) {
				apoderado.setPersona_id_fk(this);
			}
			if (lapoderado != null && lapoderado.getPersona_id_fk() == this) {
				lapoderado.setPersona_id_fk(null);
			}
		}
	}
	
	public orm.Apoderado getApoderado() {
		return apoderado;
	}
	
	public void setDirectivo(orm.Directivo value) {
		if (this.directivo != value) {
			orm.Directivo ldirectivo = this.directivo;
			this.directivo = value;
			if (value != null) {
				directivo.setPersona_id_fk(this);
			}
			if (ldirectivo != null && ldirectivo.getPersona_id_fk() == this) {
				ldirectivo.setPersona_id_fk(null);
			}
		}
	}
	
	public orm.Directivo getDirectivo() {
		return directivo;
	}
	
	public void setProfesor(orm.Profesor value) {
		if (this.profesor != value) {
			orm.Profesor lprofesor = this.profesor;
			this.profesor = value;
			if (value != null) {
				profesor.setPersona_id_fk(this);
			}
			if (lprofesor != null && lprofesor.getPersona_id_fk() == this) {
				lprofesor.setPersona_id_fk(null);
			}
		}
	}
	
	public orm.Profesor getProfesor() {
		return profesor;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
