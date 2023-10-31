/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;



import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Collection;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "micro_market")
@NamedQueries({
    @NamedQuery(name = "MicroMarket.findAll", query = "SELECT m FROM MicroMarket m"),
    @NamedQuery(name = "MicroMarket.findByZipCode", query = "SELECT m FROM MicroMarket m WHERE m.zipCode = :zipCode"),
    @NamedQuery(name = "MicroMarket.findByRadius", query = "SELECT m FROM MicroMarket m WHERE m.radius = :radius"),
    @NamedQuery(name = "MicroMarket.findByAreaLength", query = "SELECT m FROM MicroMarket m WHERE m.areaLength = :areaLength"),
    @NamedQuery(name = "MicroMarket.findByAreaWidth", query = "SELECT m FROM MicroMarket m WHERE m.areaWidth = :areaWidth")})
public class MicroMarket implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @Id
    @Basic(optional = false)
    @Column(name = "ZIP_CODE")
    private String zipCode;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation

    /**
     *
     */
    @Column(name = "RADIUS")
    private Double radius;

    /**
     *
     */
    @Column(name = "AREA_LENGTH")
    private Double areaLength;

    /**
     *
     */
    @Column(name = "AREA_WIDTH")
    private Double areaWidth;

    /**
     *
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "zip")
    private Collection<Customer> customerCollection;

    /**
     *
     */
    public MicroMarket() {
    }

    /**
     *
     * @param zipCode
     */
    public MicroMarket(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     *
     * @return
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     *
     * @param zipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     *
     * @return
     */
    public Double getRadius() {
        return radius;
    }

    /**
     *
     * @param radius
     */
    public void setRadius(Double radius) {
        this.radius = radius;
    }

    /**
     *
     * @return
     */
    public Double getAreaLength() {
        return areaLength;
    }

    /**
     *
     * @param areaLength
     */
    public void setAreaLength(Double areaLength) {
        this.areaLength = areaLength;
    }

    /**
     *
     * @return
     */
    public Double getAreaWidth() {
        return areaWidth;
    }

    /**
     *
     * @param areaWidth
     */
    public void setAreaWidth(Double areaWidth) {
        this.areaWidth = areaWidth;
    }

    /**
     *
     * @return
     */
    public Collection<Customer> getCustomerCollection() {
        return customerCollection;
    }

    /**
     *
     * @param customerCollection
     */
    public void setCustomerCollection(Collection<Customer> customerCollection) {
        this.customerCollection = customerCollection;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zipCode != null ? zipCode.hashCode() : 0);
        return hash;
    }

    /**
     *
     * @param object
     * @return
     */
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MicroMarket)) {
            return false;
        }
        MicroMarket other = (MicroMarket) object;
        if ((this.zipCode == null && other.zipCode != null) || (this.zipCode != null && !this.zipCode.equals(other.zipCode))) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "ma.emsi.tp1customermahmoudrazzouk.entity.MicroMarket[ zipCode=" + zipCode + " ]";
    }
    
}