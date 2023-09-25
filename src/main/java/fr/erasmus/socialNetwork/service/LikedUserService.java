package fr.erasmus.socialNetwork.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.erasmus.socialNetwork.mapper.LikedUserMapper;
import fr.erasmus.socialNetwork.repository.LikedUserRepository;
import fr.erasmus.socialNetwork.struct.LikedUserStruct;

@Service
public class LikedUserService implements IService<LikedUserStruct> {

	@Autowired
	private LikedUserRepository likedUserRepository;

	@Autowired
	private LikedUserMapper likedUserMapper;

	@Override
	public boolean like(LikedUserStruct structToSave) {
		likedUserRepository.save(likedUserMapper.likedUserStructToLikedUser(structToSave));
		return true;
	}

	@Override
	public boolean unlike(LikedUserStruct structToSave) {
		if (likedUserRepository.existsById(structToSave.getId())) {
			likedUserRepository.delete(likedUserRepository.findById(structToSave.getId()).get());
			return true;
		}
		return false;
	}

	@Override
	public List<LikedUserStruct> likedByUser(int userId) {
		return likedUserRepository.findAllWithUserId(userId).stream().map(likedUserMapper::likedUserToLikedUserStruct)
				.collect(Collectors.toList());
	}
}
