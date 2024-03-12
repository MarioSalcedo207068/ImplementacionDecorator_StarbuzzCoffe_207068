/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Component;

/**
 *
 * @author salce
 */
public class Beverage_DarkRoast implements Beverage {
    String name;
    String description;
    Double cost;
    
    public Beverage_DarkRoast(String name, String description, Double cost){
        this.name = name;
        this.description = description;
        this.cost = cost; 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public Double getCost() {
        return cost;
    }

    @Override
    public void setCost(Double cost) {
        this.cost = cost;
    }
    
    @Override
    public String decorate() {
        return this.toString();
    }
    
    @Override
    public String toString(){
        return "Café de "+this.name+". Tipo de café: "+this.description+". Precio:"+this.cost;
    }
}