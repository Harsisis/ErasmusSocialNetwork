package fr.erasmus.socialNetwork.service;

import java.util.List;

/**
 * Interface for default CRUD service methods
 * @param V --> struct
 */
public interface IService<V> {
	/**
	 * Like Object
	 * @param structToSave
	 * @return
	 */
	V like(V structToSave);
	
	/**
	 * UnLike Object
	 * @param idToDlete
	 * @return
	 */
	boolean unlike(int idToDlete);
	
	/**
	 * List of Objects liked by User
	 * @param userId
	 * @return
	 */
	List<V> likedByUser(int userId);
	
	/**
	 * List of Objects
	 * @return
	 */
	List<V> findAll();

}
