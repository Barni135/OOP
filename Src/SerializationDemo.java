package Src;

import java.io.*;

/**
 * Клас для демонстрації серіалізації та десеріалізації об'єктів.
 */
class DemoObject implements Serializable {
    private String name;
    private transient int age; // Поля зі словом transient не серіалізуються

    /**
     * Конструктор класу DemoObject.
     * @param name ім'я об'єкта
     * @param age вік об'єкта
     */
    public DemoObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Метод для отримання імені об'єкта.
     * @return ім'я об'єкта
     */
    public String getName() {
        return name;
    }

    /**
     * Метод для отримання віку об'єкта.
     * @return вік об'єкта
     */
    public int getAge() {
        return age;
    }

    /**
     * Метод для відображення стану об'єкта.
     */
    public void displayState() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

/**
 * Клас для демонстрації серіалізації та десеріалізації об'єктів.
 */
public class SerializationDemo {
    /**
     * Точка входу в програму.
     * @param args аргументи командного рядка (не використовуються в цьому випадку)
     */
    public static void main(String[] args) {
        // Створення об'єкта для серіалізації
        DemoObject obj = new DemoObject("John", 30);

        // Шлях до файлу для збереження серіалізованого об'єкта
        String fileName = "demoObject.ser";

        // Серіалізація об'єкта
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(obj);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Відновлення стану об'єкта після серіалізації
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            DemoObject restoredObj = (DemoObject) inputStream.readObject();
            System.out.println("Object deserialized successfully.");
            restoredObj.displayState(); // Виведення відновленого стану об'єкта
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
