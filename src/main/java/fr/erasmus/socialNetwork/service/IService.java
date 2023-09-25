package fr.erasmus.socialNetwork.service;

import java.util.List;

/**
 * Interface for default CRUD service methods
 * @param <E> --> Entity
 * @param <S> --> Structure
 * @param <F> --> Filter
 */
public interface IService<E, S, F> {
	
	/**
	 * Find Structure by id
	 * @param id
	 * @return
	 */
	S find(int id);
	
	/**
	 * Find all Structure
	 * @return
	 */
	List<S> findAll();
	
	/**
	 * Find all Structure using Filter
	 * @return
	 */
	List<S> findAllFiltered(F filter);
	
	/**
	 * Create Entity and return newly created Structure
	 * @param struct
	 * @return
	 */
	S create(S struct);
	
	/**
	 * Update Entity and return newly updated Structure
	 * @param struct
	 * @return
	 */
	S update(S struct);
	
	/**
	 * Delete Entity by id
	 * @param struct
	 * @return
	 */
	boolean delete(int id);

}
