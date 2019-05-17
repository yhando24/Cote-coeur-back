package com.cotecoeur.configuration;



import com.cotecoeur.user.model.User;
import com.cotecoeur.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("userDetailsService")
public class AuthenticationService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String email) {
		String userLogin = email.toLowerCase();
		User u = userRepository.findByEmail(email);

		if (u == null) {
			throw new UsernameNotFoundException("User " + userLogin + " not found");

		} else {
			return new org.springframework.security.core.userdetails.User(userLogin, u.getPassword(), true, true,
					true, true, findAuthorityForUser(u));
		}
	}

	private List<GrantedAuthority> findAuthorityForUser(User u) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(u.getRole().toString()));
		return authorities;
	}

}
