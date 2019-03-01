//import java.awt.*;
//import java.sql.SQLOutput;
import java.util.Scanner;

public class TrafficLights {

    public static void main(String[] args) {


        int color;
        Scanner scr = new Scanner(System.in);
        while(true){
        System.out.println("Введите число которе будет отвечать за цвет: 1-краcный, 2-желтый, 3-зеленый,4-мигающий желтый");
//        Scanner scr = new Scanner(System.in);
        color = scr.nextInt();
        int time = 5;

        if (color == 1) {
            System.out.println("Загорается красный");
            do {
                System.out.println("Время работы светофора " + time + " секунд");
            }
            while (--time > 0);

        } else if (color == 2) {
            do {
                System.out.println("Время работы светофора " + time + " секунд");
            }
            while (--time > 0);

            System.out.println("Загорается желтый");
        } else if (color == 3) {
            do {
                System.out.println("Время работы светофора " + time + " секунд");
            }
            while (--time > 0);

            System.out.println("Загорается зеленый");
        } else if (color == 4) {

            System.out.println("Мигающий желтый");
        }}}}

//        System.out.println("Введите число 1-краcный, 2-желтый, 3-зеленый,4-мигающий желтый");
//
//        color = scr.nextInt();
//        if (color == 2) {
//            System.out.println("Загорается желтый");
//            int time = 5;
//            do {
//                System.out.println("Время работы " + time + " секунд");
//            }
//            while (--time > 0);
//        }
//        System.out.println("Введите число 1-краcный, 2-желтый, 3-зеленый,4-мигающий желтый");
//        color = scr.nextInt();
//        if (color == 3) {
//            System.out.println("Загорается зеленый");
//            int time = 5;
//            do {
//                System.out.println("Время работы " + time + " секунд");
//            }
//            while (--time > 0);
//        }
//        System.out.println("Введите число 1-краcный, 2-желтый, 3-зеленый,4-мигающий желтый");
//        color = scr.nextInt();
//        if (color == 4) {
//            System.out.println("все время мигает желтый");
//            int time = 5;
//            do {
//                System.out.println("Время раунд " + time + " секунд");
//            }
//            while (--time > 0);
//        }


//    }
//
//    private static void main(int color, Scanner scr) {
//    }
//}

//public class TrafficLights {
//    private String Red;
//    private String Yellow;
//    private String Green;
//    private String flashingYellow;
//
//    public void main() {
//        String knopkaÝ;
//        String knopkaß;
//        String KnopkaRab;
//        String b[] = {Red, Yellow, Green};
//        String begin = b[];
//        for (int i = 0; i <= b.length(); i++) ;
//
//    }
//
//    public TrafficLights(String red, String yellow, String green, String flashingYellow) {
//        this.Red = "Красный";
//        this.Yellow = "Желтый";
//        this.Green = "Зеленый";
//        this.flashingYellow = "Мигающий желтый";
//    }
//
//    public void setRed(String Red) {
//        this.Red = Red;
//    }
//
//    public void setYellow(String Yellow) {
//        this.Yellow = Yellow;
//    }
//
//    public void setGreen(String Green) {
//        this.Green = Green;
//    }
//
//    public void setFlashingYellow(String flashingYellow) {
//        this.flashingYellow = flashingYellow;
//    }
//
//    public String getRed() {
//        return Red;
//    }
//
//    public String getYellow() {
//        return Yellow;
//    }
//
//    public String getGreen() {
//        return Green;
//    }
//
//    public String getFlashingYellow() {
//        return flashingYellow;
//    }
