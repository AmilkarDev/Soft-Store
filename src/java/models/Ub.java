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
@Table(name = "ub")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ub.findAll", query = "SELECT u FROM Ub u")
    , @NamedQuery(name = "Ub.findByCatId", query = "SELECT u FROM Ub u WHERE u.catId = :catId")
    , @NamedQuery(name = "Ub.findByIdUser", query = "SELECT u FROM Ub u WHERE u.idUser = :idUser")
    , @NamedQuery(name = "Ub.findByIdBesoin", query = "SELECT u FROM Ub u WHERE u.idBesoin = :idBesoin")})
public class Ub implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cat_id")
    private Integer catId;
    @Column(name = "id_user")
    private Integer idUser;
    @Column(name = "id_besoin")
    private Integer idBesoin;

    public Ub() {
    }

    public Ub(Integer catId) {
        this.catId = catId;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdBesoin() {
        return idBesoin;
    }

    public void setIdBesoin(Integer idBesoin) {
        this.idBesoin = idBesoin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (catId != null ? catId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ub)) {
            return false;
        }
        Ub other = (Ub) object;
        if ((this.catId == null && other.catId != null) || (this.catId != null && !this.catId.equals(other.catId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Ub[ catId=" + catId + " ]";
    }
    
}
