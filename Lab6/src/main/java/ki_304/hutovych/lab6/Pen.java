package ki_304.hutovych.lab6;

/**
 * Клас, що представляє ручку.
 * Містить інформацію про марку, ціну та колір ручки, а також реалізує методи порівняння та представлення.
 */
public class Pen implements Comparable<Pen> {
    private String brand;
    private double price;
    private String color;

    /**
     * Конструктор класу Pen.
     * @param brand марка ручки
     * @param price ціна ручки
     * @param color колір ручки
     */
    public Pen(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    /**
     * Перетворює об'єкт Pen на рядок для зручного виведення.
     * @return рядок з інформацією про ручку
     */
    @Override
    public String toString() {
        return String.format("Ручка '%s': %.2f грн, колір %s", brand, price, color);
    }

    /**
     * Порівнює поточний об'єкт Pen з іншим за ціною.
     * @param other інший об'єкт Pen для порівняння
     * @return результат порівняння цін
     */
    @Override
    public int compareTo(Pen other) {
        return Double.compare(this.price, other.price);
    }
}