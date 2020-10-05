package ru.AndJava2020.Ex15;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        System.out.println("ArrayList!!!!");
        ArrayList<Integer> array1= new ArrayList<>();
        show(array1.toArray());
        System.out.println("Добавим элемент в массив:");
        array1.add(30);
        show(array1.toArray());
        System.out.println("Выводим элемент с индексом 0: " + array1.get(0));

        System.out.println("Добавляем элемент на индекс 0:");
        array1.add(0,100);
        show(array1.toArray());

        System.out.println("Проверим, содержится ли элемент:" + array1.contains(30));
        System.out.println("Проверим, содержится ли элемент:" + array1.contains(20));

        System.out.println("Удалим 0-вой элемент: ");
        show(array1.toArray());
        array1.remove(0);
        show(array1.toArray());

        System.out.println("Добавил в коллекцию array1 коллекцию array2:");
        ArrayList <Integer> array2= new ArrayList<>(){};
        array2.add(-10);
        array2.add(-30);

        System.out.print("array1:");
        show(array1.toArray());
        System.out.print("array2:");
        show(array2.toArray());

        array1.addAll(array2);
        show(array1.toArray());

        System.out.println("Найдём индекс элемента -10: " + array1.indexOf(-10));
        System.out.println("Найдём индекс элемента -5 (которого нет): " + array1.indexOf(-5));

        System.out.println("\nLinkedList!!!!!");
        LinkedList<Integer> linked1=new LinkedList<>();
        System.out.println("Добавим элемент в массив:");
        linked1.add(30);
        show(array1.toArray());
        System.out.println("Выводим элемент с индексом 0: " + linked1.get(0));

        System.out.println("Добавляем элемент на индекс 0:");
        linked1.add(0,100);
        show(linked1.toArray());

        System.out.println("Проверим, содержится ли элемент:" + linked1.contains(30));
        System.out.println("Проверим, содержится ли элемент:" + linked1.contains(20));

        System.out.println("Удалим 0-вой элемент: ");
        show(array1.toArray());
        linked1.remove(0);
        show(linked1.toArray());

        System.out.println("Добавил в коллекцию array1 коллекцию array2:");
        ArrayList <Integer> linked2= new ArrayList<>(){};
        linked2.add(-10);
        linked2.add(-30);

        System.out.print("linked1:");
        show(linked1.toArray());
        System.out.print("linked2:");
        show(linked2.toArray());

        linked1.addAll(linked2);
        show(linked1.toArray());

        System.out.println("Найдём индекс элемента -10: " + linked1.indexOf(-10));
        System.out.println("Найдём индекс элемента -5 (которого нет): " + linked1.indexOf(-5));



        System.out.println("\nКоллекция");
        FurnitureShop Zur=new FurnitureShop();
        System.out.println("Добавим мебель: ");
        Furniture f=new Table("oak",100,50, 100,"brown",7000);
        Zur.addWarehouse(f);
        Zur.addWarehouse(new Table("birch",80,50, 80,"white",7000),new Armchair("spruce",100,"dark brown",8000));
        Zur.addWarehouse(new Armchair("oak",120,"dark brown",8000));
        Zur.addWarehouse(new Armchair("spruce",80,"brown",9000));
        Zur.showAssortment();
        Furniture temp = new Table("spruce",80,50, 80,"black",10000);
        Zur.addWarehouse(temp);
        Zur.showAssortment();
        System.out.println("Продадим объект f:");
        Zur.sell(f);
        Zur.showAssortment();
        System.out.println("Получим объект по индексу:");
        System.out.println(Zur.getFurn(0));
    }
    public static void show(Object [] t){
        if(t.length==0) System.out.print("Нет элементов");
        for (Object g:t
        ) {
            System.out.print(g +" ");
        }
        System.out.println();
    }
}
