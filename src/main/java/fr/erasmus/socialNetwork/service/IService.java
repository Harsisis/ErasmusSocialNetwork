package fr.erasmus.socialNetwork.service;

import java.util.List;

/**
 * Interface for default CRUD service methods
 * @param V --> struct
 */
public interface IService<V> {
	/**
	 * Like Object
	 * @param id
	 * @param userId
	 * @return
	 */
	boolean like(V structToSave);
	
	/**
	 * UnLike Object
	 * @param id
	 * @param userId
	 * @return
	 */
	boolean unlike(V structToSave);
	
	/**
	 * List of Objects liked by User
	 * @param userId
	 * @return
	 */
	List<V> likedByUser(int userId);
	
	/**
	 * List of Objects
	 * @param userId
	 * @return
	 */
	List<V> findAll();

}
