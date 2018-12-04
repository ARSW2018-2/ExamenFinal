/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examplefinal;

import com.mycompany.examenfinal.imp.TemperatureChange;
import com.mycompany.examenfinal.rest.TemperatureAPIController;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author 2098325
 */
public class test {
    @Test
    public void firstTest(){
        try {
            //Grades to faranges
            double c1=20.1;
            double c2=25.9;
            double c3=40.7;

            TemperatureChange pr1=null;
            Assert.assertEquals(68.18,pr1.CentigradosToFarange(c1));
            Assert.assertEquals(78.62,pr1.CentigradosToFarange(c2));
            Assert.assertEquals(105.26,pr1.CentigradosToFarange(c3));
            
            
        } catch (Exception e) {
            
        }
    }
    @Test
    public void secondTest(){
        try {
            //Farange to Grades
            double f1=50.0;
            double f2=35.0;
            double f3=40.7;
            
            TemperatureChange pr2=null;
            Assert.assertEquals(10.0,pr2.FarangeToCentigrados(f1));
            Assert.assertEquals(1.66667,pr2.FarangeToCentigrados(f2));
            Assert.assertEquals(4.833,pr2.FarangeToCentigrados(f3));            
                
        } catch (Exception e) {
        }

    }
}
