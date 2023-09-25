package fr.erasmus.socialNetwork.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.erasmus.socialNetwork.entity.LikedPost;

@Repository
public interface LikedPostRepository extends JpaRepository<LikedPost, Integer> {

	@Query("SELECT l FROM LikedPost l WHERE l.userId = :userId")
	List<LikedPost> findAllWithUserId(@Param("userId") int userId);

}
