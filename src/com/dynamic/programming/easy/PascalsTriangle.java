package com.dynamic.programming.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/*
You are given an integer numRows.
Return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it and the first and last number on each row must be equal to 1, as shown below:

 Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Example 2:

Input: numRows = 1
Output: [[1]]
 */

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            List<Integer> currentRow = new ArrayList<>();

            for (int col = 0; col <= row; col++) {

                // First and last elements are always 1
                if (col == 0 || col == row) {
                    currentRow.add(1);
                } else {
                    //Since we are using prvious row, it comes under memoization
                    List<Integer> previousRow = triangle.get(row - 1);

                    currentRow.add(
                            previousRow.get(col - 1) +
                                    previousRow.get(col)
                    );
                }
            }

            triangle.add(currentRow);
        }

        return triangle;
    }

    public static void main(String[] args) {
        PascalsTriangle pt = new PascalsTriangle();

        List<List<Integer>> result = pt.generate(5);

        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}