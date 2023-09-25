package fr.erasmus.socialNetwork.service;

import java.util.List;

/**
 * Interface for default CRUD service methods
 */
public interface IService {
	/**
	 * Like Object
	 * @param id
	 * @param userId
	 * @return
	 */
	boolean like(int id, int userId);
	
	/**
	 * UnLike Object
	 * @param id
	 * @param userId
	 * @return
	 */
	boolean unlike(int id, int userId);
	
	/**
	 * List of Objects liked by User
	 * @param userId
	 * @return
	 */
	List<Integer> likedByUser(int userId);

}
