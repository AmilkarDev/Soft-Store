/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import javax.ejb.Local;
import models.Besoin;

/**
 *
 * @author LENOVO
 */
@Local
public interface BesoinFacadeLocal {

    void create(Besoin besoin);

    void edit(Besoin besoin);

    void remove(Besoin besoin);

    Besoin find(Object id);

    List<Besoin> findAll();

    List<Besoin> findRange(int[] range);

    int count();
    
}
