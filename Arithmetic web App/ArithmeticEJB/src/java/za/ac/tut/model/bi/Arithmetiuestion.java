/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.bi;

import java.util.Random;
import javax.ejb.Stateless;

/**
 *
 * @author User
 */
@Stateless
public class Arithmetiuestion implements ArithmetiuestionLocal {

    @Override
    public int generateNumber() {
        Random rand = new Random();
        int number = 1+rand.nextInt(9);
        return number;
    }

    @Override
    public int sum(Integer num1, Integer num2) {
        return (num1+num2);
    }

    @Override
    public String generateQuestion(Integer num2, Integer num1) {
        String question ="";
        
        question = num1+"+"+num2+"= ?";
        
        return question;
    }

    @Override
    public String outcome(Integer answer, Integer sum)throws NumberRangeException{
        String outcome="Wrong Answer";
        
        if(answer >=2 && answer <=20){
            if(answer == sum){
                outcome ="Correct Answer";
            }
        }else
        {
            throw new NumberRangeException(answer +" is invalid enter an answer greater that 2 and less than 20");
        }
        return outcome;
    }

    @Override
    public boolean isValid(Integer answer) {
       boolean valid =false;
       if(answer >=2 && answer <= 20){
            valid =true;
        }
       return valid;
    }
    
    
    
}
