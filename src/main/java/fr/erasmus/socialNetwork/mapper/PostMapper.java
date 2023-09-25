package fr.erasmus.socialNetwork.mapper;

import org.mapstruct.Mapper;

import fr.erasmus.socialNetwork.entity.LikedPost;
import fr.erasmus.socialNetwork.struct.LikedPostStruct;


@Mapper
public interface PostMapper{
	LikedPostStruct likedPostToLikedPostStruct(LikedPost post);
	LikedPost likedPostStructToLikedPost(LikedPostStruct postStruct);
}