package com.cotecoeur.user.controller;

import com.cotecoeur.configuration.AuthenticationService;
import com.cotecoeur.configuration.TokenProvider;
import com.cotecoeur.user.model.User;
import com.cotecoeur.user.service.UserService;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin
@RequestMapping(value = "/login")
public class Authentification {
 
	@Autowired
	private TokenProvider tokenProvider;

	@Autowired
	private AuthenticationManager authenticationManager;
	
	 @Autowired
	 private AuthenticationService authenticationService;
	
	@Autowired
	private UserService userServ;
	
	/*
	 @GetMapping(params = "email")
	 public User update(@RequestParam String email) {
		 System.out.println("dans le get");
	   return this.userServ.findByEmail(email);
	 }
	 */
/*
	@PostMapping
	public @ResponseBody
    JWTToken authorize(@Valid @RequestBody RecupLogin recupLogin) {
		
		System.out.println("dans le post");
		UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
				recupLogin.getEmail(), recupLogin.getPassword());

		Authentication authentication = this.authenticationManager.authenticate(authenticationToken);
		SecurityContextHolder.getContext().setAuthentication(authentication);

		boolean rememberMe = recupLogin.isActif();

		String jwt = tokenProvider.createToken(authentication, rememberMe);

		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add(JWTFilter.AUTHORIZATION_HEADER, "Bearer " + jwt);

		return new JWTToken(jwt);
	}
*/
	/**
	 * Object to return as body in JWT Authentication.
	 */

	static class JWTToken {

		private String idToken;

		JWTToken(String idToken) {
			this.idToken = idToken;
		}

		@JsonProperty("id_token")
		String getIdToken() {
			return idToken;
		}

		void setIdToken(String idToken) {
			this.idToken = idToken;
		}

	}
	

	
	
}