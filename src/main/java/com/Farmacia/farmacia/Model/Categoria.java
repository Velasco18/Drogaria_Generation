package com.Farmacia.farmacia.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	//@NotNull
	//@Size(min = 10, max =100)
	//private String nome;
	
	@NotNull
	@Size(min = 10, max = 100)
	private String descricaoCategoria;
	
	
	@ManyToOne
	@JsonIgnoreProperties("categoria")
	private Produto produto;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	/*public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	*/
	

	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}
	

	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	
	
	
	
	

}
