package co.edu.unicauca.builder;

/**
 * Clase abstracta que representa el builder
 *
 * @author Libardo, Julio
 */
public abstract class DishBuilder {

    protected Dish dish;

    public abstract void setCore();

    public abstract void addParts();

    public abstract void setSize();

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }
    
    

}
