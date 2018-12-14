/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenfinal.rest;

import com.google.gson.Gson;
import com.mycompany.examenfinal.imp.TemperatureChange;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 2098325
 */

@RestController
@RequestMapping(value= "/temp")
public class TemperatureAPIController {
 
    @Autowired
    private TemperatureChange services;
    
    @RequestMapping(method = RequestMethod.GET, value="/gf/{tempa}")
    public ResponseEntity<?> gradesToFaraday(@PathVariable("tempa") @RequestBody double tempa){
        try{
            
            Gson gson = new Gson();
            String JSON= gson.toJson(services.CentigradosToFarange(tempa));
            return new ResponseEntity<>(JSON,HttpStatus.ACCEPTED);
        } catch (Exception e) {
            Logger.getLogger(TemperatureAPIController.class.getName()).log(Level.SEVERE, null, e);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping(method = RequestMethod.GET, value="/fg/{tempa}")
    public ResponseEntity<?> FaradayToGrades(@PathVariable("tempa")@RequestBody double tempa){
        try{
            Gson gson = new Gson();
            String JSON= gson.toJson(services.FarangeToCentigrados(tempa));
            return new ResponseEntity<>(JSON,HttpStatus.ACCEPTED);
        } catch (Exception e) {
            Logger.getLogger(TemperatureAPIController.class.getName()).log(Level.SEVERE, null, e);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }    
    
    
}
