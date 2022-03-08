package com.generation.learnpoint.security;

import java.util.Optional;

<<<<<<< HEAD
=======
import com.generation.learnpoint.model.Usuario;
import com.generation.learnpoint.repository.UsuarioRepository;

>>>>>>> cc58f745cdaccd775fdef411d90aeda948ed13dc
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import com.generation.learnpoint.model.Usuario;
import com.generation.learnpoint.repository.UsuarioRepository;

=======
>>>>>>> cc58f745cdaccd775fdef411d90aeda948ed13dc
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UsuarioRepository userRepository;

<<<<<<< HEAD
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		Optional<Usuario> usuario = userRepository.findByLogin(userName);

		usuario.orElseThrow(() -> new UsernameNotFoundException(userName + " not found."));

=======
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		
		
		Optional<Usuario> usuario = userRepository.findByLogin(userName);
		
		
	  
		usuario.orElseThrow(() -> new UsernameNotFoundException(userName + " not found."));

		

>>>>>>> cc58f745cdaccd775fdef411d90aeda948ed13dc
		return usuario.map(UserDetailsImpl::new).get();
	}
}