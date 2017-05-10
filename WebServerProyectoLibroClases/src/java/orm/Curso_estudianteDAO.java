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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Curso_estudianteDAO {
	public static Curso_estudiante loadCurso_estudianteByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return loadCurso_estudianteByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_estudiante getCurso_estudianteByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return getCurso_estudianteByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_estudiante loadCurso_estudianteByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return loadCurso_estudianteByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_estudiante getCurso_estudianteByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return getCurso_estudianteByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_estudiante loadCurso_estudianteByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Curso_estudiante) session.load(orm.Curso_estudiante.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_estudiante getCurso_estudianteByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Curso_estudiante) session.get(orm.Curso_estudiante.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_estudiante loadCurso_estudianteByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Curso_estudiante) session.load(orm.Curso_estudiante.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_estudiante getCurso_estudianteByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Curso_estudiante) session.get(orm.Curso_estudiante.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCurso_estudiante(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return queryCurso_estudiante(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCurso_estudiante(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return queryCurso_estudiante(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_estudiante[] listCurso_estudianteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return listCurso_estudianteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_estudiante[] listCurso_estudianteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return listCurso_estudianteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCurso_estudiante(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Curso_estudiante as Curso_estudiante");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCurso_estudiante(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Curso_estudiante as Curso_estudiante");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Curso_estudiante", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_estudiante[] listCurso_estudianteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCurso_estudiante(session, condition, orderBy);
			return (Curso_estudiante[]) list.toArray(new Curso_estudiante[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_estudiante[] listCurso_estudianteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCurso_estudiante(session, condition, orderBy, lockMode);
			return (Curso_estudiante[]) list.toArray(new Curso_estudiante[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_estudiante loadCurso_estudianteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return loadCurso_estudianteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_estudiante loadCurso_estudianteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return loadCurso_estudianteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_estudiante loadCurso_estudianteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Curso_estudiante[] curso_estudiantes = listCurso_estudianteByQuery(session, condition, orderBy);
		if (curso_estudiantes != null && curso_estudiantes.length > 0)
			return curso_estudiantes[0];
		else
			return null;
	}
	
	public static Curso_estudiante loadCurso_estudianteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Curso_estudiante[] curso_estudiantes = listCurso_estudianteByQuery(session, condition, orderBy, lockMode);
		if (curso_estudiantes != null && curso_estudiantes.length > 0)
			return curso_estudiantes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCurso_estudianteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return iterateCurso_estudianteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCurso_estudianteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return iterateCurso_estudianteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCurso_estudianteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Curso_estudiante as Curso_estudiante");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCurso_estudianteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Curso_estudiante as Curso_estudiante");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Curso_estudiante", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_estudiante createCurso_estudiante() {
		return new orm.Curso_estudiante();
	}
	
	public static boolean save(orm.Curso_estudiante curso_estudiante) throws PersistentException {
		try {
			orm.LibroClasePersistentManager.instance().saveObject(curso_estudiante);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Curso_estudiante curso_estudiante) throws PersistentException {
		try {
			orm.LibroClasePersistentManager.instance().deleteObject(curso_estudiante);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Curso_estudiante curso_estudiante)throws PersistentException {
		try {
			if (curso_estudiante.getCurso_id_fk() != null) {
				curso_estudiante.getCurso_id_fk().curso_estudiante.remove(curso_estudiante);
			}
			
			if (curso_estudiante.getEstudiante_id_fk() != null) {
				curso_estudiante.getEstudiante_id_fk().curso_estudiante.remove(curso_estudiante);
			}
			
			return delete(curso_estudiante);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Curso_estudiante curso_estudiante, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (curso_estudiante.getCurso_id_fk() != null) {
				curso_estudiante.getCurso_id_fk().curso_estudiante.remove(curso_estudiante);
			}
			
			if (curso_estudiante.getEstudiante_id_fk() != null) {
				curso_estudiante.getEstudiante_id_fk().curso_estudiante.remove(curso_estudiante);
			}
			
			try {
				session.delete(curso_estudiante);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(orm.Curso_estudiante curso_estudiante) throws PersistentException {
		try {
			orm.LibroClasePersistentManager.instance().getSession().refresh(curso_estudiante);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Curso_estudiante curso_estudiante) throws PersistentException {
		try {
			orm.LibroClasePersistentManager.instance().getSession().evict(curso_estudiante);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_estudiante loadCurso_estudianteByCriteria(Curso_estudianteCriteria curso_estudianteCriteria) {
		Curso_estudiante[] curso_estudiantes = listCurso_estudianteByCriteria(curso_estudianteCriteria);
		if(curso_estudiantes == null || curso_estudiantes.length == 0) {
			return null;
		}
		return curso_estudiantes[0];
	}
	
	public static Curso_estudiante[] listCurso_estudianteByCriteria(Curso_estudianteCriteria curso_estudianteCriteria) {
		return curso_estudianteCriteria.listCurso_estudiante();
	}
}
