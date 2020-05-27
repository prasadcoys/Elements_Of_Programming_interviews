package leetcodemay;

import java.util.*;

public class UncrossedLines {
    public int maxUncrossedLines(int[] a, int[] b) {
        Map<Integer, List<Integer>> aMap = new HashMap<>();
        int count = 0;
        int counter = 0;
        for (int i : a) {
            if (aMap.containsKey(i)){
                aMap.get(i).add(counter++);
            } else {
                aMap.put(i,new ArrayList<>());
                aMap.get(i).add(counter++);
            }
        }
        System.out.println(aMap.keySet());

        List<int[]> lines = new ArrayList<>();

        for (int i = 0; i < b.length; i++) {
            if ( aMap.containsKey(b[i]) && aMap.get(b[i]).size()>0){
                lines.add(new int[]{Math.min(i,aMap.get(b[i]).get(0)),
                        Math.max(i,aMap.get(b[i]).get(0))});
                aMap.get(b[i]).remove(0);

            }
        }
        for (int[] line : lines) {
            System.out.println(Arrays.toString(line));
        }
        /*for (int i = 0;i < lines.size()-1;) {
            if (lines.get(i)[1]<lines.get(i+1)[0]){
                // completely out of range and can be adde.d
                count++;
                i++;

            }
            else if ( lines.get(i)[0] == lines.get(i+1)[0]){
                if (lines.get(i)[1]>lines.get(i+1)[1]){
                    lines.remove(i);
                }
                if (lines.get(i)[1]<=lines.get(i+1)[1]){
                    lines.remove(i);
                }
                count++;

            }
        }*/


        return count;
    }
}
