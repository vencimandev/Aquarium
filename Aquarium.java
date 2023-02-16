package Exercises;

import java.util.Scanner;

public class Aquarium {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int wight = Integer.parseInt(scanner.nextLine());
        int height  = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int volume = length * wight * height;
        double fullTankLiter = volume * 0.001;

        double neededLiters = fullTankLiter * (1 - percent/100);

        System.out.println(neededLiters);
    }
}
