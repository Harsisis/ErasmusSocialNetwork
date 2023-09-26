package fr.erasmus.socialNetwork.mapper;


import org.springframework.stereotype.Component;

import fr.erasmus.socialNetwork.entity.LikedPost;
import fr.erasmus.socialNetwork.struct.LikedPostStruct;

@Component
public class LikedPostMapper{
	public LikedPostStruct likedPostToLikedPostStruct(LikedPost post) {
		if(post == null) {
			return null;
		}
		LikedPostStruct struct = new LikedPostStruct();
		struct.setId(post.getId());
		struct.setPostId(post.getPostId());
		struct.setUserId(post.getUserId());
		struct.setLike(post.getLike());
		
		return struct;
	}
	public LikedPost likedPostStructToLikedPost(LikedPostStruct postStruct) {
		if(postStruct == null) {
			return null;
		}
		LikedPost entity = new LikedPost();
		entity.setId(postStruct.getId());
		entity.setPostId(postStruct.getPostId());
		entity.setUserId(postStruct.getUserId());
		entity.setLike(postStruct.getLike());
		
		return entity;
	}
}