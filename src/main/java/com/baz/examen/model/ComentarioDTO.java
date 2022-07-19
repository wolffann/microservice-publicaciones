package com.baz.examen.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class ComentarioDTO implements Serializable {
	
	private static final long serialVersionUID = 4191789127331268993L;

	private Integer idComentario;
	
	private Integer idPublicacion;
	
	private Integer idUsuario;
	
	private String  txComentario;
	
	private Character stComentario;
	
	private String fhCreacion;
	
	private String fhModificacion;

}
