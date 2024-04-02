package Src.ex2;

/**
 * Клас для знаходження рішення задачі з використанням агрегування.
 */
public class ProblemSolver {
    /**
     * Метод, що розв'язує задачу.
     * @param mass маса фізичного тіла
     * @param velocity швидкість фізичного тіла
     * @return об'єкт типу CalculationResult з результатами обчислень
     */
    public CalculationResult solveProblem(double mass, double velocity) {
        return new CalculationResult(mass, velocity);
    }
}
