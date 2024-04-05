/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.bi;

import javax.ejb.EJBException;

/**
 *
 * @author User
 */
public class NumberRangeException extends EJBException{

    public NumberRangeException(String message) {
        super(message);
    }
    
}
