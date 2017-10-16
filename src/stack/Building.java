package stack;

public class Building {
    private final String name;
    private int height;

    public Building(int height, String buildingName) {

        this.height = height;
        this.name = buildingName;
    }



    public String toString()
    {
        return name;
    }

    public int getHeight() {
        return height;
    }
}
