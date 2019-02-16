/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import javax.ejb.Local;
import models.Logiciel;

/**
 *
 * @author LENOVO
 */
@Local
public interface LogicielFacadeLocal {

    void create(Logiciel logiciel);

    void edit(Logiciel logiciel);

    void remove(Logiciel logiciel);

    Logiciel find(Object id);

    List<Logiciel> findAll();

    List<Logiciel> findRange(int[] range);

    int count();
    
}
