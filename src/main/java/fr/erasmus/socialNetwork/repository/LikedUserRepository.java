package fr.erasmus.socialNetwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.erasmus.socialNetwork.entity.LikedUser;

@Repository
public interface LikedUserRepository extends JpaRepository<LikedUser, Integer> {

}
