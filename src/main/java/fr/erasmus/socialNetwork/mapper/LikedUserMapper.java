package fr.erasmus.socialNetwork.mapper;

import org.springframework.stereotype.Component;

import fr.erasmus.socialNetwork.entity.LikedUser;
import fr.erasmus.socialNetwork.struct.LikedUserStruct;

@Component
public class LikedUserMapper {
	public LikedUserStruct likedUserToLikedUserStruct(LikedUser user) {
		if(user == null) {
			return null;
		}
		LikedUserStruct struct = new LikedUserStruct();
		struct.setId(user.getId());
		struct.setLikedUserId(user.getLikedUserId());
		struct.setUserId(user.getUserId());
		struct.setLike(user.getLike());
		
		return struct;
	}
	
	public LikedUser likedUserStructToLikedUser(LikedUserStruct userStruct) {
		if(userStruct == null) {
			return null;
		}
		LikedUser entity = new LikedUser();
		entity.setId(userStruct.getId());
		entity.setLikedUserId(userStruct.getLikedUserId());
		entity.setUserId(userStruct.getUserId());
		entity.setLike(userStruct.getLike());
		
		return entity;
	}
}
