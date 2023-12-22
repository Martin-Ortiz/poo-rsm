package com.fashionlike.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestUsuario {
	private String username;
	private String password;
	private String email;
	private String ocupacion;
}
