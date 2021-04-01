package alura.api.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import alura.api.rest.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

    public Curso findByNome(String nomeCurso);

}