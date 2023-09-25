package fr.erasmus.socialNetwork.mapper;

import org.mapstruct.Mapper;

import fr.erasmus.socialNetwork.entity.Post;
import fr.erasmus.socialNetwork.struct.PostDto;

@Mapper
public interface PostMapper{
	PostDto postToPostDto(Post post);
	Post postDtoToPost(PostDto postDto);
}