/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import javax.ejb.Local;
import models.Ub;

/**
 *
 * @author LENOVO
 */
@Local
public interface UbFacadeLocal {

    void create(Ub ub);

    void edit(Ub ub);

    void remove(Ub ub);

    Ub find(Object id);

    List<Ub> findAll();

    List<Ub> findRange(int[] range);

    int count();
    
}
