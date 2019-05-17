package com.cotecoeur.user.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.cotecoeur.user.model.User;
import com.cotecoeur.user.model.UserDTO;


@Mapper
public interface UserMapper {
	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

	UserDTO userToUserDTO(User user);
	User userDTOToUser(UserDTO userDTO);
}
