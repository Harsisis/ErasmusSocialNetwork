package fr.erasmus.socialNetwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.erasmus.socialNetwork.entity.LikedPost;

@Repository
public interface LikedPostRepository extends JpaRepository<LikedPost, Integer> {

}
