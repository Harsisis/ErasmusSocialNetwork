package fr.erasmus.socialNetwork.mapper;


import org.springframework.stereotype.Component;

import fr.erasmus.socialNetwork.entity.LikedComment;
import fr.erasmus.socialNetwork.struct.LikedCommentStruct;

@Component
public class LikedCommentMapper {
	public LikedCommentStruct likedCommentToLikedCommentStruct(LikedComment comment) {
		if(comment == null) {
			return null;
		}
		LikedCommentStruct struct = new LikedCommentStruct();
		struct.setId(comment.getId());;
		struct.setCommentId(comment.getCommentId());
		struct.setUserId(comment.getUserId());
		
		return struct;
	}
	public LikedComment likedCommentStructToLikedComment(LikedCommentStruct commentDto) {
		if(commentDto == null) {
			return null;
		}
		LikedComment entity = new LikedComment();
		entity.setId(commentDto.getId());
		entity.setCommentId(commentDto.getCommentId());
		entity.setUserId(commentDto.getUserId());
		
		return entity;
	}
}
