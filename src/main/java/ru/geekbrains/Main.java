package ru.geekbrains;

//1. Расширить задачу про котов и тарелки с едой.
//        2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
//        (например, в миске 10 еды, а кот пытается покушать 15-20).
//        3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту
//        удалось покушать (хватило еды), сытость = true.
//        4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть
//        наполовину сыт (это сделано для упрощения логики программы).
//        5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и
//        потом вывести информацию о сытости котов в консоль.
//        6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int action;
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Vasy", 10, false);
        cats[1] = new Cat("Smoki", 15, false);
        cats[2] = new Cat("Zepo", 30, false);
        cats[3] = new Cat("Pups", 5, false);
        cats[4] = new Cat("Tom", 45, false);

        Plate plate = new Plate(50);
        plate.info();
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].fullness == false && cats[i].appetitte < plate.food) {
                cats[i].eat(plate);
                cats[i].fullness = true;
                System.out.println("Кот " + cats[i].name + " покушал");
            } else {
                System.out.println("Кот " + cats[i].name + " не поел");
            }
            plate.info();
            System.out.println("Сколько еды добавить в миску?");
            action = sc.nextInt();
            plate.increaseFood(action);
            plate.info();
        }
    }
}
