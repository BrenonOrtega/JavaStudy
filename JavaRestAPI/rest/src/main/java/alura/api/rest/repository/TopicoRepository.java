package alura.api.rest.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import alura.api.rest.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    
    public List<Topico> findByCurso_Nome(String nomeCurso);
    
}
