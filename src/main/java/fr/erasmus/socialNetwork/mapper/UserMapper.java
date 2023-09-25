package fr.erasmus.socialNetwork.mapper;

import org.mapstruct.Mapper;

import fr.erasmus.socialNetwork.entity.User;
import fr.erasmus.socialNetwork.struct.UserDto;

@Mapper
public interface UserMapper {
	UserDto userToUserDto(User user);
	User userDtoToUser(UserDto userDto);
}
