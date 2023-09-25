package fr.erasmus.socialNetwork.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		return likedCommentRepository.findAllWithUserId(userId).stream().map(likedCommentMapper::likedCommentToLikedCommentStruct)
				.collect(Collectors.toList());
	}
}
