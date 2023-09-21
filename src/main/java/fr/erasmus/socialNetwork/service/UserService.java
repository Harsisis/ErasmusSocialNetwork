package fr.erasmus.socialNetwork.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.erasmus.socialNetwork.entity.User;
import fr.erasmus.socialNetwork.filter.UserFilter;
import fr.erasmus.socialNetwork.repository.UserRepository;
import fr.erasmus.socialNetwork.struct.UserDto;

@Service
public class UserService implements IService<User, UserDto, UserFilter> {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDto find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> findAllFiltered(UserFilter filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto create(UserDto struct) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto update(UserDto struct) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exist(UserDto struct) {
		// TODO Auto-generated method stub
		return false;
	}

}
