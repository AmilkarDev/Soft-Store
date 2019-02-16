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
@Table(name = "besoin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Besoin.findAll", query = "SELECT b FROM Besoin b")
    , @NamedQuery(name = "Besoin.findByIdBesoin", query = "SELECT b FROM Besoin b WHERE b.idBesoin = :idBesoin")
    , @NamedQuery(name = "Besoin.findByCategorie", query = "SELECT b FROM Besoin b WHERE b.categorie = :categorie")
    , @NamedQuery(name = "Besoin.findByDescription", query = "SELECT b FROM Besoin b WHERE b.description = :description")})
public class Besoin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_besoin")
    private Integer idBesoin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "categorie")
    private String categorie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 55)
    @Column(name = "description")
    private String description;

    public Besoin() {
    }

    public Besoin(Integer idBesoin) {
        this.idBesoin = idBesoin;
    }

    public Besoin(Integer idBesoin, String categorie, String description) {
        this.idBesoin = idBesoin;
        this.categorie = categorie;
        this.description = description;
    }

    public Integer getIdBesoin() {
        return idBesoin;
    }

    public void setIdBesoin(Integer idBesoin) {
        this.idBesoin = idBesoin;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBesoin != null ? idBesoin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Besoin)) {
            return false;
        }
        Besoin other = (Besoin) object;
        if ((this.idBesoin == null && other.idBesoin != null) || (this.idBesoin != null && !this.idBesoin.equals(other.idBesoin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Besoin[ idBesoin=" + idBesoin + " ]";
    }
    
}
