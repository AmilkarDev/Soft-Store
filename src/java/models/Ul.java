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
@Table(name = "ul")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ul.findAll", query = "SELECT u FROM Ul u")
    , @NamedQuery(name = "Ul.findByIdUb", query = "SELECT u FROM Ul u WHERE u.idUb = :idUb")
    , @NamedQuery(name = "Ul.findByIdUser", query = "SELECT u FROM Ul u WHERE u.idUser = :idUser")
    , @NamedQuery(name = "Ul.findByIdLogiciel", query = "SELECT u FROM Ul u WHERE u.idLogiciel = :idLogiciel")})
public class Ul implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_ub")
    private Integer idUb;
    @Column(name = "id_user")
    private Integer idUser;
    @Column(name = "id_logiciel")
    private Integer idLogiciel;

    public Ul() {
    }

    public Ul(Integer idUb) {
        this.idUb = idUb;
    }

    public Integer getIdUb() {
        return idUb;
    }

    public void setIdUb(Integer idUb) {
        this.idUb = idUb;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdLogiciel() {
        return idLogiciel;
    }

    public void setIdLogiciel(Integer idLogiciel) {
        this.idLogiciel = idLogiciel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUb != null ? idUb.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ul)) {
            return false;
        }
        Ul other = (Ul) object;
        if ((this.idUb == null && other.idUb != null) || (this.idUb != null && !this.idUb.equals(other.idUb))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Ul[ idUb=" + idUb + " ]";
    }
    
}
