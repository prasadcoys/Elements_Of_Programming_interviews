package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        int[] numbers = new int[ n ];
        for (int i = 0; i < n; i++) {
            numbers[ i ] = i + 1;
        }
        List<List<Integer>> combinations = new ArrayList<>();
        for (int i = 0; i <= n - k; i++) {
            ArrayList<Integer> currentCombination = new ArrayList<>();
            currentCombination.add(numbers[ i ]);
            recursivelyCalculateCombinationsFor(i, combinations,
                    currentCombination, k, numbers);
        }
        return combinations;
    }

    private void recursivelyCalculateCombinationsFor(int startPos, List<List<Integer>> combinations, List<Integer> currentCombination, int k, int[] numbers) {
        if (startPos >= numbers.length) {
            if (currentCombination.size() == k) {
                combinations.add(currentCombination);
                return;
            }
        }
        if (currentCombination.size() == k) {
            combinations.add(currentCombination);
            return;
        }

        int required = k - currentCombination.size();
        int loopend = numbers.length - required;

        for (int i = startPos + 1; i <= loopend; i++) {
            List<Integer> newCurrentCombination =
                    new ArrayList<>(currentCombination);
            newCurrentCombination.add(numbers[ i ]);
            recursivelyCalculateCombinationsFor(i, combinations,
                    newCurrentCombination, k, numbers);
        }
    }
}
