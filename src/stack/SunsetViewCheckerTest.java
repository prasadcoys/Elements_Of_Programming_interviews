package stack;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class SunsetViewCheckerTest {

    @Test
    public void testIfBetweenTwoBuildingsWhichDontBlockAreBothPrinted()
    {
        Building first = new Building(65,"A");
        Building second = new Building(30,"B");
        Collection<Building> listOfBuildings = new ArrayList<>();
        listOfBuildings.add(first);
        listOfBuildings.add(second);
        Collection<Building> buildingsWithSunsetView = SunsetViewChecker.getBuildingsWithSunsetView(listOfBuildings);
        assertEquals(buildingsWithSunsetView,listOfBuildings);
    }
    @Test
    public void testIfBetweenTwoBuildingsWhichBlockTheFirstBuildingtheLastBuildingIsPrinted()
    {
        Building first = new Building(30,"A");
        Building second = new Building(60,"B");
        Collection<Building> listOfBuildings = new ArrayList<>();
        listOfBuildings.add(first);
        listOfBuildings.add(second);
        Collection<Building> expectedBuildingsWithSunsetView = new ArrayList<>();
        expectedBuildingsWithSunsetView.add(second);
        Collection<Building> buildingsWithSunsetView = SunsetViewChecker.getBuildingsWithSunsetView(listOfBuildings);
        assertEquals(buildingsWithSunsetView,expectedBuildingsWithSunsetView);
    }
    @Test
    public void testIfThreeBuildingsWithOneBigBuildingPrintsCorrectly()
    {
        Building first = new Building(30,"A");
        Building second = new Building(60,"B");
        Building third = new Building(50,"C");
        Collection<Building> listOfBuildings = new ArrayList<>();
        listOfBuildings.add(first);
        listOfBuildings.add(second);
        listOfBuildings.add(third);
        Collection<Building> expectedBuildingsWithSunsetView = new ArrayList<>();
        expectedBuildingsWithSunsetView.add(second);
        expectedBuildingsWithSunsetView.add(third);
        Collection<Building> buildingsWithSunsetView = SunsetViewChecker.getBuildingsWithSunsetView(listOfBuildings);
        assertEquals(buildingsWithSunsetView,expectedBuildingsWithSunsetView);
    }
    @Test
    public void test()
    {
        
    }

}
