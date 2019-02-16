/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "logiciel")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Logiciel.findAll", query = "SELECT l FROM Logiciel l")
    , @NamedQuery(name = "Logiciel.findByIdLogiciel", query = "SELECT l FROM Logiciel l WHERE l.idLogiciel = :idLogiciel")
    , @NamedQuery(name = "Logiciel.findByNom", query = "SELECT l FROM Logiciel l WHERE l.nom = :nom")
    , @NamedQuery(name = "Logiciel.findByVersion", query = "SELECT l FROM Logiciel l WHERE l.version = :version")})
public class Logiciel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_logiciel")
    private Integer idLogiciel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "nom")
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "version")
    private String version;

    public Logiciel() {
    }

    public Logiciel(Integer idLogiciel) {
        this.idLogiciel = idLogiciel;
    }

    public Logiciel(Integer idLogiciel, String nom, String version) {
        this.idLogiciel = idLogiciel;
        this.nom = nom;
        this.version = version;
    }

    public Integer getIdLogiciel() {
        return idLogiciel;
    }

    public void setIdLogiciel(Integer idLogiciel) {
        this.idLogiciel = idLogiciel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLogiciel != null ? idLogiciel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Logiciel)) {
            return false;
        }
        Logiciel other = (Logiciel) object;
        if ((this.idLogiciel == null && other.idLogiciel != null) || (this.idLogiciel != null && !this.idLogiciel.equals(other.idLogiciel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Logiciel[ idLogiciel=" + idLogiciel + " ]";
    }
    
}
