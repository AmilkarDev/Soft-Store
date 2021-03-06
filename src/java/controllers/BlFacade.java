/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import models.Bl;

/**
 *
 * @author LENOVO
 */
@Stateless
public class BlFacade extends AbstractFacade<Bl> implements BlFacadeLocal {

    @PersistenceContext(unitName = "projeJeePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BlFacade() {
        super(Bl.class);
    }
    
}
