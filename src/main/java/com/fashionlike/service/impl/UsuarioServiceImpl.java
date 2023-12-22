package com.fashionlike.service.impl;

import org.springframework.stereotype.Service;

import com.fashionlike.request.RequestUsuario;
import com.fashionlike.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Override
	public String registrarUsuario(RequestUsuario datosUsuario) {
		//Simular registroen base de datos
		RequestUsuario registoDB = new RequestUsuario("Martin", "1234", "matkub.test@gmail.com", "Backend developer");
		RequestUsuario porRegistrar = new RequestUsuario();
		
		porRegistrar.setUsername(datosUsuario.getUsername());
		porRegistrar.setPassword(datosUsuario.getPassword());
		porRegistrar.setEmail(datosUsuario.getEmail());
		porRegistrar.setOcupacion(datosUsuario.getOcupacion());
		
		System.out.println("Datos del registro: " + porRegistrar );
		
		if(porRegistrar.getUsername() == null || porRegistrar.getUsername().isEmpty()) {
			
			return "No se pudo registrar el usuario.";
		}else {
			return "Registro exitoso.";
		}
		
	}

}
