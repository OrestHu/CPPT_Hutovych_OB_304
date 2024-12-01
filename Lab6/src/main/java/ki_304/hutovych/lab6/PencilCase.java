package ki_304.hutovych.lab6;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Параметризований клас, що реалізує контейнер-пенал.
 * Зберігає елементи заданого типу та забезпечує додавання, видалення, пошук мінімального елемента, перевірку наявності,
 * отримання розміру та виведення вмісту.
 * @param <T> тип елементів, які зберігаються в пеналі (має реалізовувати Comparable)
 */
public class PencilCase<T extends Comparable<T>> {
    private ArrayList<T> items;

    /**
     * Конструктор класу PencilCase.
     */
    public PencilCase() {
        items = new ArrayList<>();
    }

    /**
     * Додає елемент до пеналу.
     * @param item елемент для додавання
     */
    public void addItem(T item) {
        items.add(item);
    }

    /**
     * Виймає елемент з пеналу за індексом.
     * @param index індекс елемента
     * @return видалений елемент
     * @throws IndexOutOfBoundsException якщо індекс невірний
     */
    public T removeItem(int index) {
        return items.remove(index);
    }

    /**
     * Знаходить мінімальний елемент у пеналі.
     * @return мінімальний елемент або null, якщо пенал пустий
     */
    public T findMin() {
        if (items.isEmpty()) {
            return null;
        }
        return Collections.min(items);
    }

    /**
     * Перевіряє, чи є елемент у пеналі.
     * @param item елемент для пошуку
     * @return true, якщо елемент знайдено, false інакше
     */
    public boolean contains(T item) {
        return items.contains(item);
    }

    /**
     * Повертає розмір пеналу.
     * @return кількість елементів у пеналі
     */
    public int size() {
        return items.size();
    }

    /**
     * Виводить вміст пеналу.
     */
    public void displayContents() {
        System.out.println("Вміст пеналу:");
        for (T item : items) {
            System.out.println(item);
        }
    }
}