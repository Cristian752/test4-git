/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.denkitronik.sistema.backend.api.model.services;

import com.denkitronik.sistema.backend.api.model.entities.Pais;
import java.util.List;

/**
 *
 * @author Cristian Toro
 */
public interface IPaisService {
    List<Pais> finAll();
}


