package com.generation.learnpoint.security;

import java.util.Collection;
import java.util.List;

<<<<<<< HEAD
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.generation.learnpoint.model.Usuario;
=======
import com.generation.learnpoint.model.Usuario;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

>>>>>>> cc58f745cdaccd775fdef411d90aeda948ed13dc

public class UserDetailsImpl implements UserDetails {
	private static final long serialVersionUID = 1L;

	private String userName;
	private String password;
	private List<GrantedAuthority> authorities;

	public UserDetailsImpl(Usuario usuario) {
		this.userName = usuario.getLogin();
		this.password = usuario.getSenha();
	}

	public UserDetailsImpl() {	}

<<<<<<< HEAD
=======

>>>>>>> cc58f745cdaccd775fdef411d90aeda948ed13dc
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {

		return userName;
	}

<<<<<<< HEAD
=======

>>>>>>> cc58f745cdaccd775fdef411d90aeda948ed13dc
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

<<<<<<< HEAD
=======

>>>>>>> cc58f745cdaccd775fdef411d90aeda948ed13dc
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
<<<<<<< HEAD
=======

>>>>>>> cc58f745cdaccd775fdef411d90aeda948ed13dc
	
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

<<<<<<< HEAD
=======
	
>>>>>>> cc58f745cdaccd775fdef411d90aeda948ed13dc
	@Override
	public boolean isEnabled() {
		return true;
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> cc58f745cdaccd775fdef411d90aeda948ed13dc
