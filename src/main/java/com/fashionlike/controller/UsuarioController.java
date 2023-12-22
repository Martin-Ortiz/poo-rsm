package com.fashionlike.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fashionlike.request.RequestUsuario;
import com.fashionlike.service.IUsuarioService;

@RestController
@RequestMapping("/v1/usuarios")
public class UsuarioController {
	
	@Autowired
	IUsuarioService usuarioService;
	
	@PostMapping("/registrar")
	public ResponseEntity<String> registrarUsuario(@RequestBody RequestUsuario datosUsuario){
		
		String respuesta = usuarioService.registrarUsuario(datosUsuario);
		
		return new ResponseEntity<String>(respuesta, HttpStatus.OK);
	}
	
}
