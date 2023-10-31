/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;



import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "customer")
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c"),
    @NamedQuery(name = "Customer.findByCustomerId", query = "SELECT c FROM Customer c WHERE c.customerId = :customerId"),
    @NamedQuery(name = "Customer.findByName", query = "SELECT c FROM Customer c WHERE c.name = :name"),
    @NamedQuery(name = "Customer.findByAddressline1", query = "SELECT c FROM Customer c WHERE c.addressline1 = :addressline1"),
    @NamedQuery(name = "Customer.findByAddressline2", query = "SELECT c FROM Customer c WHERE c.addressline2 = :addressline2"),
    @NamedQuery(name = "Customer.findByCity", query = "SELECT c FROM Customer c WHERE c.city = :city"),
    @NamedQuery(name = "Customer.findByState", query = "SELECT c FROM Customer c WHERE c.state = :state"),
    @NamedQuery(name = "Customer.findByPhone", query = "SELECT c FROM Customer c WHERE c.phone = :phone"),
    @NamedQuery(name = "Customer.findByFax", query = "SELECT c FROM Customer c WHERE c.fax = :fax"),
    @NamedQuery(name = "Customer.findByEmail", query = "SELECT c FROM Customer c WHERE c.email = :email"),
    @NamedQuery(name = "Customer.findByCreditLimit", query = "SELECT c FROM Customer c WHERE c.creditLimit = :creditLimit")})
public class Customer implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @Id
    @Basic(optional = false)
    @Column(name = "CUSTOMER_ID")
    private Integer customerId;

    /**
     *
     */
    @Column(name = "NAME")
    private String name;

    /**
     *
     */
    @Column(name = "ADDRESSLINE1")
    private String addressline1;

    /**
     *
     */
    @Column(name = "ADDRESSLINE2")
    private String addressline2;

    /**
     *
     */
    @Column(name = "CITY")
    private String city;

    /**
     *
     */
    @Column(name = "STATE")
    private String state;

    /**
     *
     */
    @Column(name = "PHONE")
    private String phone;

    /**
     *
     */
    @Column(name = "FAX")
    private String fax;

    /**
     *
     */
    @Column(name = "EMAIL")
    private String email;

    /**
     *
     */
    @Column(name = "CREDIT_LIMIT")
    private Integer creditLimit;

    /**
     *
     */
    @JoinColumn(name = "DISCOUNT_CODE", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Discount discount;

    /**
     *
     */
    @JoinColumn(name = "ZIP", referencedColumnName = "ZIP_CODE")
    @ManyToOne(optional = false)
    private MicroMarket zip;

    /**
     *
     */
    public Customer() {
    }

    /**
     *
     * @param customerId
     */
    public Customer(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     *
     * @return
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     *
     * @param customerId
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getAddressline1() {
        return addressline1;
    }

    /**
     *
     * @param addressline1
     */
    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1;
    }

    /**
     *
     * @return
     */
    public String getAddressline2() {
        return addressline2;
    }

    /**
     *
     * @param addressline2
     */
    public void setAddressline2(String addressline2) {
        this.addressline2 = addressline2;
    }

    /**
     *
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @return
     */
    public String getState() {
        return state;
    }

    /**
     *
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     *
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     *
     * @return
     */
    public String getFax() {
        return fax;
    }

    /**
     *
     * @param fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public Integer getCreditLimit() {
        return creditLimit;
    }

    /**
     *
     * @param creditLimit
     */
    public void setCreditLimit(Integer creditLimit) {
        this.creditLimit = creditLimit;
    }

    /**
     *
     * @return
     */
    public Discount getDiscount() {
        return discount;
    }

    /**
     *
     * @param discount
     */
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    /**
     *
     * @return
     */
    public MicroMarket getZip() {
        return zip;
    }

    /**
     *
     * @param zip
     */
    public void setZip(MicroMarket zip) {
        this.zip = zip;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerId != null ? customerId.hashCode() : 0);
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
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.customerId == null && other.customerId != null) || (this.customerId != null && !this.customerId.equals(other.customerId))) {
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
        return "ma.emsi.tp1customermahmoudrazzouk.entity.Customer[ customerId=" + customerId + " ]";
    }
    
}