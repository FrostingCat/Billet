public class House {
    int x;
    int y;
    HouseNumber type;
    public House(int x, int y, HouseNumber type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }
    public void make() {
        type.make(x, y);
    }
}
