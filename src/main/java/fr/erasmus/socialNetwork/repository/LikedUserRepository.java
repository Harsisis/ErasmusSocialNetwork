package fr.erasmus.socialNetwork.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.erasmus.socialNetwork.entity.LikedUser;

@Repository
public interface LikedUserRepository extends JpaRepository<LikedUser, Integer> {

	@Query("SELECT l FROM LikedUser l WHERE l.userId = :userId")
	List<LikedUser> findAllWithUserId(@Param("userId") int userId);

}
