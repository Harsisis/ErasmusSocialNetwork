package fr.erasmus.socialNetwork.mapper;

import org.mapstruct.Mapper;

import fr.erasmus.socialNetwork.entity.LikedComment;
import fr.erasmus.socialNetwork.struct.LikedCommentStruct;

@Mapper
public interface CommentMapper {
	LikedCommentStruct likedCommentToLikedCommentStruct(LikedComment comment);
	LikedComment likedCommentStructToLikedComment(LikedCommentStruct commentDto);
}
