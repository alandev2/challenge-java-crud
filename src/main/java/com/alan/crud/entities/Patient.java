package com.alan.crud.entities;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
@Table(name="patients")
public class Patient implements Serializable {  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long    id;
    public String  name;
    public String  cpf;
    public String  rg;
    public String  data_nasc;
    public String  tipo_sanguinio;
    public String  cep;
    public String  uf;
    public String  localidade;
    public String  bairro;
    public String  rua;
    public String  numero;
}