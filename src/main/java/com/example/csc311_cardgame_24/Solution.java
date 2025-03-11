package com.example.csc311_cardgame_24;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Solution {

    private static final double TARGET = 24.0;
    private static final double EPSILON = 1e-6; // Precision for floating point comparison
    private static final String[] OPERATORS = {"+", "-", "*", "/"};

    public boolean checkSolution(String expression) {
        Expression exp = new ExpressionBuilder(expression).build();

        double result = exp.evaluate();

        return result == 24;

    }
    public String findSOlution(int a, int b, int c, int d) {


        int[][] permutations = {
                {a, b, c, d}, {a, b, d, c}, {a, c, b, d}, {a, c, d, b}, {a, d, b, c}, {a, d, c, b},
                {b, a, c, d}, {b, a, d, c}, {b, c, a, d}, {b, c, d, a}, {b, d, a, c}, {b, d, c, a},
                {c, a, b, d}, {c, a, d, b}, {c, b, a, d}, {c, b, d, a}, {c, d, a, b}, {c, d, b, a},
                {d, a, b, c}, {d, a, c, b}, {d, b, a, c}, {d, b, c, a}, {d, c, a, b}, {d, c, b, a}
        };

        // Iterate over all operator combinations
        for (String op1 : OPERATORS) {
            for (String op2 : OPERATORS) {
                for (String op3 : OPERATORS) {
                    // Check each permutation
                    for (int[] p : permutations) {
                        int n1 = p[0], n2 = p[1], n3 = p[2], n4 = p[3];
                        // Possible groupings with parentheses
                        String[] expressions = new String[] {
                                "((" + n1 + op1 + n2 + ")" + op2 + n3 + ")" + op3 + n4,
                                "(" + n1 + op1 + "(" + n2 + op2 + n3 + "))" + op3 + n4,
                                "(" + n1 + op1 + n2 + ")" + op2 + "(" + n3 + op3 + n4 + ")",
                                n1 + op1 + "((" + n2 + op2 + n3 + ")" + op3 + n4 + ")",
                                n1 + op1 + "(" + n2 + op2 + "(" + n3 + op3 + n4 + "))"
                        };

                        // Evaluate each expression
                        for (String expr : expressions) {
                            try {
                                Expression expression = new ExpressionBuilder(expr).build();
                                double result = expression.evaluate();
                                if (Math.abs(result - TARGET) < EPSILON) {
                                    return expr + " = 24";
                                }
                            } catch (Exception e) {
                                // Ignore invalid expressions (e.g., divide by zero)
                            }
                        }
                    }
                }
            }
        }

        return "No solution found";
    }

}
