package com.draconomicon.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.draconomicon.api.config.Rank;
import com.draconomicon.api.model.AuthenticationRequest;
import com.draconomicon.api.model.AuthenticationResponse;
import com.draconomicon.api.model.Profil;
import com.draconomicon.api.model.RegisterRequest;
import com.draconomicon.api.repository.ProfilRepository;

@Service
public class AuthenticationService {
	@Autowired
	private ProfilRepository repository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private JwtService jwtService;
	@Autowired
	private AuthenticationManager authManager;

	public AuthenticationResponse register(RegisterRequest request) {
		Profil user = Profil.builder()
				.username(request.getUsername())
				.password(passwordEncoder.encode(request.getPassword()))
				.mail(request.getMail())
				.age(request.getAge())
				.genreProfil(request.getGenreProfil())
				.mineurMajeur(request.getMineurMajeur())
				.idRole(1)
				.role(Rank.USER)
				.build();
		repository.save(user);
		var jwtToken = jwtService.generateToken(user);
		return AuthenticationResponse.builder()
				.token(jwtToken)
				.build();
	}

	public AuthenticationResponse authentication(AuthenticationRequest request) {
		authManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(),request.getPassword()));
		Profil user = repository.findByUsername(request.getUsername()).orElseThrow();
		var jwtToken = jwtService.generateToken(user);
		return AuthenticationResponse.builder()
				.token(jwtToken)
				.build();
	}

}
