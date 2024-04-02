package Src.ex2;

import java.io.*;

/**
 * Клас для демонстрації збереження та відновлення стану об'єкта з використанням серіалізації.
 */
public class SerializationDemo {
    /**
     * Метод для збереження об'єкта у файл.
     * @param obj об'єкт для збереження
     * @param filename назва файлу, у який буде збережено об'єкт
     * @throws IOException виняток у випадку помилки вводу-виводу
     */
    public static void saveObjectToFile(CalculationResult obj, String filename) throws IOException {
        FileOutputStream fileOut = new FileOutputStream(filename);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(obj);
        out.close();
        fileOut.close();
        System.out.println("Object saved successfully to " + filename);
    }

    /**
     * Метод для відновлення об'єкта з файлу.
     * @param filename назва файлу, з якого буде відновлено об'єкт
     * @return відновлений об'єкт типу CalculationResult
     * @throws IOException виняток у випадку помилки вводу-виводу
     * @throws ClassNotFoundException виняток у випадку, якщо клас не знайдено
     */
    public static CalculationResult readObjectFromFile(String filename) throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream(filename);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        CalculationResult obj = (CalculationResult) in.readObject();
        in.close();
        fileIn.close();
        System.out.println("Object read successfully from " + filename);
        return obj;
    }
}
