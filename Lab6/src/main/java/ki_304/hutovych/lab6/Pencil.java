package ki_304.hutovych.lab6;

/**
 * Клас, що представляє олівець.
 * Містить інформацію про тип, довжину та твердість олівця, а також реалізує методи порівняння та представлення.
 */
public class Pencil implements Comparable<Pencil> {
    private String type;
    private double length;
    private String hardness;

    /**
     * Конструктор класу Pencil.
     * @param type тип олівця
     * @param length довжина олівця
     * @param hardness твердість олівця
     */
    public Pencil(String type, double length, String hardness) {
        this.type = type;
        this.length = length;
        this.hardness = hardness;
    }

    /**
     * Перетворює об'єкт Pencil на рядок для зручного виведення.
     * @return рядок з інформацією про олівець
     */
    @Override
    public String toString() {
        return String.format("Олівець '%s': %.1f см, твердість %s", type, length, hardness);
    }

    /**
     * Порівнює поточний об'єкт Pencil з іншим за довжиною.
     * @param other інший об'єкт Pencil для порівняння
     * @return результат порівняння довжин
     */
    @Override
    public int compareTo(Pencil other) {
        return Double.compare(this.length, other.length);
    }
}