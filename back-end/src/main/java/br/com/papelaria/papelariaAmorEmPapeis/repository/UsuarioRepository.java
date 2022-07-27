package br.com.papelaria.papelariaAmorEmPapeis.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.papelaria.papelariaAmorEmPapeis.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String>{

	public Optional<Usuario> findByUsuario(String usuario);
 
}
