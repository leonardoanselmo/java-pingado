package br.com.plugueinformatica;

import br.com.plugueinformatica.controller.ControllerUsuario;

public class Aplicacao {

	public static void main(String[] args) {
		
		ControllerUsuario controllerUsuario = new ControllerUsuario();
		controllerUsuario.listarUsuarios();

	}

}
