package Src.ex2.test;

import java.io.IOException;

import Src.ex2.CalculationResult;
import Src.ex2.ProblemSolver;
import Src.ex2.SerializationDemo;

/**
 * Клас для тестування коректності результатів обчислень та серіалізації/десеріалізації.
 */
public class Test {
    public static void main(String[] args) {
        ProblemSolver solver = new ProblemSolver();
        CalculationResult result = solver.solveProblem(10.0, 20.0);
        result.displayResult();

        try {
            SerializationDemo.saveObjectToFile(result, "result.ser");
            CalculationResult deserializedResult = SerializationDemo.readObjectFromFile("result.ser");
            deserializedResult.displayResult();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}