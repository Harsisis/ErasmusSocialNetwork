package fr.erasmus.socialNetwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.erasmus.socialNetwork.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}
