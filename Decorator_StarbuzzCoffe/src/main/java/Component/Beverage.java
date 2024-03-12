/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Component;

/**
 *
 * @author salce
 */
public interface Beverage {
    String decorate();
    void setDescription(String description);
    String getDescription();
    void setCost(Double cost);
    Double getCost();
}