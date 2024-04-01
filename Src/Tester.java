package Src;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/**
 * Клас для тестування коректності результатів обчислень та серіалізації/десеріалізації.
 */
public class Tester {
    public static void main(String[] args) {
        // Приклад для тестування
        double[] parameters = {1.5, 2.5, 3.5};
        double result = 14.5;
        CalculationData data = new CalculationData(parameters, result);

        // Тестування серіалізації та десеріалізації
        boolean serializationTestResult = testSerialization(data);
        if (serializationTestResult) {
            System.out.println("Serialization test passed.");
        } else {
            System.out.println("Serialization test failed.");
        }

        // Приклад тестування результатів обчислень
        double expectedResult = 14.500001; // Невелике відхилення для тестування
        boolean calculationTestResult = testCalculationResults(result, expectedResult);
        if (calculationTestResult) {
            System.out.println("Calculation results test passed.");
        } else {
            System.out.println("Calculation results test failed.");
        }
    }

    /**
     * Метод для тестування серіалізації та десеріалізації.
     * @param data об'єкт, який буде серіалізований та відновлений
     * @return true, якщо тест пройшов успішно, false - в іншому випадку
     */
    public static boolean testSerialization(CalculationData data) {
    try {
        // Серіалізація
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(data);
        objectOutputStream.close();

        // Десеріалізація
        ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        CalculationData restoredData = (CalculationData) objectInputStream.readObject();
        objectInputStream.close();

        // Порівняння параметрів та результату
        return Arrays.equals(data.getParameters(), restoredData.getParameters()) &&
               Double.compare(data.getResult(), restoredData.getResult()) == 0;
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
        return false;
    }
}
    /**
     * Метод для тестування результатів обчислень.
     * @param result1 перший результат
     * @param result2 другий результат
     * @return true, якщо результати приблизно однакові, false - в іншому випадку
     */
    public static boolean testCalculationResults(double result1, double result2) {
        double epsilon = 0.00001; // Епсилон для порівняння результатів
        return Math.abs(result1 - result2) < epsilon;
    }
}