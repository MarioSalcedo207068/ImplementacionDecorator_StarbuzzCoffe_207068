/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

import Component.Beverage;

/**
 *
 * @author salce
 */
public class Decorator_Soy extends Decorator {
    
    public Decorator_Soy(Beverage beverage,String decoratorName,int amount,Double extraCost) {
        super(beverage,decoratorName,amount,extraCost);
    };
    
    @Override
    public String decorate() {
        beverage.setDescription(decorateDescription());
        beverage.setCost(decorateCost());
        return beverage.decorate();        
    };
    
    public String decorateDescription() {
        String previousDescription = beverage.getDescription();
        return previousDescription+". Extra de "+this.decoratorName+", cantidad = "+this.amount;
    };
    
    public Double decorateCost() {
        Double previousCost = beverage.getCost();
        return previousCost + totalExtraCharge();
    };
}