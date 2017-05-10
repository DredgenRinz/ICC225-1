/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateLibroClaseData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm.LibroClasePersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Estudiante lormEstudiante = orm.EstudianteDAO.loadEstudianteByQuery(null, null);
			// Update the properties of the persistent object
			orm.EstudianteDAO.save(lormEstudiante);
			orm.Persona lormPersona = orm.PersonaDAO.loadPersonaByQuery(null, null);
			// Update the properties of the persistent object
			orm.PersonaDAO.save(lormPersona);
			orm.Profesor lormProfesor = orm.ProfesorDAO.loadProfesorByQuery(null, null);
			// Update the properties of the persistent object
			orm.ProfesorDAO.save(lormProfesor);
			orm.Apoderado lormApoderado = orm.ApoderadoDAO.loadApoderadoByQuery(null, null);
			// Update the properties of the persistent object
			orm.ApoderadoDAO.save(lormApoderado);
			orm.Directivo lormDirectivo = orm.DirectivoDAO.loadDirectivoByQuery(null, null);
			// Update the properties of the persistent object
			orm.DirectivoDAO.save(lormDirectivo);
			orm.Curso lormCurso = orm.CursoDAO.loadCursoByQuery(null, null);
			// Update the properties of the persistent object
			orm.CursoDAO.save(lormCurso);
			orm.Asignatura lormAsignatura = orm.AsignaturaDAO.loadAsignaturaByQuery(null, null);
			// Update the properties of the persistent object
			orm.AsignaturaDAO.save(lormAsignatura);
			orm.Actividad lormActividad = orm.ActividadDAO.loadActividadByQuery(null, null);
			// Update the properties of the persistent object
			orm.ActividadDAO.save(lormActividad);
			orm.Nota lormNota = orm.NotaDAO.loadNotaByQuery(null, null);
			// Update the properties of the persistent object
			orm.NotaDAO.save(lormNota);
			orm.Institucion lormInstitucion = orm.InstitucionDAO.loadInstitucionByQuery(null, null);
			// Update the properties of the persistent object
			orm.InstitucionDAO.save(lormInstitucion);
			orm.Asistencia lormAsistencia = orm.AsistenciaDAO.loadAsistenciaByQuery(null, null);
			// Update the properties of the persistent object
			orm.AsistenciaDAO.save(lormAsistencia);
			orm.Anotaciones lormAnotaciones = orm.AnotacionesDAO.loadAnotacionesByQuery(null, null);
			// Update the properties of the persistent object
			orm.AnotacionesDAO.save(lormAnotaciones);
			orm.Curso_estudiante lormCurso_estudiante = orm.Curso_estudianteDAO.loadCurso_estudianteByQuery(null, null);
			// Update the properties of the persistent object
			orm.Curso_estudianteDAO.save(lormCurso_estudiante);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Estudiante by EstudianteCriteria");
		orm.EstudianteCriteria lormEstudianteCriteria = new orm.EstudianteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormEstudianteCriteria.id.eq();
		System.out.println(lormEstudianteCriteria.uniqueEstudiante());
		
		System.out.println("Retrieving Persona by PersonaCriteria");
		orm.PersonaCriteria lormPersonaCriteria = new orm.PersonaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormPersonaCriteria.id.eq();
		System.out.println(lormPersonaCriteria.uniquePersona());
		
		System.out.println("Retrieving Profesor by ProfesorCriteria");
		orm.ProfesorCriteria lormProfesorCriteria = new orm.ProfesorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormProfesorCriteria.id.eq();
		System.out.println(lormProfesorCriteria.uniqueProfesor());
		
		System.out.println("Retrieving Apoderado by ApoderadoCriteria");
		orm.ApoderadoCriteria lormApoderadoCriteria = new orm.ApoderadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormApoderadoCriteria.id.eq();
		System.out.println(lormApoderadoCriteria.uniqueApoderado());
		
		System.out.println("Retrieving Directivo by DirectivoCriteria");
		orm.DirectivoCriteria lormDirectivoCriteria = new orm.DirectivoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormDirectivoCriteria.id.eq();
		System.out.println(lormDirectivoCriteria.uniqueDirectivo());
		
		System.out.println("Retrieving Curso by CursoCriteria");
		orm.CursoCriteria lormCursoCriteria = new orm.CursoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormCursoCriteria.id.eq();
		System.out.println(lormCursoCriteria.uniqueCurso());
		
		System.out.println("Retrieving Asignatura by AsignaturaCriteria");
		orm.AsignaturaCriteria lormAsignaturaCriteria = new orm.AsignaturaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormAsignaturaCriteria.id.eq();
		System.out.println(lormAsignaturaCriteria.uniqueAsignatura());
		
		System.out.println("Retrieving Actividad by ActividadCriteria");
		orm.ActividadCriteria lormActividadCriteria = new orm.ActividadCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormActividadCriteria.id.eq();
		System.out.println(lormActividadCriteria.uniqueActividad());
		
		System.out.println("Retrieving Nota by NotaCriteria");
		orm.NotaCriteria lormNotaCriteria = new orm.NotaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormNotaCriteria.id.eq();
		System.out.println(lormNotaCriteria.uniqueNota());
		
		System.out.println("Retrieving Institucion by InstitucionCriteria");
		orm.InstitucionCriteria lormInstitucionCriteria = new orm.InstitucionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormInstitucionCriteria.id.eq();
		System.out.println(lormInstitucionCriteria.uniqueInstitucion());
		
		System.out.println("Retrieving Asistencia by AsistenciaCriteria");
		orm.AsistenciaCriteria lormAsistenciaCriteria = new orm.AsistenciaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormAsistenciaCriteria.id.eq();
		System.out.println(lormAsistenciaCriteria.uniqueAsistencia());
		
		System.out.println("Retrieving Anotaciones by AnotacionesCriteria");
		orm.AnotacionesCriteria lormAnotacionesCriteria = new orm.AnotacionesCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormAnotacionesCriteria.id.eq();
		System.out.println(lormAnotacionesCriteria.uniqueAnotaciones());
		
		System.out.println("Retrieving Curso_estudiante by Curso_estudianteCriteria");
		orm.Curso_estudianteCriteria lormCurso_estudianteCriteria = new orm.Curso_estudianteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormCurso_estudianteCriteria.id.eq();
		System.out.println(lormCurso_estudianteCriteria.uniqueCurso_estudiante());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateLibroClaseData retrieveAndUpdateLibroClaseData = new RetrieveAndUpdateLibroClaseData();
			try {
				retrieveAndUpdateLibroClaseData.retrieveAndUpdateTestData();
				//retrieveAndUpdateLibroClaseData.retrieveByCriteria();
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
