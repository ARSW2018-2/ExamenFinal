/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenfinal.imp;

import com.mycompany.examenfinal.model.Temperature;
import com.mycompany.examenfinal.service.ChangeTemperature;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2098325
 */
@Service
public class TemperatureChange implements ChangeTemperature {

    Temperature t;
    
    @Override
    public Temperature CentigradosToFarange(double centir) {
        Double f=(centir*(1.8));
        f=f+32;
        t=new Temperature(f,"Farange");
        return t;
        
    }

    @Override
    public Temperature FarangeToCentigrados(double farange) {
        Double c=farange-32;        
        c=c*(5);
        c=c/9;
        t=new Temperature(c,"Farange");
        return t;
        
    }
    
}
