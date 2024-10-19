// Question Link: https://www.geeksforgeeks.org/problems/java-switch-case-statement3529/1

import java.util.*;
class _04_SwitchStatement{
    static double switchCase(int choice, List<Double> arr) {
        // Check the user's choice to determine the shape
        switch (choice) {
            case 1: // Choice 1: Calculate area of a circle
                return Math.PI * arr.get(0) * arr.get(0);
            case 2: // Choice 2: Calculate area of a rectangle
                return arr.get(0) * arr.get(1);
        }
        return 0;
    }
}