/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteLibroClaseData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.LibroClasePersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Estudiante lormEstudiante = orm.EstudianteDAO.loadEstudianteByQuery(null, null);
			// Delete the persistent object
			orm.EstudianteDAO.delete(lormEstudiante);
			orm.Persona lormPersona = orm.PersonaDAO.loadPersonaByQuery(null, null);
			// Delete the persistent object
			orm.PersonaDAO.delete(lormPersona);
			orm.Profesor lormProfesor = orm.ProfesorDAO.loadProfesorByQuery(null, null);
			// Delete the persistent object
			orm.ProfesorDAO.delete(lormProfesor);
			orm.Apoderado lormApoderado = orm.ApoderadoDAO.loadApoderadoByQuery(null, null);
			// Delete the persistent object
			orm.ApoderadoDAO.delete(lormApoderado);
			orm.Directivo lormDirectivo = orm.DirectivoDAO.loadDirectivoByQuery(null, null);
			// Delete the persistent object
			orm.DirectivoDAO.delete(lormDirectivo);
			orm.Curso lormCurso = orm.CursoDAO.loadCursoByQuery(null, null);
			// Delete the persistent object
			orm.CursoDAO.delete(lormCurso);
			orm.Asignatura lormAsignatura = orm.AsignaturaDAO.loadAsignaturaByQuery(null, null);
			// Delete the persistent object
			orm.AsignaturaDAO.delete(lormAsignatura);
			orm.Actividad lormActividad = orm.ActividadDAO.loadActividadByQuery(null, null);
			// Delete the persistent object
			orm.ActividadDAO.delete(lormActividad);
			orm.Nota lormNota = orm.NotaDAO.loadNotaByQuery(null, null);
			// Delete the persistent object
			orm.NotaDAO.delete(lormNota);
			orm.Institucion lormInstitucion = orm.InstitucionDAO.loadInstitucionByQuery(null, null);
			// Delete the persistent object
			orm.InstitucionDAO.delete(lormInstitucion);
			orm.Asistencia lormAsistencia = orm.AsistenciaDAO.loadAsistenciaByQuery(null, null);
			// Delete the persistent object
			orm.AsistenciaDAO.delete(lormAsistencia);
			orm.Anotaciones lormAnotaciones = orm.AnotacionesDAO.loadAnotacionesByQuery(null, null);
			// Delete the persistent object
			orm.AnotacionesDAO.delete(lormAnotaciones);
			orm.Curso_estudiante lormCurso_estudiante = orm.Curso_estudianteDAO.loadCurso_estudianteByQuery(null, null);
			// Delete the persistent object
			orm.Curso_estudianteDAO.delete(lormCurso_estudiante);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteLibroClaseData deleteLibroClaseData = new DeleteLibroClaseData();
			try {
				deleteLibroClaseData.deleteTestData();
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
