package fr.erasmus.socialNetwork.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.erasmus.socialNetwork.entity.LikedComment;
import fr.erasmus.socialNetwork.filter.CommentFilter;
import fr.erasmus.socialNetwork.mapper.CommentMapper;
import fr.erasmus.socialNetwork.repository.LikedCommentRepository;
import fr.erasmus.socialNetwork.struct.LikedCommentStruct;

@Service
public class LikedCommentService implements IService {
	
	@Autowired
	private LikedCommentRepository likedCommentRepository;

	@Override
	public boolean like(int id, int userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unlike(int id, int userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Integer> likedByUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
