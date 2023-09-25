package fr.erasmus.socialNetwork.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.erasmus.socialNetwork.mapper.LikedPostMapper;
import fr.erasmus.socialNetwork.repository.LikedPostRepository;
import fr.erasmus.socialNetwork.struct.LikedPostStruct;

@Service
public class LikedPostService implements IService<LikedPostStruct> {
	
	@Autowired
	private LikedPostRepository likedPostRepository;
	
	@Autowired
	private LikedPostMapper likedPostMapper;

	@Override
	public boolean like(LikedPostStruct structToSave) {
		likedPostRepository.save(likedPostMapper.likedPostStructToLikedPost(structToSave));
		return true;
	}

	@Override
	public boolean unlike(LikedPostStruct structToSave) {
		if (likedPostRepository.existsById(structToSave.getId())) {
			likedPostRepository.delete(likedPostRepository.findById(structToSave.getId()).get());
			return true;
		}
		return false;
	}

	@Override
	public List<LikedPostStruct> likedByUser(int userId) {
		return likedPostRepository.findAllWithUserId(userId).stream().map(likedPostMapper::likedPostToLikedPostStruct)
				.collect(Collectors.toList());
	}
	
	@Override
	public List<LikedPostStruct> findAll() {
		return likedPostRepository.findAll().stream().map(likedPostMapper::likedPostToLikedPostStruct)
				.collect(Collectors.toList());
	}

}
