import java.util.List;

public class Village {
    private static List<House> houses;

    public static void putHouse(int x, int y, char floors, char color) {
        HouseNumber type = HouseFactory.find(floors, color);
        House house = new House(x, y, type);
        houses.add(house);
    }

    public static void make() {
        for (House house : houses) {
            house.make();
        }
    }
}
