package stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EquivalentPathFinderTest {


    @Test
    public void testIfAbsolutPathIsPrintedCorrectly() {
        String inputPath = "/usr/lib/bin";
        assertEquals("/usr/lib/bin", EquivalentPathFinder.getShortestEquivalentPath(inputPath));
    }

    @Test
    public void testIfRelativePathIsPrintedCorrectly() {
        String inputPath = "usr/lib/bin";
        assertEquals("usr/lib/bin", EquivalentPathFinder.getShortestEquivalentPath(inputPath));
    }

    @Test
    public void testIfPathWithDoubleSlashIsPrintedCorrectly() {
        String inputPath = "usr/lib//bin";
        assertEquals("usr/lib/bin", EquivalentPathFinder.getShortestEquivalentPath(inputPath));
    }

    @Test
    public void testIfPathWithDotIsPrintedCorrectly() {
        String inputPath = "usr/./lib//bin";
        assertEquals("usr/lib/bin", EquivalentPathFinder.getShortestEquivalentPath(inputPath));
    }

    @Test
    public void testIfPathContainsDoubleDotIsPrintedCorrectly() {
        String inputPath = "usr/../lib/bin";
        assertEquals("lib/bin", EquivalentPathFinder.getShortestEquivalentPath(inputPath));
    }

    @Test
    public void testIfWrongPathShowsException() {
        String inputPath = "../lib/bin";
        EquivalentPathFinder.getShortestEquivalentPath(inputPath);
    }

}
