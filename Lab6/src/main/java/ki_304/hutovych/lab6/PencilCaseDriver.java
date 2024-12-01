package ki_304.hutovych.lab6;

/**
 * Клас-драйвер для тестування функціональності класу PencilCase.
 * Тестує додавання, пошук мінімального елемента, видалення елементів та перевірку наявності у пеналі для олівців та ручок.
 * @version 1.0
 */
public class PencilCaseDriver {

    /**
     * Головний метод для запуску тестування функцій класу PencilCase.
     * @param args аргументи командного рядка
     */
    public static void main(String[] args) {
        // Тестування з олівцями
        PencilCase<Pencil> pencilCase = new PencilCase<>();
        pencilCase.addItem(new Pencil("Графітний", 12.5, "2B"));
        pencilCase.addItem(new Pencil("Механічний", 14.0, "HB"));
        pencilCase.addItem(new Pencil("Кольоровий", 10.0, "B"));

        System.out.println("=== Тест пеналу з олівцями ===");
        pencilCase.displayContents();

        Pencil minPencil = pencilCase.findMin();
        System.out.println("\nОлівець з найменшою довжиною: " + minPencil);

        // Тестування з ручками
        PencilCase<Pen> penCase = new PencilCase<>();
        penCase.addItem(new Pen("Parker", 250.0, "Синій"));
        penCase.addItem(new Pen("BIC", 15.0, "Чорний"));
        penCase.addItem(new Pen("Pilot", 85.0, "Червоний"));

        System.out.println("\n=== Тест пеналу з ручками ===");
        penCase.displayContents();

        Pen minPen = penCase.findMin();
        System.out.println("\nРучка з найменшою ціною: " + minPen);

        // Демонстрація видалення та пошуку
        System.out.println("\nВидаляємо елемент з пеналу ручок:");
        Pen removedPen = penCase.removeItem(1);
        System.out.println("Видалено: " + removedPen);
        penCase.displayContents();

        // Перевірка наявності елемента
        Pen testPen = new Pen("Parker", 250.0, "Синій");
        System.out.println("\nПеревірка наявності ручки 'Parker': " +
                penCase.contains(testPen));
    }
}