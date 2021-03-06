package com.ufpa.movieticket.model;
// Generated 07/04/2017 10:51:08 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Cidade generated by hbm2java
 */
@Entity
@Table(name="cidade"
    ,catalog="bd_sistemaCinema"
)
public class Cidade  implements java.io.Serializable {


     private Integer pkCidade;
     private String nomeCidade;
     private String uf;
     private Set<Cinema> cinemas = new HashSet<Cinema>(0);

    public Cidade() {
    }

	
    public Cidade(String nomeCidade, String uf) {
        this.nomeCidade = nomeCidade;
        this.uf = uf;
    }
    public Cidade(String nomeCidade, String uf, Set<Cinema> cinemas) {
       this.nomeCidade = nomeCidade;
       this.uf = uf;
       this.cinemas = cinemas;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="pk_cidade", unique=true, nullable=false)
    public Integer getPkCidade() {
        return this.pkCidade;
    }
    
    public void setPkCidade(Integer pkCidade) {
        this.pkCidade = pkCidade;
    }

    
    @Column(name="nome_cidade", nullable=false, length=45)
    public String getNomeCidade() {
        return this.nomeCidade;
    }
    
    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    
    @Column(name="uf", nullable=false, length=80)
    public String getUf() {
        return this.uf;
    }
    
    public void setUf(String uf) {
        this.uf = uf;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="cidade")
    public Set<Cinema> getCinemas() {
        return this.cinemas;
    }
    
    public void setCinemas(Set<Cinema> cinemas) {
        this.cinemas = cinemas;
    }




}


