package com.cotecoeur.user.service;

import java.util.List;


import com.cotecoeur.user.model.User;
import com.cotecoeur.user.model.UserDTO;

public interface MapperUserService {
	
	UserDTO toDTO(User user);

	List<UserDTO> toDTOs(List<User> user);

	User toEntity(UserDTO userDTO);

	List<User> toEntitys(List<UserDTO> userDTO);

}
