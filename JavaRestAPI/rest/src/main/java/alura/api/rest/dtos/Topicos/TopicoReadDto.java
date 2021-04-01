package alura.api.rest.dtos.Topicos;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import alura.api.rest.modelo.Topico;

public class TopicoReadDto {
    
    private long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;

    public TopicoReadDto(Topico topico) {
        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.dataCriacao = topico.getDataCriacao();        
    }

    public long getId() { return id; }
    
    public String getTitulo() { return titulo; }
    
    public String getMensagem() { return mensagem; }
   
    public LocalDateTime getDataCriacao() { return dataCriacao; }

    public static List<TopicoReadDto> ToList(List<Topico> topicos) {
        
        return topicos.stream()
                .map(TopicoReadDto::new)
                .collect(Collectors.toList()); 
    }



}
