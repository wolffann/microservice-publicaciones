package com.baz.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.baz.examen.model.ComentarioDTO;
import com.baz.examen.model.PublicacionDTO;
import com.baz.examen.service.iface.ComentarioService;
import com.baz.examen.service.iface.PublicacionService;

@RestController
public class PublicacionController {
	
	@Autowired
	private PublicacionService publicacionService;
	
	@Autowired
	private ComentarioService comentarioService;
	
	@PostMapping("/publicaciones")
	public ResponseEntity<PublicacionDTO> guardarPublicacion(@RequestBody PublicacionDTO publicacionDTO) {
		return new ResponseEntity<>(publicacionService.guardarPublicacion(publicacionDTO), HttpStatus.CREATED);
	}
	
	@GetMapping("/publicaciones/{idUsuario}")
	public ResponseEntity<List<PublicacionDTO>> consultarPublicacionesConComentarios(@PathVariable Integer idUsuario) {
		return new ResponseEntity<>(publicacionService.consultarPublicacionesConComentarios(idUsuario), HttpStatus.OK);
	}

	@PostMapping("/comentarios")
	public ResponseEntity<ComentarioDTO> guardarComentario(@RequestBody ComentarioDTO comentarioDTO) {
		return new ResponseEntity<>(comentarioService.guardarComentario(comentarioDTO), HttpStatus.CREATED);
	}

}
