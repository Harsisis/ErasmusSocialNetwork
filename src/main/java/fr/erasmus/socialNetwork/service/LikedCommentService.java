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
	public LikedCommentStruct like(LikedCommentStruct structToSave) {
		return likedCommentMapper.likedCommentToLikedCommentStruct(
				likedCommentRepository.save(likedCommentMapper.likedCommentStructToLikedComment(structToSave)));
	}

	@Override
	public boolean unlike(int idToDelete) {
		if (likedCommentRepository.existsById(idToDelete)) {
			likedCommentRepository.delete(likedCommentRepository.findById(idToDelete).get());
			return true;
		}
		return false;
	}

	@Override
	public List<LikedCommentStruct> likedByUser(int userId) {
		return likedCommentRepository.findAllWithUserId(userId).stream()
				.map(likedCommentMapper::likedCommentToLikedCommentStruct).collect(Collectors.toList());
	}

	@Override
	public List<LikedCommentStruct> findAll() {
		return likedCommentRepository.findAll().stream().map(likedCommentMapper::likedCommentToLikedCommentStruct)
				.collect(Collectors.toList());
	}
}
