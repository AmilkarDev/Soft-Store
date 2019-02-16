/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import models.Ub;

/**
 *
 * @author LENOVO
 */
@Stateless
public class UbFacade extends AbstractFacade<Ub> implements UbFacadeLocal {

    @PersistenceContext(unitName = "projeJeePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UbFacade() {
        super(Ub.class);
    }
    
}
