package co.edu.unicauca.builder;

/**
 * Builder concreto
 *
 * @author Libardo, Julio
 */
public class OrientalDishBuilder extends DishBuilder {

    @Override
    public void setCore() {
        this.setDish(new OrientalDish("Arroz oriental", "Arroz con estilo oriental, añadiendo ingredientes con sabores orientales como la soja, las verduras y las gambas", "", 56000, EnumSize.ALL, "East rice"));
    }

    @Override
    public void addParts() {
        this.getDish().addPart(new Dish("torta piña", "Torta de piña como entrada", "", 3000, EnumSize.ALL));
        this.getDish().addPart(new Dish("Coffee", "Cafe oriental", "", 5000, EnumSize.HALF));

    }

    @Override
    public void setSize() {
        dish.setSize(EnumSize.ALL);
    }

}
