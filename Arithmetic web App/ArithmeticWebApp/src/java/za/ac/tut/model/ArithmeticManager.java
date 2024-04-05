/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model;

/**
 *
 * @author Student
 */
public class ArithmeticManager implements ArithmeticManagerInterface {

    @Override
    public int add(int num1, int num2) {
        int sum;
        
        sum = num1 + num2;
        
        return sum;
    }

    @Override
    public int multiply(int num1, int num2) {
        int product;
        
        product = num1 * num2;
        
        return product;
    }
    
}
