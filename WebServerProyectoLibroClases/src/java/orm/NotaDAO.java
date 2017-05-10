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

public class NotaDAO {
	public static Nota loadNotaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return loadNotaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota getNotaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return getNotaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota loadNotaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return loadNotaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota getNotaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return getNotaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota loadNotaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Nota) session.load(orm.Nota.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota getNotaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Nota) session.get(orm.Nota.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota loadNotaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Nota) session.load(orm.Nota.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota getNotaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Nota) session.get(orm.Nota.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNota(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return queryNota(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNota(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return queryNota(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota[] listNotaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return listNotaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota[] listNotaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return listNotaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNota(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Nota as Nota");
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
	
	public static List queryNota(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Nota as Nota");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Nota", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota[] listNotaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryNota(session, condition, orderBy);
			return (Nota[]) list.toArray(new Nota[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota[] listNotaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryNota(session, condition, orderBy, lockMode);
			return (Nota[]) list.toArray(new Nota[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota loadNotaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return loadNotaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota loadNotaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return loadNotaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota loadNotaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Nota[] notas = listNotaByQuery(session, condition, orderBy);
		if (notas != null && notas.length > 0)
			return notas[0];
		else
			return null;
	}
	
	public static Nota loadNotaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Nota[] notas = listNotaByQuery(session, condition, orderBy, lockMode);
		if (notas != null && notas.length > 0)
			return notas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateNotaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return iterateNotaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNotaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LibroClasePersistentManager.instance().getSession();
			return iterateNotaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNotaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Nota as Nota");
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
	
	public static java.util.Iterator iterateNotaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Nota as Nota");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Nota", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota createNota() {
		return new orm.Nota();
	}
	
	public static boolean save(orm.Nota nota) throws PersistentException {
		try {
			orm.LibroClasePersistentManager.instance().saveObject(nota);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Nota nota) throws PersistentException {
		try {
			orm.LibroClasePersistentManager.instance().deleteObject(nota);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Nota nota)throws PersistentException {
		try {
			if (nota.getActividad_id_fk() != null) {
				nota.getActividad_id_fk().setNota(null);
			}
			
			if (nota.getEstudiante_id_fk() != null) {
				nota.getEstudiante_id_fk().nota.remove(nota);
			}
			
			return delete(nota);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Nota nota, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (nota.getActividad_id_fk() != null) {
				nota.getActividad_id_fk().setNota(null);
			}
			
			if (nota.getEstudiante_id_fk() != null) {
				nota.getEstudiante_id_fk().nota.remove(nota);
			}
			
			try {
				session.delete(nota);
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
	
	public static boolean refresh(orm.Nota nota) throws PersistentException {
		try {
			orm.LibroClasePersistentManager.instance().getSession().refresh(nota);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Nota nota) throws PersistentException {
		try {
			orm.LibroClasePersistentManager.instance().getSession().evict(nota);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota loadNotaByCriteria(NotaCriteria notaCriteria) {
		Nota[] notas = listNotaByCriteria(notaCriteria);
		if(notas == null || notas.length == 0) {
			return null;
		}
		return notas[0];
	}
	
	public static Nota[] listNotaByCriteria(NotaCriteria notaCriteria) {
		return notaCriteria.listNota();
	}
}
