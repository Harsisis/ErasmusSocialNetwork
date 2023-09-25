package fr.erasmus.socialNetwork.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.erasmus.socialNetwork.entity.LikedComment;

@Repository
public interface LikedCommentRepository extends JpaRepository<LikedComment, Integer> {

	@Query("SELECT l FROM LikedComment l WHERE l.userId = :userId")
	List<LikedComment> findAllWithUserId(@Param("userId") int userId);
}
