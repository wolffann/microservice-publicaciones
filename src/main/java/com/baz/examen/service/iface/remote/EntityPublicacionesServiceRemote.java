package com.baz.examen.service.iface.remote;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.baz.examen.model.ComentarioDTO;
import com.baz.examen.model.PublicacionDTO;
import com.baz.examen.service.impl.remote.EntityPublicacionesServiceFallback;

//@FeignClient(name = "entity-publicaciones", url = "localhost:8081", fallback=EntityPublicacionesServiceFallback.class)
@FeignClient(name = "entity-publicaciones", fallback=EntityPublicacionesServiceFallback.class)
public interface EntityPublicacionesServiceRemote {
	
	@PostMapping("/publicaciones")
	public PublicacionDTO guardarPublicacion(@RequestBody PublicacionDTO publicacionDTO);
	
	@GetMapping("/publicaciones/{idUsuario}")
	public List<PublicacionDTO> consultarPublicacionesConComentarios(@PathVariable Integer idUsuario);

	@PostMapping("/comentarios")
	public ComentarioDTO guardarComentario(@RequestBody ComentarioDTO comentarioDTO);
}
