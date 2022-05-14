package com.idat.EV03.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Table(name = "hospital")
@Entity
public class Hospital {

	private Integer idHospital;
	private String nombre;
	private String descripcion;
	private String distrito;
	
	@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(name = "cliente_hospital",
	joinColumns = @JoinColumn(name = "id_hospital", nullable = false, unique = true, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (id_hospital) references hospital (id_hospital)")),
	inverseJoinColumns = @JoinColumn(name = "id_cliente", nullable = false, unique = true, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (id_cliente) references cliente (id_cliente)"))
	)
	private List<Cliente> cliente = new ArrayList<>();

	public Integer getIdHospital() {
		return idHospital;
	}

	public void setIdHospital(Integer idHospital) {
		this.idHospital = idHospital;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public List<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}
	
	
}
