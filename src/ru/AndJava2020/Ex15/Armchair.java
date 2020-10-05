package ru.AndJava2020.Ex15;

public class Armchair extends Furniture{
    private String wood;
    private int seatHeight;

    public Armchair(String wood, int seatHeight, String color, int price) {
        super(price,color);
        this.wood = wood;
        this.seatHeight = seatHeight;

    }

    @Override
    public String toString() {
        return "Armchair{" +
                "wood='" + wood + '\'' +
                ", seatHeight=" + seatHeight +
                ", color='" + color + '\'' +
                ", price="
                +price+"}";
    }
}
