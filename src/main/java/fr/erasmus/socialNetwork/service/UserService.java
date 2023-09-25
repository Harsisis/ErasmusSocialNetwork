package fr.erasmus.socialNetwork.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.erasmus.socialNetwork.entity.User;
import fr.erasmus.socialNetwork.filter.UserFilter;
import fr.erasmus.socialNetwork.mapper.UserMapper;
import fr.erasmus.socialNetwork.repository.UserRepository;
import fr.erasmus.socialNetwork.struct.UserDto;

@Service
public class UserService implements IService<User, UserDto, UserFilter> {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public UserDto find(int id) {
		return userMapper.userToUserDto(userRepository.findById(id).get());
	}

	@Override
	public List<UserDto> findAll() {
		return userRepository.findAll().stream().map(userMapper::userToUserDto).collect(Collectors.toList());
	}

	@Override
	public List<UserDto> findAllFiltered(UserFilter filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto create(UserDto struct) {
		return userMapper.userToUserDto(userRepository.save(userMapper.userDtoToUser(struct)));
	}

	@Override
	public UserDto update(UserDto struct) {
		Optional<User> userToUpdate = userRepository.findById(struct.getId());
		if(userToUpdate.isPresent()) {
			return userMapper.userToUserDto(userRepository.save(userToUpdate.get()));
		}
		return null;
	}

	@Override
	public boolean delete(int id) {
		Optional<User> userToDelete = userRepository.findById(id);
		if(userToDelete.isPresent()) {
			userRepository.delete(userToDelete.get());
			return true;
		}
		return false;
	}
}
