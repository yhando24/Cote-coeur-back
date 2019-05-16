package com.cotecoeur.user.controller;

import com.cotecoeur.user.service.UserService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin
@RestController()
@RequestMapping("/users")
public class UserController {

/*	@Autowired
	private UserService userServ;

	@GetMapping
	public List<UserDTO> findAll() {
		return this.userServ.findAll();
	}

	@PostMapping
	@Transactional
	public UserDTO verification(@RequestBody UserDTO userDTO) {
		return userServ.save(userDTO);

	}

	@PatchMapping
	public UserDTO update(@RequestBody UserDTO user) {
		return this.userServ.save(user);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable Long id) {
		this.userServ.deleteById(id);
	}
	*/

}
