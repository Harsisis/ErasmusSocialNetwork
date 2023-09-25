package fr.erasmus.socialNetwork.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< Updated upstream
=======
import fr.erasmus.socialNetwork.entity.LikedComment;
import fr.erasmus.socialNetwork.filter.CommentFilter;
>>>>>>> Stashed changes
import fr.erasmus.socialNetwork.mapper.LikedCommentMapper;
import fr.erasmus.socialNetwork.repository.LikedCommentRepository;
import fr.erasmus.socialNetwork.struct.LikedCommentStruct;

@Service
public class LikedCommentService implements IService<LikedCommentStruct> {
	
	@Autowired
	private LikedCommentRepository likedCommentRepository;
	
	@Autowired
	private LikedCommentMapper likedCommentMapper;

	@Override
	public boolean like(LikedCommentStruct structToSave) {
		likedCommentRepository.save(likedCommentMapper.likedCommentStructToLikedComment(structToSave));
		return true;
	}

	@Override
	public boolean unlike(LikedCommentStruct structToSave) {
		if(likedCommentRepository.existsById(structToSave.getId())) {
			likedCommentRepository.delete(likedCommentRepository.findById(structToSave.getId()).get());
			return true;
		}
		return false;
	}

	@Override
	public List<LikedCommentStruct> likedByUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
}
