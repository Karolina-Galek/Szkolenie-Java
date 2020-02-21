package com.ey;

public class Main {

	public static void main(String[] args) {
/* wiele linijek komentarz
linikjki
 */
        System.out.println("Hello world!");
        System.out.println("My name is Karolina");

        String name = new String();
        name = "Adrian";

        String friendsName = "Dawid"; // z dużej litery klasy, może być null, można na nich uzywac metody bo z dużej litery sa klasą
        Integer myAge = 40;
        Float size = 13.45f;
        double myHeight = 1.68;
        float myWeight = 80.2f; //z małej litery typy proste - primytywne, nie mogą byc null
        float myWeight2 = (float)80.2; // Kastowanie zmiennych



        int a= 7;
        int b = 5;
        int c = a + b;
        System.out.println(c);

        Integer r = 3;
        double pi = 3.14;
        double l = 2 * pi * r;
        System.out.println(l);

        boolean isSunnyDay = false;
        boolean doWeHaveTraining = true;
        boolean isSunnydayandWeHaveTraining = isSunnyDay && doWeHaveTraining;
        System.out.println(isSunnydayandWeHaveTraining);


        boolean isAGreatherThanB = a > b;
        boolean isAEqualB = a == b;
        System.out.println("A is greater than B" + isAGreatherThanB);
        System.out.println(isAEqualB);

	}
}
