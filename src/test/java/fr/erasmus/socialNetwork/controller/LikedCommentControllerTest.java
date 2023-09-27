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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import fr.erasmus.socialNetwork.enums.LikeTypeEnum;
import fr.erasmus.socialNetwork.service.LikedCommentService;
import fr.erasmus.socialNetwork.struct.LikedCommentStruct;

public class LikedCommentControllerTest {

    @InjectMocks
    private LikedCommentController likedCommentController;

    @Mock
    private LikedCommentService likedCommentService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testLikeComment() {
        LikedCommentStruct likedCommentStruct = new LikedCommentStruct();
        likedCommentStruct.setCommentId(1);
        likedCommentStruct.setUserId(2);
        likedCommentStruct.setLike(LikeTypeEnum.LOVE);

        when(likedCommentService.like(any(LikedCommentStruct.class)))
            .thenReturn(likedCommentStruct);

        ResponseEntity<LikedCommentStruct> response = likedCommentController.likeComment(likedCommentStruct);

        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
    
    @Test
    public void testUnlikeComment() {
        int likedCommentId = 123;

        when(likedCommentService.unlike(eq(likedCommentId)))
            .thenReturn(true);

        ResponseEntity<Boolean> response = likedCommentController.unlikeComment(likedCommentId);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertTrue(response.getBody());
    }
    
    @Test
    public void testFindAllLikedCommentByUser() {
        int userId = 456;

        List<LikedCommentStruct> likedCommentList = new ArrayList<>();

        when(likedCommentService.likedByUser(eq(userId)))
            .thenReturn(likedCommentList);

        ResponseEntity<List<LikedCommentStruct>> response = likedCommentController.findAllLikedCommentByUser(userId);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(likedCommentList, response.getBody());
    }
    
    @Test
    public void testFindAllLikedComment() {
        List<LikedCommentStruct> likedCommentList = new ArrayList<>();

        when(likedCommentService.findAll())
            .thenReturn(likedCommentList);

        ResponseEntity<List<LikedCommentStruct>> response = likedCommentController.findAllLikedComment();

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(likedCommentList, response.getBody());
    }

}