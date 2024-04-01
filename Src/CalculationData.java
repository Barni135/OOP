package Src;

import java.io.Serializable;

/**
 * Клас, що представляє об'єкт для зберігання параметрів і результатів обчислень.
 */
class CalculationData implements Serializable {
    private double[] parameters;
    private double result;

    /**
     * Конструктор класу CalculationData.
     * @param parameters масив параметрів
     * @param result результат обчислення
     */
    public CalculationData(double[] parameters, double result) {
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
}


