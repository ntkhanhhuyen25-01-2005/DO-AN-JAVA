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
public class FullTimeEmployee extends Employee {

    String name;
    int paymentPerHour;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name,paymentPerHour);
        this.name = name;
        
        this.paymentPerHour = paymentPerHour;
    }

    public int calculateSalary() {
        return 8 * getPaymentPerHour();

    

   
}
}