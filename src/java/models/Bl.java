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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "bl")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bl.findAll", query = "SELECT b FROM Bl b")
    , @NamedQuery(name = "Bl.findByIdBl", query = "SELECT b FROM Bl b WHERE b.idBl = :idBl")
    , @NamedQuery(name = "Bl.findByIdLogiciel", query = "SELECT b FROM Bl b WHERE b.idLogiciel = :idLogiciel")
    , @NamedQuery(name = "Bl.findByIdBesion", query = "SELECT b FROM Bl b WHERE b.idBesion = :idBesion")})
public class Bl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_bl")
    private Integer idBl;
    @Column(name = "id_logiciel")
    private Integer idLogiciel;
    @Column(name = "id_besion")
    private Integer idBesion;

    public Bl() {
    }

    public Bl(Integer idBl) {
        this.idBl = idBl;
    }

    public Integer getIdBl() {
        return idBl;
    }

    public void setIdBl(Integer idBl) {
        this.idBl = idBl;
    }

    public Integer getIdLogiciel() {
        return idLogiciel;
    }

    public void setIdLogiciel(Integer idLogiciel) {
        this.idLogiciel = idLogiciel;
    }

    public Integer getIdBesion() {
        return idBesion;
    }

    public void setIdBesion(Integer idBesion) {
        this.idBesion = idBesion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBl != null ? idBl.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bl)) {
            return false;
        }
        Bl other = (Bl) object;
        if ((this.idBl == null && other.idBl != null) || (this.idBl != null && !this.idBl.equals(other.idBl))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Bl[ idBl=" + idBl + " ]";
    }
    
}
