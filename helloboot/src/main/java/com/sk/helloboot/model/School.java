package com.sk.helloboot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Greenamp_0001")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class School implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="name", length = 50)
	private String name;
	
	@Column(name="email", length = 100)
	private String email;
	
	@Transient
	private String tmp;
	
	@Column(name="school_id")
	private Long school_id;
}
