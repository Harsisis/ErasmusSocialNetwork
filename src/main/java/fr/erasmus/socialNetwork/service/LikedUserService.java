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
	public LikedUserStruct like(LikedUserStruct structToSave) {
		return likedUserMapper.likedUserToLikedUserStruct(
				likedUserRepository.save(likedUserMapper.likedUserStructToLikedUser(structToSave)));
	}

	@Override
	public boolean unlike(int idToDelete) {
		if (likedUserRepository.existsById(idToDelete)) {
			likedUserRepository.delete(likedUserRepository.findById(idToDelete).get());
			return true;
		}
		return false;
	}

	@Override
	public List<LikedUserStruct> likedByUser(int userId) {
		return likedUserRepository.findAllWithUserId(userId).stream().map(likedUserMapper::likedUserToLikedUserStruct)
				.collect(Collectors.toList());
	}

	@Override
	public List<LikedUserStruct> findAll() {
		return likedUserRepository.findAll().stream().map(likedUserMapper::likedUserToLikedUserStruct)
				.collect(Collectors.toList());
	}
}
