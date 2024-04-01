package Src;

/**
 * Клас для обчислення кінетичної енергії фізичного тіла.
 */
public class KineticEnergyCalculator {

    /**
     * Метод для обчислення кінетичної енергії фізичного тіла.
     * 
     * @param mass     маса фізичного тіла (в кг)
     * @param velocity швидкість фізичного тіла (в м/с)
     * @return значення кінетичної енергії (в джоулях)
     */
    public static double calculateKineticEnergy(double mass, double velocity) {
        return 0.5 * mass * velocity * velocity;
    }

    /**
     * Метод main, який є точкою входу у програму.
     * 
     * @param args аргументи командного рядка (не використовуються в цьому випадку)
     */
    public static void main(String[] args) {
        // Приклади обчислення кінетичної енергії для різних значень маси та швидкості
        double mass1 = 10; // маса 10 кг
        double velocity1 = 5; // швидкість 5 м/с
        double kineticEnergy1 = calculateKineticEnergy(mass1, velocity1);
        System.out.println("Кінетична енергія для маси " + mass1 + " кг та швидкості " + velocity1 + " м/с: " + kineticEnergy1 + " Дж");

        double mass2 = 20; // маса 20 кг
        double velocity2 = 10; // швидкість 10 м/с
        double kineticEnergy2 = calculateKineticEnergy(mass2, velocity2);
        System.out.println("Кінетична енергія для маси " + mass2 + " кг та швидкості " + velocity2 + " м/с: " + kineticEnergy2 + " Дж");
    }
}
