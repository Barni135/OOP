package Src;

import java.util.Arrays;

/**
 * Клас, що представляє об'єкт для зберігання параметрів і результатів обчислень.
 */
public class Calculation {
    private double[] parameters;
    private double result;

    /**
     * Конструктор класу CalculationData.
     * @param parameters масив параметрів
     * @param result результат обчислення
     */
    public Calculation(double[] parameters, double result) {
        this.parameters = parameters;
        this.result = result;
    }

    /**
     * Отримати параметри.
     * @return масив параметрів
     */
    public double[] getParameters() {
        return parameters;
    }

    /**
     * Отримати результат обчислення.
     * @return результат обчислення
     */
    public double getResult() {
        return result;
    }

    /**
     * Головний метод, в якому ви можете тестувати клас CalculationData.
     * @param args аргументи командного рядка (не використовуються в цьому прикладі)
     */
    public static void main(String[] args) {
        // Приклад використання класу CalculationData
        double[] parameters = {1.0, 2.0, 3.0};
        double result = 100.0;

        // Створення об'єкту CalculationData
        Calculation data = new Calculation(parameters, result);

        // Виведення параметрів та результату обчислення
        System.out.println("Parameters: " + Arrays.toString(data.getParameters()));
        System.out.println("Result: " + data.getResult());
    }
}
