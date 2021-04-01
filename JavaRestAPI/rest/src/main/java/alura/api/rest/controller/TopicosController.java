package alura.api.rest.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import alura.api.rest.dtos.Topicos.TopicoCreateDto;
import alura.api.rest.dtos.Topicos.TopicoReadDto;
import alura.api.rest.modelo.Topico;
import alura.api.rest.repository.CursoRepository;
import alura.api.rest.repository.TopicoRepository;

@RestController
@RequestMapping("/topicos")
public class TopicosController {
    
	private TopicoRepository _topicoRepository;
    private CursoRepository _cursoRepository;

    private TopicosController (TopicoRepository topicoRepository, CursoRepository cursoRepository){
        this._topicoRepository = topicoRepository;
        this._cursoRepository = cursoRepository;
    }

    @GetMapping
    /* querystring => /topicos?curso=[nome do curso] */
    List<TopicoReadDto> listaTopicos(String curso) {
        if( curso == null) {
            List<Topico> topicos = _topicoRepository.findAll();
            return TopicoReadDto.ToList(topicos);
        } else {
            List<Topico> topicos = _topicoRepository.findByCurso_Nome(curso);
            return TopicoReadDto.ToList(topicos);
        }
    }

    @PostMapping
    public ResponseEntity<TopicoReadDto> cadastrar(@RequestBody TopicoCreateDto novoTopico, UriComponentsBuilder uriBuilder){
        Topico _novoTopico = novoTopico.criarTopico(novoTopico, _cursoRepository);
        _topicoRepository.save(_novoTopico);
        URI uri = uriBuilder.path("/topicos/{id}").buildAndExpand(_novoTopico.getId()).toUri();
        return  ResponseEntity.created(uri).body( new TopicoReadDto(_novoTopico) );
    }
}
