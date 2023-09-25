package fr.erasmus.socialNetwork.service;

import java.util.List;

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
		return false;
	}

	@Override
	public boolean unlike(LikedPostStruct structToSave) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<LikedPostStruct> likedByUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
	


}