package gamesmanager;
// Generated 08/09/2018 09:08:52 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private String pkCpf;
     private String nome;
     private String email;
     private String senha;
     private String cidade;
     private String estado;
     private Integer ddd;
     private Integer numero;
     private String sexo;
     private Set jogos = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(String pkCpf, String nome, String email, String senha, String cidade, String estado, String sexo) {
        this.pkCpf = pkCpf;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cidade = cidade;
        this.estado = estado;
        this.sexo = sexo;
    }
    public Usuario(String pkCpf, String nome, String email, String senha, String cidade, String estado, Integer ddd, Integer numero, String sexo, Set jogos) {
       this.pkCpf = pkCpf;
       this.nome = nome;
       this.email = email;
       this.senha = senha;
       this.cidade = cidade;
       this.estado = estado;
       this.ddd = ddd;
       this.numero = numero;
       this.sexo = sexo;
       this.jogos = jogos;
    }
   
    public String getPkCpf() {
        return this.pkCpf;
    }
    
    public void setPkCpf(String pkCpf) {
        this.pkCpf = pkCpf;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getCidade() {
        return this.cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Integer getDdd() {
        return this.ddd;
    }
    
    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }
    public Integer getNumero() {
        return this.numero;
    }
    
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public Set getJogos() {
        return this.jogos;
    }
    
    public void setJogos(Set jogos) {
        this.jogos = jogos;
    }
}


