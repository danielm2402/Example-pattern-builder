package co.edu.unicauca.builder;

/**
 * Ciente main
 *
 * @author Libardo, Julio
 */
public class ClientMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DishDirector director = new DishDirector();
        DishBuilder orientalBuilder = new OrientalDishBuilder();
        director.setDishBuilder(orientalBuilder);
        director.buildDish();
        
        Dish dish = director.getDish();
        System.out.println("Oriental dish:" + dish);
        System.out.println("Sus partes: " + dish.getParts().toString());
        System.out.println("Precio de las partes: " + dish.calculatePriceParts());
        
        
        DishDirector director_ = new DishDirector();
        DishBuilder italianBuilder = new ItalianDishBuilder();
        director_.setDishBuilder(italianBuilder);
        director_.buildDish();
        
        Dish dish_ = director_.getDish();
        System.out.println("Italian dish:" + dish_);
        System.out.println("Sus partes: " + dish_.getParts().toString());
        System.out.println("Precio de las partes: " + dish_.calculatePriceParts());

    }

}
