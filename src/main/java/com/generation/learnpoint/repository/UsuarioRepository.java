package com.generation.learnpoint.repository;

import java.util.Optional;

import com.generation.learnpoint.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	
<<<<<<< HEAD
	public Optional<Usuario> findByUsuario(String usuario);
=======
	public Optional<Usuario> findByUsuario(String Usuario);
>>>>>>> b5f7d91e63a24ee7b82cf66652e3793ebb823268

}
