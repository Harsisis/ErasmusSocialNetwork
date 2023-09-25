package fr.erasmus.socialNetwork.mapper;

import org.mapstruct.Mapper;

import fr.erasmus.socialNetwork.entity.Comment;
import fr.erasmus.socialNetwork.struct.CommentDto;

@Mapper
public interface CommentMapper {
	CommentDto commentToCommentDto(Comment comment);
	Comment commentDtoToComment(CommentDto commentDto);
}
