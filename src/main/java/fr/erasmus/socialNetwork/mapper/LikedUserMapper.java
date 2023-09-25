package fr.erasmus.socialNetwork.mapper;

import org.mapstruct.Mapper;

import fr.erasmus.socialNetwork.entity.LikedUser;
import fr.erasmus.socialNetwork.struct.LikedUserStruct;

@Mapper
public interface LikedUserMapper {
	LikedUserStruct likedUserToLikedUserStruct(LikedUser user);
	LikedUser likedUserStructToLikedUser(LikedUserStruct userStruct);
}
