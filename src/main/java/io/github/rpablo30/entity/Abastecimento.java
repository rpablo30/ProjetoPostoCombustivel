package io.github.rpablo30.entity;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "postocombustivel")
@Setter
@Getter
public class Abastecimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String bomba;
	private String combustivel;
	private double quantidadeLitros;
	private String valorAbastecido;
	private Date data;



}
