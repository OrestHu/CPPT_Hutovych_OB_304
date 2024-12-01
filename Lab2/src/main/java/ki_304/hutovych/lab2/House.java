package ki_304.hutovych.lab2;

import java.io.IOException;

/**
 * Клас House реалізує предметну область "Будинок" і містить методи для управління його складовими частинами.
 * Лабораторна робота №2.
 * Клас дозволяє працювати з дахом, дверима і вікнами будинку, а також веде лог діяльності.
 */
public class House {
    private Roof roof;
    private Door door;
    private Window window;
    private Logger logger;

    /**
     * Конструктор за замовчуванням, що створює будинок з типовими параметрами.
     *
     * @throws IOException якщо виникає помилка під час створення або роботи з лог-файлом.
     */
    public House() throws IOException {
        this(new Roof("Черепиця", "Червоний"),
                new Door("Розсувна", "Просте", false),
                new Window("Арочний", false)
        );
        this.logger = new Logger("house_log.txt");

        logger.log(String.format("Будинок %s сторено.", this.toString()));
    }

    /**
     * Конструктор з параметрами для створення будинку з конкретними складовими частинами.
     *
     * @param roof   об'єкт типу Roof, що описує дах будинку.
     * @param door   об'єкт типу Door, що описує двері будинку.
     * @param window об'єкт типу Window, що описує вікна будинку.
     * @throws IOException якщо виникає помилка під час створення або роботи з лог-файлом.
     */
    public House (Roof roof, Door door, Window window) throws IOException {
        this.roof = roof;
        this.door = door;
        this.window = window;
        this.logger = new Logger("house_log.txt");

        logger.log(String.format("Будинок %s сторено.", this.toString()));
    }

    /**
     * Метод для відкриття вікна.
     *
     * @throws IOException якщо виникає помилка під час запису у лог-файл.
     */
    public void openWindow() throws IOException {
        window.open();

        logger.log("Вікно відкрите.");
    }

    /**
     * Метод для закриття вікна.
     *
     * @throws IOException якщо виникає помилка під час запису у лог-файл.
     */
    public void closeWindow() throws IOException{
        window.close();

        logger.log("Вікно закрите.");
    }

    /**
     * Метод для відкриття дверей.
     *
     * @throws IOException якщо виникає помилка під час запису у лог-файл.
     */
    public void openDoor() throws IOException{
        door.open();

        logger.log("Двері відкриті.");
    }

    /**
     * Метод для закриття дверей.
     *
     * @throws IOException якщо виникає помилка під час запису у лог-файл.
     */
    public void closeDoor() throws IOException{
        door.close();

        logger.log("Двері закриті.");
    }

    /**
     * Метод для зміни типу скла дверей.
     *
     * @param glassType новий тип скла для дверей.
     * @throws IOException якщо виникає помилка під час запису у лог-файл.
     */
    public void changeDoorGlass(String glassType) throws IOException {
        door.setGlassType(glassType);

        logger.log(String.format("Стікло було змінено на %s", glassType));
    }

    /**
     * Метод для зміни типу вікна.
     *
     * @param windowType новий тип вікна.
     * @throws IOException якщо виникає помилка під час запису у лог-файл.
     */
    public void changeWindowType(String windowType) throws IOException {
        window.setType(windowType);

        logger.log(String.format("Тип вікна було змінено на %s", windowType));
    }

    /**
     * Метод для перефарбування даху.
     *
     * @param color новий колір даху.
     * @throws IOException якщо виникає помилка під час запису у лог-файл.
     */
    public void repaintRoof(String color) throws IOException {
        roof.setColor(color);

        logger.log(String.format("Дах було перемальовано в %s колір.", color));
    }

    /**
     * Метод для ремонту даху з новим матеріалом і кольором.
     *
     * @param material новий матеріал даху.
     * @param color    новий колір даху.
     * @throws IOException якщо виникає помилка під час запису у лог-файл.
     */
    public void repairRoof(String material, String color) throws IOException {
        roof.setMaterial(material);
        roof.setColor(color);

        logger.log("Дах було полагоджено");
    }

    /**
     * Метод для заміни даху з новим матеріалом і кольором.
     *
     * @param material новий матеріал даху.
     * @param color    новий колір даху.
     * @throws IOException якщо виникає помилка під час запису у лог-файл.
     */
    public void replaceRoof(String material, String color) throws IOException {
        roof = new Roof(material, color);

        logger.log(String.format("Дах було змінено. Новий матеріал %s та колір %s", material, color));
    }

    /**
     * Метод для огляду будинку, що повертає інформацію про стан його складових частин.
     *
     * @throws IOException якщо виникає помилка під час запису у лог-файл.
     */
    public void inspectHouse() throws IOException {
        var inspectionReport = String.format("Огляд будинку: \n Дах - %s \n Двері - %s \n Вікна: - %s", roof.toString(), door.toString(), window.toString());

        logger.log(String.format("Відбувся %s", inspectionReport));
    }

    /**
     * Повертає об'єкт типу Roof (дах будинку).
     *
     * @return об'єкт типу Roof.
     */
    public Roof getRoof() {
        return roof;
    }

    /**
     * Повертає об'єкт типу Window (вікно будинку).
     *
     * @return об'єкт типу Window.
     */
    public Window getWindow() {
        return window;
    }

    /**
     * Повертає об'єкт типу Door (двері будинку).
     *
     * @return об'єкт типу Door.
     */
    public Door getDoor() {
        return door;
    }

    /**
     * Встановлює новий об'єкт типу Roof.
     *
     * @param roof новий об'єкт даху.
     */
    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    /**
     * Встановлює новий об'єкт типу Door.
     *
     * @param door новий об'єкт дверей.
     */
    public void setDoor(Door door) {
        this.door = door;
    }

    /**
     * Встановлює новий об'єкт типу Window.
     *
     * @param window новий об'єкт вікон.
     */
    public void setWindow(Window window) {
        this.window = window;
    }

    /**
     * Метод для коректного закриття логера.
     *
     * @throws IOException якщо виникає помилка під час закриття лог-файлу.
     */
    public void closeLogger() throws IOException {
        logger.close();
    }

    /**
     * Метод для виведення інформації про будинок у форматі рядка.
     *
     * @return рядок, що представляє об'єкт будинку.
     */
    @Override
    public String toString() {
        return "House{" +
                "roof=" + roof +
                ", door=" + door +
                ", window=" + window +
                ", logger=" + logger +
                '}';
    }
}
