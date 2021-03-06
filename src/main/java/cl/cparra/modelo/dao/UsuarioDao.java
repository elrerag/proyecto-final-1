package cl.cparra.modelo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.cparra.modelo.entity.UsuarioEntidad;
import java.util.Optional;

public interface UsuarioDao extends JpaRepository<UsuarioEntidad, Integer>{
	Optional<UsuarioEntidad> findByCorreo(String correo);
}
