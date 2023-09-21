package fr.erasmus.socialNetwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.erasmus.socialNetwork.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
