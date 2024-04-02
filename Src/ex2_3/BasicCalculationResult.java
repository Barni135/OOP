package Src.ex2_3;

/**
 * Конкретна реалізація CalculationResult, що представляє певний тип результату.
 */
public class BasicCalculationResult extends CalculationResult {
    /**
     * Конструктор для створення об'єкта BasicCalculationResult з вказаною масою та швидкістю.
     *
     * @param mass     маса об'єкта
     * @param velocity швидкість об'єкта
     */
    public BasicCalculationResult(double mass, double velocity) {
        super(mass, velocity);
    }

    /**
     * Відображає результат обчислень у текстовому вигляді.
     */
    @Override
    public void displayResult() {
        System.out.println("Базовий результат обчислень:");
        System.out.println("Маса: " + mass);
        System.out.println("Швидкість: " + velocity);
        System.out.println("Кінетична енергія: " + kineticEnergy);
    }
}
