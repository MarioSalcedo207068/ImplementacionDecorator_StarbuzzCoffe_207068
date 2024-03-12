/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.decorator_starbuzzcoffe;

import Component.Beverage_Expresso;
import Decorator.Decorator_WhippedCream;

/**
 *
 * @author salce
 */
public class Decorator_StarbuzzCoffe {

    public static void main(String[] args) {
        Beverage_Expresso beverage = new Beverage_Expresso("Mario Alejandro","Expresso",15.98);
        Decorator_WhippedCream dc = new Decorator_WhippedCream(beverage,"Chocolate",15,0.98);
        System.out.println(dc.decorate());
        
        Decorator_WhippedCream ds = new Decorator_WhippedCream(beverage,"Chocolate",5,2.9);
        System.out.println(ds.decorate());
    }
}
