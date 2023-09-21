package fr.erasmus.socialNetwork.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.erasmus.socialNetwork.entity.Comment;
import fr.erasmus.socialNetwork.filter.CommentFilter;
import fr.erasmus.socialNetwork.repository.CommentRepository;
import fr.erasmus.socialNetwork.struct.CommentDto;

@Service
public class CommentService implements IService<Comment, CommentDto, CommentFilter> {

	@Autowired
	private CommentRepository commentRepository;
	
	@Override
	public CommentDto find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CommentDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<CommentDto> findAllFiltered(CommentFilter filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommentDto create(CommentDto struct) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommentDto update(CommentDto struct) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exist(CommentDto struct) {
		// TODO Auto-generated method stub
		return false;
	}

}
