package stack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

public class SunsetViewChecker {
    public static Collection<Building> getBuildingsWithSunsetView(Collection<Building> listOfBuildings) {

        Stack<Building> buildingsWithSunsetView = new Stack<>();
        for(Building building:listOfBuildings)
        {
            if(!buildingsWithSunsetView.isEmpty())
            {
                Building recentlyPushedBuilding = buildingsWithSunsetView.peek();
                if(!(recentlyPushedBuilding.getHeight()>building.getHeight()))
                {
                    buildingsWithSunsetView.pop();
                }
                buildingsWithSunsetView.push(building);
            }
            else
            {
                buildingsWithSunsetView.push(building);
            }
        }
        return buildingsWithSunsetView;
    }
}
