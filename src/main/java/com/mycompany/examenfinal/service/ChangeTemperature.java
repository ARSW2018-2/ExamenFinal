/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenfinal.service;

import com.mycompany.examenfinal.model.Temperature;

/**
 *
 * @author 2098325
 */
public interface ChangeTemperature {
    
    public Temperature CentigradosToFarange(double centir);
    public Temperature FarangeToCentigrados(double farange);
    
}
