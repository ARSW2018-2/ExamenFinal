/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenfinal.imp;

import com.mycompany.examenfinal.service.ChangeTemperature;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2098325
 */
@Service
public class TemperatureChange implements ChangeTemperature {

    @Override
    public Double CentigradosToFarange(double centir) {
        Double f=(centir*(9/5))+32;
        
        return f;
        
    }

    @Override
    public Double FarangeToCentigrados(double farange) {
        Double c=(farange-32)*(9/5);
        return c;
        
    }
    
}
