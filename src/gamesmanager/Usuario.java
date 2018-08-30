package gamesmanager;
// Generated 30/08/2018 12:31:40 by Hibernate Tools 4.3.1


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
     private Set usuarioHasJogos = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(String pkCpf, String nome) {
        this.pkCpf = pkCpf;
        this.nome = nome;
    }
    public Usuario(String pkCpf, String nome, String email, String senha, Set usuarioHasJogos) {
       this.pkCpf = pkCpf;
       this.nome = nome;
       this.email = email;
       this.senha = senha;
       this.usuarioHasJogos = usuarioHasJogos;
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
    public Set getUsuarioHasJogos() {
        return this.usuarioHasJogos;
    }
    
    public void setUsuarioHasJogos(Set usuarioHasJogos) {
        this.usuarioHasJogos = usuarioHasJogos;
    }




}


