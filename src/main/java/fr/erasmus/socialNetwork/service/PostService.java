package fr.erasmus.socialNetwork.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.erasmus.socialNetwork.entity.Post;
import fr.erasmus.socialNetwork.filter.PostFilter;
import fr.erasmus.socialNetwork.repository.PostRepository;
import fr.erasmus.socialNetwork.struct.PostDto;

@Service
public class PostService implements IService<Post, PostDto, PostFilter> {
	
	@Autowired
	private PostRepository postRepository;

	@Override
	public PostDto find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PostDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PostDto> findAllFiltered(PostFilter filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PostDto create(PostDto struct) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PostDto update(PostDto struct) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exist(PostDto struct) {
		// TODO Auto-generated method stub
		return false;
	}

}
