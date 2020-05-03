package leetcodemay;

import java.util.Arrays;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {

        //form character map from magazine

        char[] charArray = magazine.toCharArray();
        Arrays.sort(charArray);

        char[] ransomArray = ransomNote.toCharArray();
        Arrays.sort(ransomArray);
        int fromIndex = 0;
        for (char ransom: ransomArray
             ) {
            int i = Arrays.binarySearch(charArray,fromIndex,
                    ransomArray.length, ransom);
            if (i < 0 ){
                return false;
            }
            fromIndex = i;
        }

        /*int[] magazineCharacterMap = new int[ 26 ];
        for (char magazineCharacter :
                magazine.toCharArray()) {
            magazineCharacterMap[magazineCharacter%97]++;
        }

        // process ransom note

        for (char ransomCharacter:
             ransomNote.toCharArray()) {
            int ransomMod97 = ransomCharacter % 97;
            if (magazineCharacterMap[ ransomMod97 ] -- <1){
                return false;
            }

        }
*/

        return true;
    }
}
