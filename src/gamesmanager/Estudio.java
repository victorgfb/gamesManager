package gamesmanager;
// Generated 08/09/2018 09:08:52 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Estudio generated by hbm2java
 */
public class Estudio  implements java.io.Serializable {


     private Integer pkCod;
     private String nome;
     private String sede;
     private Set jogos = new HashSet(0);
     private Set plataformas = new HashSet(0);

    public Estudio() {
    }

    public Estudio(String nome, String sede, Set jogos, Set plataformas) {
       this.nome = nome;
       this.sede = sede;
       this.jogos = jogos;
       this.plataformas = plataformas;
    }
   
    public Integer getPkCod() {
        return this.pkCod;
    }
    
    public void setPkCod(Integer pkCod) {
        this.pkCod = pkCod;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSede() {
        return this.sede;
    }
    
    public void setSede(String sede) {
        this.sede = sede;
    }
    public Set getJogos() {
        return this.jogos;
    }
    
    public void setJogos(Set jogos) {
        this.jogos = jogos;
    }
    public Set getPlataformas() {
        return this.plataformas;
    }
    
    public void setPlataformas(Set plataformas) {
        this.plataformas = plataformas;
    }




}


