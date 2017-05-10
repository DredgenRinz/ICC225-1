/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListLibroClaseData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Estudiante...");
		orm.Estudiante[] ormEstudiantes = orm.EstudianteDAO.listEstudianteByQuery(null, null);
		int length = Math.min(ormEstudiantes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormEstudiantes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Persona...");
		orm.Persona[] ormPersonas = orm.PersonaDAO.listPersonaByQuery(null, null);
		length = Math.min(ormPersonas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormPersonas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Profesor...");
		orm.Profesor[] ormProfesors = orm.ProfesorDAO.listProfesorByQuery(null, null);
		length = Math.min(ormProfesors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormProfesors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Apoderado...");
		orm.Apoderado[] ormApoderados = orm.ApoderadoDAO.listApoderadoByQuery(null, null);
		length = Math.min(ormApoderados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormApoderados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Directivo...");
		orm.Directivo[] ormDirectivos = orm.DirectivoDAO.listDirectivoByQuery(null, null);
		length = Math.min(ormDirectivos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormDirectivos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Curso...");
		orm.Curso[] ormCursos = orm.CursoDAO.listCursoByQuery(null, null);
		length = Math.min(ormCursos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormCursos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Asignatura...");
		orm.Asignatura[] ormAsignaturas = orm.AsignaturaDAO.listAsignaturaByQuery(null, null);
		length = Math.min(ormAsignaturas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormAsignaturas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Actividad...");
		orm.Actividad[] ormActividads = orm.ActividadDAO.listActividadByQuery(null, null);
		length = Math.min(ormActividads.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormActividads[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Nota...");
		orm.Nota[] ormNotas = orm.NotaDAO.listNotaByQuery(null, null);
		length = Math.min(ormNotas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormNotas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Institucion...");
		orm.Institucion[] ormInstitucions = orm.InstitucionDAO.listInstitucionByQuery(null, null);
		length = Math.min(ormInstitucions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormInstitucions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Asistencia...");
		orm.Asistencia[] ormAsistencias = orm.AsistenciaDAO.listAsistenciaByQuery(null, null);
		length = Math.min(ormAsistencias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormAsistencias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Anotaciones...");
		orm.Anotaciones[] ormAnotacioneses = orm.AnotacionesDAO.listAnotacionesByQuery(null, null);
		length = Math.min(ormAnotacioneses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormAnotacioneses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Curso_estudiante...");
		orm.Curso_estudiante[] ormCurso_estudiantes = orm.Curso_estudianteDAO.listCurso_estudianteByQuery(null, null);
		length = Math.min(ormCurso_estudiantes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormCurso_estudiantes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Estudiante by Criteria...");
		orm.EstudianteCriteria lormEstudianteCriteria = new orm.EstudianteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormEstudianteCriteria.id.eq();
		lormEstudianteCriteria.setMaxResults(ROW_COUNT);
		orm.Estudiante[] ormEstudiantes = lormEstudianteCriteria.listEstudiante();
		int length =ormEstudiantes== null ? 0 : Math.min(ormEstudiantes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormEstudiantes[i]);
		}
		System.out.println(length + " Estudiante record(s) retrieved."); 
		
		System.out.println("Listing Persona by Criteria...");
		orm.PersonaCriteria lormPersonaCriteria = new orm.PersonaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormPersonaCriteria.id.eq();
		lormPersonaCriteria.setMaxResults(ROW_COUNT);
		orm.Persona[] ormPersonas = lormPersonaCriteria.listPersona();
		length =ormPersonas== null ? 0 : Math.min(ormPersonas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormPersonas[i]);
		}
		System.out.println(length + " Persona record(s) retrieved."); 
		
		System.out.println("Listing Profesor by Criteria...");
		orm.ProfesorCriteria lormProfesorCriteria = new orm.ProfesorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormProfesorCriteria.id.eq();
		lormProfesorCriteria.setMaxResults(ROW_COUNT);
		orm.Profesor[] ormProfesors = lormProfesorCriteria.listProfesor();
		length =ormProfesors== null ? 0 : Math.min(ormProfesors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormProfesors[i]);
		}
		System.out.println(length + " Profesor record(s) retrieved."); 
		
		System.out.println("Listing Apoderado by Criteria...");
		orm.ApoderadoCriteria lormApoderadoCriteria = new orm.ApoderadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormApoderadoCriteria.id.eq();
		lormApoderadoCriteria.setMaxResults(ROW_COUNT);
		orm.Apoderado[] ormApoderados = lormApoderadoCriteria.listApoderado();
		length =ormApoderados== null ? 0 : Math.min(ormApoderados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormApoderados[i]);
		}
		System.out.println(length + " Apoderado record(s) retrieved."); 
		
		System.out.println("Listing Directivo by Criteria...");
		orm.DirectivoCriteria lormDirectivoCriteria = new orm.DirectivoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormDirectivoCriteria.id.eq();
		lormDirectivoCriteria.setMaxResults(ROW_COUNT);
		orm.Directivo[] ormDirectivos = lormDirectivoCriteria.listDirectivo();
		length =ormDirectivos== null ? 0 : Math.min(ormDirectivos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormDirectivos[i]);
		}
		System.out.println(length + " Directivo record(s) retrieved."); 
		
		System.out.println("Listing Curso by Criteria...");
		orm.CursoCriteria lormCursoCriteria = new orm.CursoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormCursoCriteria.id.eq();
		lormCursoCriteria.setMaxResults(ROW_COUNT);
		orm.Curso[] ormCursos = lormCursoCriteria.listCurso();
		length =ormCursos== null ? 0 : Math.min(ormCursos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormCursos[i]);
		}
		System.out.println(length + " Curso record(s) retrieved."); 
		
		System.out.println("Listing Asignatura by Criteria...");
		orm.AsignaturaCriteria lormAsignaturaCriteria = new orm.AsignaturaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormAsignaturaCriteria.id.eq();
		lormAsignaturaCriteria.setMaxResults(ROW_COUNT);
		orm.Asignatura[] ormAsignaturas = lormAsignaturaCriteria.listAsignatura();
		length =ormAsignaturas== null ? 0 : Math.min(ormAsignaturas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormAsignaturas[i]);
		}
		System.out.println(length + " Asignatura record(s) retrieved."); 
		
		System.out.println("Listing Actividad by Criteria...");
		orm.ActividadCriteria lormActividadCriteria = new orm.ActividadCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormActividadCriteria.id.eq();
		lormActividadCriteria.setMaxResults(ROW_COUNT);
		orm.Actividad[] ormActividads = lormActividadCriteria.listActividad();
		length =ormActividads== null ? 0 : Math.min(ormActividads.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormActividads[i]);
		}
		System.out.println(length + " Actividad record(s) retrieved."); 
		
		System.out.println("Listing Nota by Criteria...");
		orm.NotaCriteria lormNotaCriteria = new orm.NotaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormNotaCriteria.id.eq();
		lormNotaCriteria.setMaxResults(ROW_COUNT);
		orm.Nota[] ormNotas = lormNotaCriteria.listNota();
		length =ormNotas== null ? 0 : Math.min(ormNotas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormNotas[i]);
		}
		System.out.println(length + " Nota record(s) retrieved."); 
		
		System.out.println("Listing Institucion by Criteria...");
		orm.InstitucionCriteria lormInstitucionCriteria = new orm.InstitucionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormInstitucionCriteria.id.eq();
		lormInstitucionCriteria.setMaxResults(ROW_COUNT);
		orm.Institucion[] ormInstitucions = lormInstitucionCriteria.listInstitucion();
		length =ormInstitucions== null ? 0 : Math.min(ormInstitucions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormInstitucions[i]);
		}
		System.out.println(length + " Institucion record(s) retrieved."); 
		
		System.out.println("Listing Asistencia by Criteria...");
		orm.AsistenciaCriteria lormAsistenciaCriteria = new orm.AsistenciaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormAsistenciaCriteria.id.eq();
		lormAsistenciaCriteria.setMaxResults(ROW_COUNT);
		orm.Asistencia[] ormAsistencias = lormAsistenciaCriteria.listAsistencia();
		length =ormAsistencias== null ? 0 : Math.min(ormAsistencias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormAsistencias[i]);
		}
		System.out.println(length + " Asistencia record(s) retrieved."); 
		
		System.out.println("Listing Anotaciones by Criteria...");
		orm.AnotacionesCriteria lormAnotacionesCriteria = new orm.AnotacionesCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormAnotacionesCriteria.id.eq();
		lormAnotacionesCriteria.setMaxResults(ROW_COUNT);
		orm.Anotaciones[] ormAnotacioneses = lormAnotacionesCriteria.listAnotaciones();
		length =ormAnotacioneses== null ? 0 : Math.min(ormAnotacioneses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormAnotacioneses[i]);
		}
		System.out.println(length + " Anotaciones record(s) retrieved."); 
		
		System.out.println("Listing Curso_estudiante by Criteria...");
		orm.Curso_estudianteCriteria lormCurso_estudianteCriteria = new orm.Curso_estudianteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormCurso_estudianteCriteria.id.eq();
		lormCurso_estudianteCriteria.setMaxResults(ROW_COUNT);
		orm.Curso_estudiante[] ormCurso_estudiantes = lormCurso_estudianteCriteria.listCurso_estudiante();
		length =ormCurso_estudiantes== null ? 0 : Math.min(ormCurso_estudiantes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormCurso_estudiantes[i]);
		}
		System.out.println(length + " Curso_estudiante record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListLibroClaseData listLibroClaseData = new ListLibroClaseData();
			try {
				listLibroClaseData.listTestData();
				//listLibroClaseData.listByCriteria();
			}
			finally {
				orm.LibroClasePersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
