/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.bi;

import javax.ejb.Local;

/**
 *
 * @author User
 */
@Local
public interface ArithmetiuestionLocal {

    int generateNumber();

    int sum(Integer num1, Integer num2);

    String generateQuestion(Integer num2, Integer num1);

    String outcome(Integer answer, Integer sum)throws NumberRangeException;

    boolean isValid(Integer answer);
    
}
