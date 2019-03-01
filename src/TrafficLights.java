
import java.util.Scanner;

public class TrafficLights {

    public static void main(String[] args) {


        int color;
        Scanner scr = new Scanner(System.in);
        while (true) {
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
            }
        }
    }
}

