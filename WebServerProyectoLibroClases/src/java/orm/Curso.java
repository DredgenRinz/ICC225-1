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

public class Curso {
	public Curso() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_CURSO_ASIGNATURA) {
			return ORM_asignatura;
		}
		else if (key == orm.ORMConstants.KEY_CURSO_CURSO_ESTUDIANTE) {
			return ORM_curso_estudiante;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_CURSO_INSTITUCION_ID_FK) {
			this.institucion_id_fk = (orm.Institucion) owner;
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
	
	private orm.Institucion institucion_id_fk;
	
	private Integer grado;
	
	private String letra;
	
	private java.util.Set ORM_asignatura = new java.util.HashSet();
	
	private java.util.Set ORM_curso_estudiante = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setGrado(int value) {
		setGrado(new Integer(value));
	}
	
	public void setGrado(Integer value) {
		this.grado = value;
	}
	
	public Integer getGrado() {
		return grado;
	}
	
	public void setLetra(String value) {
		this.letra = value;
	}
	
	public String getLetra() {
		return letra;
	}
	
	public void setInstitucion_id_fk(orm.Institucion value) {
		if (institucion_id_fk != null) {
			institucion_id_fk.curso.remove(this);
		}
		if (value != null) {
			value.curso.add(this);
		}
	}
	
	public orm.Institucion getInstitucion_id_fk() {
		return institucion_id_fk;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Institucion_id_fk(orm.Institucion value) {
		this.institucion_id_fk = value;
	}
	
	private orm.Institucion getORM_Institucion_id_fk() {
		return institucion_id_fk;
	}
	
	private void setORM_Asignatura(java.util.Set value) {
		this.ORM_asignatura = value;
	}
	
	private java.util.Set getORM_Asignatura() {
		return ORM_asignatura;
	}
	
	public final orm.AsignaturaSetCollection asignatura = new orm.AsignaturaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CURSO_ASIGNATURA, orm.ORMConstants.KEY_ASIGNATURA_CURSO_ID_FK, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Curso_estudiante(java.util.Set value) {
		this.ORM_curso_estudiante = value;
	}
	
	private java.util.Set getORM_Curso_estudiante() {
		return ORM_curso_estudiante;
	}
	
	public final orm.Curso_estudianteSetCollection curso_estudiante = new orm.Curso_estudianteSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CURSO_CURSO_ESTUDIANTE, orm.ORMConstants.KEY_CURSO_ESTUDIANTE_CURSO_ID_FK, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
