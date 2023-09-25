package fr.erasmus.socialNetwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.erasmus.socialNetwork.entity.LikedComment;

@Repository
public interface LikedCommentRepository extends JpaRepository<LikedComment, Integer> {

}
