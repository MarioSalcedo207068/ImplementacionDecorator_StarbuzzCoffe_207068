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
public class Decorator implements Beverage {
    public Beverage beverage;
    public String decoratorName;
    public int amount;
    public Double extraCost;
    
    public Decorator(Beverage beverage,String decoratorName,int amount,Double extraCost) {
        this.decoratorName = decoratorName;
        this.amount = amount;
        this.extraCost = extraCost;
        this.beverage = beverage;
    }
        
    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }
    
    public Double totalExtraCharge() {
        return this.extraCost * this.amount;
    }

    @Override
    public String decorate() {
        return beverage.decorate();
    }

    @Override
    public void setDescription(String description) {
        beverage.setDescription(description);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public void setCost(Double cost) {
        beverage.setCost(cost);
    }

    @Override
    public Double getCost() {
        return beverage.getCost();
    }
}