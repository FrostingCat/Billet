import java.util.List;

public class HouseFactory {
    private List<HouseNumber> houseNumberNumbers;

    public HouseNumber getHouse(char floor, char color) {
        HouseNumber number = find(floor, color);
        if (number == null) {
            number = new HouseNumber(floor, color);
        }
        houseNumberNumbers.add(number);
        return number;
    }

    static HouseNumber find(char floor, char color) {
        //ищем дом с такими параметрами
        return null;
    }
}
