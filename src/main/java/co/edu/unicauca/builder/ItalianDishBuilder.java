/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.builder;

/**
 *
 * @author daniel2402
 */
public class ItalianDishBuilder extends DishBuilder {
     @Override
    public void setCore() {
        this.setDish(new ItalianDish("Rissotto", "típica comida italiana está hecha a base de arroz y queso.", "", 45000, EnumSize.ALL, "East rice"));
    }

    @Override
    public void addParts() {
        this.getDish().addPart(new Dish("Mariscos", "", "", 20000, EnumSize.ALL));
        this.getDish().addPart(new Dish("Salsa boloñesa", "", "", 10000, EnumSize.HALF));

    }

    @Override
    public void setSize() {
        dish.setSize(EnumSize.ALL);
    }
    
}
