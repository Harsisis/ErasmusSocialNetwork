package fr.erasmus.socialNetwork.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.erasmus.socialNetwork.entity.Comment;
import fr.erasmus.socialNetwork.filter.CommentFilter;
import fr.erasmus.socialNetwork.mapper.CommentMapper;
import fr.erasmus.socialNetwork.repository.CommentRepository;
import fr.erasmus.socialNetwork.struct.CommentDto;

@Service
public class CommentService implements IService<Comment, CommentDto, CommentFilter> {

	@Autowired
	private CommentRepository commentRepository;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CommentMapper commentMapper;
	
	@Override
	public CommentDto find(int id) {
		return commentMapper.commentToCommentDto(commentRepository.findById(id).get());
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
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
		
	}

	public boolean like(int id, int userId) {
		Optional<Comment> comment = commentRepository.findById(id);
		if(comment.isPresent()) {
			CommentDto commentDto = find(id);
			commentDto.getCommentLikes().add(userService.find(userId));
			update(commentDto);
			return true;
		}
		return false;
		
	}
	
}
