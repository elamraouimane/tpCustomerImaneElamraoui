/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import entity.Customer;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import java.util.List;


/**
 *
 * @author ADMIN
 */
@RequestScoped
public class CustomerManager {

    /**
     *
     */
    @PersistenceContext(unitName = "customerPU")
    private EntityManager em;

    /**
     *
     * @return
     */
    public List<Customer> getAllCustomers() {
        Query query = em.createNamedQuery("Customer.findAll");
        return query.getResultList();
    }

    /**
     *
     * @param customer
     * @return
     */
    @Transactional
    public Customer update(Customer customer) {
        return em.merge(customer);
    }

    /**
     *
     * @param customer
     */
    @Transactional
    public void persist(Customer customer) {
        em.persist(customer);
    }

    /**
     *
     * @param idCustomer
     * @return
     */
    public Customer findById(int idCustomer) {
        return em.find(Customer.class, idCustomer);
    }
}
