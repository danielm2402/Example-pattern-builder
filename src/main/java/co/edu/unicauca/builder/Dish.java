package co.edu.unicauca.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Plato. Representa un Producto
 *
 * @author Libardo, Julio
 */
public class Dish {

    private String name;
    private String description;
    private String image;
    private int price;
    private EnumSize size;

    private List<Dish> parts;

    public Dish(String name, String description, String image, int price, EnumSize size) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
        this.size = size;
        this.parts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public EnumSize getSize() {
        return size;
    }

    public void setSize(EnumSize size) {
        this.size = size;
    }

    public List<Dish> getParts() {
        return parts;
    }

    public void setParts(List<Dish> parts) {
        this.parts = parts;
    }

    public void addPart(Dish dish) {
        parts.add(dish);
    }

    public int calculatePriceParts() {
        int total = 0;
        for (Dish dish : parts) {
            total += dish.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Dish{" + "name=" + name + ", description=" + description + ", price=" + price + ", size=" + size + "}";
    }

}
