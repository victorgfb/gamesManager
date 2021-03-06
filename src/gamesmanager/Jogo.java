package gamesmanager;
// Generated 08/09/2018 09:08:52 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Jogo generated by hbm2java
 */
public class Jogo  implements java.io.Serializable {


     private Integer pkCod;
     private Estudio estudio;
     private String nome;
     private String genero;
     private Short nota;
     private int anoLanc;
     private Set plataformas = new HashSet(0);
     private Set usuarios = new HashSet(0);

    public Jogo() {
    }

	
    public Jogo(Estudio estudio, String nome, String genero) {
        this.estudio = estudio;
        this.nome = nome;
        this.genero = genero;
    }
    public Jogo(Estudio estudio, String nome, String genero, Short nota, int anoLanc, Set plataformas, Set usuarios) {
       this.estudio = estudio;
       this.nome = nome;
       this.genero = genero;
       this.nota = nota;
       this.anoLanc = anoLanc;
       this.plataformas = plataformas;
       this.usuarios = usuarios;
    }
   
    public Integer getPkCod() {
        return this.pkCod;
    }
    
    public void setPkCod(Integer pkCod) {
        this.pkCod = pkCod;
    }
    public Estudio getEstudio() {
        return this.estudio;
    }
    
    public void setEstudio(Estudio estudio) {
        this.estudio = estudio;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGenero() {
        return this.genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Short getNota() {
        return this.nota;
    }
    
    public void setNota(Short nota) {
        this.nota = nota;
    }
    public int getAnoLanc() {
        return this.anoLanc;
    }
    
    public void setAnoLanc(int anoLanc) {
        this.anoLanc = anoLanc;
    }
    public Set getPlataformas() {
        return this.plataformas;
    }
    
    public void setPlataformas(Set plataformas) {
        this.plataformas = plataformas;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }




}


