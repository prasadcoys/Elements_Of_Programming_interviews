package C_0;

import java.util.ArrayList;
import java.util.List;

public class ArrayIntersecter
{
    public static List<Integer> intersect(int[] a, int[] b)
    {
        List<Integer> listWithIntersectionElements = new ArrayList<>();
        int i = 0, j = 0;
        while (true)
        {
            if (i >= a.length || j >= b.length)
            {
                break;
            }
            if (a[ i ] == b[ j ])
            {
                if (!listWithIntersectionElements
                        .isEmpty() && (listWithIntersectionElements.get
                        (listWithIntersectionElements.size() - 1) ==
                        a[ i ]))
                {
                    i++;
                    j++;
                    continue;
                }
                listWithIntersectionElements.add(a[ i ]);
                i++;
                j++;
            }
            else if(a[i]<b[j])
            {
                i++;
            }
            else
            {
                j++;
            }

        }
        return listWithIntersectionElements;
    }
}
