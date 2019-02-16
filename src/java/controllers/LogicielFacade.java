/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import models.Logiciel;

/**
 *
 * @author LENOVO
 */
@Stateless
public class LogicielFacade extends AbstractFacade<Logiciel> implements LogicielFacadeLocal {

    @PersistenceContext(unitName = "projeJeePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LogicielFacade() {
        super(Logiciel.class);
    }
    
}
