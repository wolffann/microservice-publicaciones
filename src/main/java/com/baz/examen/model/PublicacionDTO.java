package com.baz.examen.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class PublicacionDTO implements Serializable {
	
	private static final long serialVersionUID = 4171877829922577397L;

	private Integer idPublicacion;
	
	private Integer idUsuario;

	private String txPublicacion;
	
	private Character stPublicacion;
	
	private String fhCreacion;
	
	private String fhModificacion;
	
	private List<ComentarioDTO> comentariosList = new ArrayList<>();
	
}
