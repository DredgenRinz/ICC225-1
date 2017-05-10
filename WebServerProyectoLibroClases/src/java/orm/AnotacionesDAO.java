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

public class AnotacionesDAO {
	public static Anotaciones loadAnotacionesByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return loadAnotacionesByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotaciones getAnotacionesByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return getAnotacionesByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotaciones loadAnotacionesByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return loadAnotacionesByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotaciones getAnotacionesByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return getAnotacionesByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotaciones loadAnotacionesByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Anotaciones) session.load(orm.Anotaciones.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotaciones getAnotacionesByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Anotaciones) session.get(orm.Anotaciones.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotaciones loadAnotacionesByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Anotaciones) session.load(orm.Anotaciones.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotaciones getAnotacionesByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Anotaciones) session.get(orm.Anotaciones.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAnotaciones(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return queryAnotaciones(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAnotaciones(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return queryAnotaciones(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotaciones[] listAnotacionesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return listAnotacionesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotaciones[] listAnotacionesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return listAnotacionesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAnotaciones(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Anotaciones as Anotaciones");
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
	
	public static List queryAnotaciones(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Anotaciones as Anotaciones");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Anotaciones", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotaciones[] listAnotacionesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAnotaciones(session, condition, orderBy);
			return (Anotaciones[]) list.toArray(new Anotaciones[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotaciones[] listAnotacionesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAnotaciones(session, condition, orderBy, lockMode);
			return (Anotaciones[]) list.toArray(new Anotaciones[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotaciones loadAnotacionesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return loadAnotacionesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotaciones loadAnotacionesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return loadAnotacionesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotaciones loadAnotacionesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Anotaciones[] anotacioneses = listAnotacionesByQuery(session, condition, orderBy);
		if (anotacioneses != null && anotacioneses.length > 0)
			return anotacioneses[0];
		else
			return null;
	}
	
	public static Anotaciones loadAnotacionesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Anotaciones[] anotacioneses = listAnotacionesByQuery(session, condition, orderBy, lockMode);
		if (anotacioneses != null && anotacioneses.length > 0)
			return anotacioneses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAnotacionesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return iterateAnotacionesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAnotacionesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return iterateAnotacionesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAnotacionesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Anotaciones as Anotaciones");
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
	
	public static java.util.Iterator iterateAnotacionesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Anotaciones as Anotaciones");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Anotaciones", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotaciones createAnotaciones() {
		return new orm.Anotaciones();
	}
	
	public static boolean save(orm.Anotaciones anotaciones) throws PersistentException {
		try {
			orm.LibroClasePersistentManager.instance().saveObject(anotaciones);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Anotaciones anotaciones) throws PersistentException {
		try {
			orm.LibroClasePersistentManager.instance().deleteObject(anotaciones);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Anotaciones anotaciones)throws PersistentException {
		try {
			if (anotaciones.getEstudiante_id_fk() != null) {
				anotaciones.getEstudiante_id_fk().anotaciones.remove(anotaciones);
			}
			
			if (anotaciones.getProfesor_id_fk() != null) {
				anotaciones.getProfesor_id_fk().anotaciones.remove(anotaciones);
			}
			
			return delete(anotaciones);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Anotaciones anotaciones, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (anotaciones.getEstudiante_id_fk() != null) {
				anotaciones.getEstudiante_id_fk().anotaciones.remove(anotaciones);
			}
			
			if (anotaciones.getProfesor_id_fk() != null) {
				anotaciones.getProfesor_id_fk().anotaciones.remove(anotaciones);
			}
			
			try {
				session.delete(anotaciones);
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
	
	public static boolean refresh(orm.Anotaciones anotaciones) throws PersistentException {
		try {
			orm.LibroClasePersistentManager.instance().getSession().refresh(anotaciones);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Anotaciones anotaciones) throws PersistentException {
		try {
			orm.LibroClasePersistentManager.instance().getSession().evict(anotaciones);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotaciones loadAnotacionesByCriteria(AnotacionesCriteria anotacionesCriteria) {
		Anotaciones[] anotacioneses = listAnotacionesByCriteria(anotacionesCriteria);
		if(anotacioneses == null || anotacioneses.length == 0) {
			return null;
		}
		return anotacioneses[0];
	}
	
	public static Anotaciones[] listAnotacionesByCriteria(AnotacionesCriteria anotacionesCriteria) {
		return anotacionesCriteria.listAnotaciones();
	}
}
