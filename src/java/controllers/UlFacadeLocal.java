/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import javax.ejb.Local;
import models.Ul;

/**
 *
 * @author LENOVO
 */
@Local
public interface UlFacadeLocal {

    void create(Ul ul);

    void edit(Ul ul);

    void remove(Ul ul);

    Ul find(Object id);

    List<Ul> findAll();

    List<Ul> findRange(int[] range);

    int count();
    
}
