package co.edu.unicauca.builder;

/**
 * Producto oriental que usa herencia
 *
 * @author Libardo, Julio
 */
public class OrientalDish extends Dish {

    private String orientalName;

    public OrientalDish(String name, String description, String image, int price, EnumSize size, String orientalName) {
        super(name, description, image, price, size);
        this.orientalName = orientalName;
    }

    public String getOrientalName() {
        return orientalName;
    }

    public void setOrientalName(String orientalName) {
        this.orientalName = orientalName;
    }

}
