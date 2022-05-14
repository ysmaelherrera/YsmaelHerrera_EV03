package com.idat.EV03.service;

import java.util.List;

import com.idat.EV03.dto.UsuarioClienteRequestDTO;
import com.idat.EV03.dto.UsuarioClienteResponseDTO;

public interface UsuarioClienteService {

	public void guardarUsuarioCliente(UsuarioClienteRequestDTO u);
	public void eliminarUsuarioCliente(Integer id);
	public void editarUsuarioCliente(UsuarioClienteRequestDTO u);
	public List<UsuarioClienteResponseDTO> listarUsuarioCliente();
	public UsuarioClienteResponseDTO usuarioCliebnteById(Integer id);
}
