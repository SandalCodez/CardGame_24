package com.example.csc311_cardgame_24;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

//import com.google.common.collect.Collections2;
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.List;

public class Solution {
    public boolean checkSolution(String expression) {

        Expression exp = new ExpressionBuilder(expression).build();

        double result = exp.evaluate();
        return result == 24;
//        List<Integer> numbers = Arrays.asList(1, 4, 12, 3);
//        Collection<List<Integer>> permutations = Collections2.permutations(numbers);
//
//        for (List<Integer> perm : permutations) {
//            System.out.println(perm);
//        }
    }

}
