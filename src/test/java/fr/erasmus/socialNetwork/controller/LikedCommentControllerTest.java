package fr.erasmus.socialNetwork.controller;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fr.erasmus.socialNetwork.service.LikedCommentService;
import fr.erasmus.socialNetwork.struct.LikedCommentStruct;

@SpringBootTest
public class LikedCommentControllerTest {

	@Autowired
	private LikedCommentService likedCommentService;
	
	@Test
	void create_comment_thenReturnTrue() throws Exception {
		LikedCommentStruct struct = new LikedCommentStruct();
		struct.setCommentId(0);
		struct.setUserId(0);
		assertNotEquals(likedCommentService.like(struct).getId(), 0);
	}
}
