package Src.ex2;

import java.io.Serializable;

/**
 * Клас, що представляє об'єкт з параметрами та результатами обчислень.
 * Цей клас може бути серіалізований.
 */
public class CalculationResult implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private double mass;
    private double velocity;
    private transient double kineticEnergy; // Поле, яке не буде серіалізовано

    /**
     * Конструктор класу CalculationResult.
     * @param mass маса фізичного тіла
     * @param velocity швидкість фізичного тіла
     */
    public CalculationResult(double mass, double velocity) {
        this.mass = mass;
        this.velocity = velocity;
        this.kineticEnergy = 0.5 * mass * velocity * velocity;
    }

    /**
     * Метод для виведення результатів обчислень.
     */
    public void displayResult() {
        System.out.println("Mass: " + mass);
        System.out.println("Velocity: " + velocity);
        System.out.println("Kinetic Energy: " + kineticEnergy);
    }
}
