package leetcodemay;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColour) {
        int oldColour = image[sr][sc];
        if (oldColour == newColour){
            return image;
        }
        recursivelyFloodFillColour(image,sr,sc,newColour,oldColour);
        return image;
    }

    private void recursivelyFloodFillColour(int[][] image, int sr, int sc, int newColour, int oldColour) {
        if ( image[sr][sc]!= oldColour){
            return;
        }
        image[sr][sc] = newColour;
        if (sr+1 < image.length){
            recursivelyFloodFillColour(image,sr+1,sc,newColour,oldColour);
        }
        if (sr-1>-1){
            recursivelyFloodFillColour(image,sr-1,sc,newColour,oldColour);
        }
        if (sc+1<image[sr].length){
            recursivelyFloodFillColour(image,sr,sc+1,newColour,oldColour);
        }
        if (sc-1>-1){
            recursivelyFloodFillColour(image,sr,sc-1,newColour,oldColour);
        }
    }
}
