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
public class LikedCommentService implements IService<LikedComment, LikedCommentStruct, CommentFilter> {

	@Autowired
	private LikedCommentRepository likedCommentRepository;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CommentMapper commentMapper;
	
	@Override
	public LikedCommentStruct find(int id) {
		return commentMapper.likedCommentToLikedCommentStruct(likedCommentRepository.findById(id).get());
	}

	@Override
	public List<LikedCommentStruct> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<LikedCommentStruct> findAllFiltered(CommentFilter filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LikedCommentStruct create(LikedCommentStruct struct) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LikedCommentStruct update(LikedCommentStruct struct) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
		
	}

	public boolean like(int id, int userId) {
		Optional<LikedComment> LikedComment = likedCommentRepository.findById(id);
		if(LikedComment.isPresent()) {
			LikedCommentStruct LikedCommentStruct = find(id);
			update(LikedCommentStruct);
			return true;
		}
		return false;
		
	}
	
}
