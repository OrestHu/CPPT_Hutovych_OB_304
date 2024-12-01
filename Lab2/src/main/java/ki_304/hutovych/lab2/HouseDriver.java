package ki_304.hutovych.lab2;

import java.io.IOException;

/**
 * Клас HouseDriver є драйвером для демонстрації роботи класу House.
 * Виконує основні операції з будинком, такі як відкриття/закриття вікон і дверей,
 * зміна характеристик даху, огляд будинку тощо.
 */
public class HouseDriver {

    /**
     * Метод main є точкою входу в програму. Він демонструє основну функціональність класу House.
     *
     * @param args аргументи командного рядка (не використовуються).
     */
    public static void main(String[] args) {
        try {
            // Створення об'єкта будинку з початковими значеннями.
            var house = new House();

            // Виконання дій з будинком.
            house.openWindow();
            house.closeWindow();
            house.openDoor();
            house.closeDoor();
            house.changeDoorGlass("З візерунками");
            house.changeWindowType("Квадратний");
            house.repaintRoof("Зелений");
            house.repairRoof("Черепиця", "Зелена");
            house.replaceRoof("Полікарбонат", "Червоний");
            house.inspectHouse();

            // Закриття логера для коректного завершення роботи з файлом.
            house.closeLogger();
        } catch (IOException e) {
            // Обробка помилок, що виникають під час запису в файл.
            throw new RuntimeException("Сталася помилка при записі в файл: " + e.getMessage());
        }
    }
}