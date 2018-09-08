/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamesmanager;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author victor
 */
@Entity
@Table(name = "VwEmprestimo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwEmprestimo.findAll", query = "SELECT v FROM VwEmprestimo v")
    , @NamedQuery(name = "VwEmprestimo.findById", query = "SELECT v FROM VwEmprestimo v WHERE v.id = :id")
    , @NamedQuery(name = "VwEmprestimo.findByNome", query = "SELECT v FROM VwEmprestimo v WHERE v.nome = :nome")
    , @NamedQuery(name = "VwEmprestimo.findByGenero", query = "SELECT v FROM VwEmprestimo v WHERE v.genero = :genero")
    , @NamedQuery(name = "VwEmprestimo.findByPlataforma", query = "SELECT v FROM VwEmprestimo v WHERE v.plataforma = :plataforma")
    , @NamedQuery(name = "VwEmprestimo.findByNota", query = "SELECT v FROM VwEmprestimo v WHERE v.nota = :nota")
    , @NamedQuery(name = "VwEmprestimo.findByEstudio", query = "SELECT v FROM VwEmprestimo v WHERE v.estudio = :estudio")
    , @NamedQuery(name = "VwEmprestimo.findByNUsuarios", query = "SELECT v FROM VwEmprestimo v WHERE v.nUsuarios = :nUsuarios")})
public class VwEmprestimo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    @Id
    private int id;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "genero")
    private String genero;
    @Column(name = "plataforma")
    private String plataforma;
    @Column(name = "nota")
    private Short nota;
    @Column(name = "estudio")
    private String estudio;
    @Column(name = "n_usuarios")
    private BigInteger nUsuarios;

    public VwEmprestimo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public Short getNota() {
        return nota;
    }

    public void setNota(Short nota) {
        this.nota = nota;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public BigInteger getN_usuarios() {
        return nUsuarios;
    }

    public void setN_usuarios(BigInteger nUsuarios) {
        this.nUsuarios = nUsuarios;
    }
    
}
