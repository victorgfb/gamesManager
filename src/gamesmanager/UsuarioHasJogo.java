package gamesmanager;
// Generated 30/08/2018 12:31:40 by Hibernate Tools 4.3.1



/**
 * UsuarioHasJogo generated by hbm2java
 */
public class UsuarioHasJogo  implements java.io.Serializable {


     private UsuarioHasJogoId id;
     private Jogo jogo;
     private Usuario usuario;
     private boolean finalizado;
     private short horas;

    public UsuarioHasJogo() {
    }

    public UsuarioHasJogo(UsuarioHasJogoId id, Jogo jogo, Usuario usuario, boolean finalizado, short horas) {
       this.id = id;
       this.jogo = jogo;
       this.usuario = usuario;
       this.finalizado = finalizado;
       this.horas = horas;
    }
   
    public UsuarioHasJogoId getId() {
        return this.id;
    }
    
    public void setId(UsuarioHasJogoId id) {
        this.id = id;
    }
    public Jogo getJogo() {
        return this.jogo;
    }
    
    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public boolean isFinalizado() {
        return this.finalizado;
    }
    
    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }
    public short getHoras() {
        return this.horas;
    }
    
    public void setHoras(short horas) {
        this.horas = horas;
    }




}

