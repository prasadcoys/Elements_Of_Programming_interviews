package C_0;

import C_0.utils.AnagramTester;

import java.util.*;

public class AnagramGrouper
{
    public static List<List<String>> getGroupsOfAnagrams(List<String> listOfWords)
    {
        Map<String, List<String>> wordGrouping = new HashMap<>();
        List<List<String>> anagramGroups = new ArrayList<>();
        for (String word : listOfWords)
        {
            int[] wordsInIntArray = AnagramTester
                    .getIntegerArrayFromWord(word);
            String wordForKeyInMap = null;
            for (int i = 0; i < wordsInIntArray.length; i++)
            {
                wordForKeyInMap += (wordsInIntArray[ i ] + '*');
                wordForKeyInMap += i + ',';
            }
            if (wordGrouping.containsKey(wordForKeyInMap))
            {
                wordGrouping.get(wordForKeyInMap).add(word);
            } else
            {
                ArrayList<String> strings = new ArrayList<>();
                strings.add(word);
                wordGrouping.put(wordForKeyInMap, strings);
            }

        }
        for(Map.Entry<String,List<String>> entry: wordGrouping.entrySet())
        {
            if(entry.getValue().size()>1)
            {
                anagramGroups.add(entry.getValue());
            }
        }
        return anagramGroups;
    }
}
