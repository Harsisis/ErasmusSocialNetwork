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

import fr.erasmus.socialNetwork.service.LikedUserService;
import fr.erasmus.socialNetwork.struct.LikedUserStruct;

@SpringBootTest
public class LikedUserControllerTest {

    @InjectMocks
    private LikedUserController likedUserController;

    @Mock
    private LikedUserService likedUserService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testLikeUser() {
        LikedUserStruct likedUserStruct = new LikedUserStruct();

        when(likedUserService.like(any(LikedUserStruct.class)))
            .thenReturn(likedUserStruct);

        ResponseEntity<LikedUserStruct> response = likedUserController.likeUser(likedUserStruct);

        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    public void testUnlikeUser() {
        int likedUserId = 123;

        when(likedUserService.unlike(eq(likedUserId)))
            .thenReturn(true);

        ResponseEntity<Boolean> response = likedUserController.unlikeUser(likedUserId);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertTrue(response.getBody());
    }

    @Test
    public void testFindAllLikedUserByUser() {
        int userId = 456;
        List<LikedUserStruct> likedUserList = new ArrayList<>();

        when(likedUserService.likedByUser(eq(userId)))
            .thenReturn(likedUserList);

        ResponseEntity<List<LikedUserStruct>> response = likedUserController.findAllLikedUserByUser(userId);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(likedUserList, response.getBody());
    }

    @Test
    public void testFindAllLikedUser() {
        List<LikedUserStruct> likedUserList = new ArrayList<>();

        when(likedUserService.findAll())
            .thenReturn(likedUserList);

        ResponseEntity<List<LikedUserStruct>> response = likedUserController.findAllLikedUser();

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(likedUserList, response.getBody());
    }
}