/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iemployee;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class PartTimeEmployees extends Employee {

    private int workingHours;

    public PartTimeEmployees(int workingHours, String name, int paymentPerHour) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

   
    
    public int calculateSalary() {
        return workingHours * getPaymentPerHour();

    }

}
