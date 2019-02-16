/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import javax.ejb.Local;
import models.Bl;

/**
 *
 * @author LENOVO
 */
@Local
public interface BlFacadeLocal {

    void create(Bl bl);

    void edit(Bl bl);

    void remove(Bl bl);

    Bl find(Object id);

    List<Bl> findAll();

    List<Bl> findRange(int[] range);

    int count();
    
}
