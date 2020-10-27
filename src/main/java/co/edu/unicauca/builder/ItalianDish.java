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
public class ItalianDish extends Dish {
       private String italianlName;

    public ItalianDish(String name, String description, String image, int price, EnumSize size, String italianName) {
        super(name, description, image, price, size);
        this.italianlName = italianName;
    }

    public String getOrientalName() {
        return italianlName;
    }

    public void setOrientalName(String italianName) {
        this.italianlName = italianName;
    }
    
}
