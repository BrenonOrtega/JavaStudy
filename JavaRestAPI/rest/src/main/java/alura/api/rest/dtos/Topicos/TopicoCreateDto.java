package alura.api.rest.dtos.Topicos;

import alura.api.rest.modelo.Curso;
import alura.api.rest.modelo.Topico;
import alura.api.rest.repository.CursoRepository;

public class TopicoCreateDto {
    public String titulo;
    public String mensagem;
    public String nomeCurso;
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getMensagem() {
        return mensagem;
    }
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    
    public Topico criarTopico(TopicoCreateDto novoTopico, CursoRepository _cursoRepository) {
        Curso curso = _cursoRepository.findByNome(nomeCurso);
        return new Topico(titulo, mensagem, curso);
    }
}
