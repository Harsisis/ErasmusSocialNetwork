package fr.erasmus.socialNetwork.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import fr.erasmus.socialNetwork.service.LikedPostService;
import fr.erasmus.socialNetwork.struct.LikedPostStruct;

@SpringBootTest
public class LikedPostControllerTest {

    @InjectMocks
    private LikedPostController likedPostController;

    @Mock
    private LikedPostService likedPostService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testLikePost() {
        LikedPostStruct likedPostStruct = new LikedPostStruct();

        when(likedPostService.like(any(LikedPostStruct.class)))
            .thenReturn(likedPostStruct);

        ResponseEntity<LikedPostStruct> response = likedPostController.likePost(likedPostStruct);

        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    public void testUnlikePost() {
        int likedPostId = 123;

        when(likedPostService.unlike(eq(likedPostId)))
            .thenReturn(true);

        ResponseEntity<Boolean> response = likedPostController.unlikePost(likedPostId);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertTrue(response.getBody());
    }

    @Test
    public void testFindAllLikedPostByUser() {
        int userId = 456;
        List<LikedPostStruct> likedPostList = new ArrayList<>();

        when(likedPostService.likedByUser(eq(userId)))
            .thenReturn(likedPostList);

        ResponseEntity<List<LikedPostStruct>> response = likedPostController.findAllLikedPostByUser(userId);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(likedPostList, response.getBody());
    }

    @Test
    public void testFindAllLikedPost() {
        List<LikedPostStruct> likedPostList = new ArrayList<>();

        when(likedPostService.findAll())
            .thenReturn(likedPostList);

        ResponseEntity<List<LikedPostStruct>> response = likedPostController.findAllLikedPost();

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(likedPostList, response.getBody());
    }
}