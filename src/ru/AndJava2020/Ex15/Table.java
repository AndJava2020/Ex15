package ru.AndJava2020.Ex15;

public class Table extends Furniture {
    private String wood;
    private int length;
    private int width;
    private int height;

    public Table(String wood, int length, int width, int height, String color, int price) {
        super(price,color);
        this.wood = wood;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Table{" +
                "wood='" + wood + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", price="
                +price+"}";
    }
}
