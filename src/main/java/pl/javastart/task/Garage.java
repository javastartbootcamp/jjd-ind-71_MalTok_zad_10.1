package pl.javastart.task;

import java.util.Scanner;

public class Garage {
    private Tank[] tanks = new Tank[3];
    private int tankCounter = 0;
    private Scanner input = new Scanner(System.in);

    public void run() {
        System.out.println("Podaj informacje o trzech unikalnych czołgach");
        fillGarage();
        System.out.println("Obiekty zapisane w tablicy: ");
        showGarage();
    }

    private void fillGarage() {
        for (int i = 0; i < tanks.length; i++) {
            Tank userTank;
            do {
                userTank = getTank();

                if (isDuplicate(userTank)) {
                    System.out.println("Duplikat");
                }
            } while (isDuplicate(userTank));

            tanks[i] = userTank;
            tankCounter++;
        }
    }

    private Tank getTank() {
        System.out.println("Podaj nazwę:");
        String name = input.nextLine();
        System.out.println("Podaj tonaż");
        double mass = input.nextDouble();
        System.out.println("Podaj ilość członków załogi");
        int crew = input.nextInt();
        input.nextLine();

        return new Tank(name, mass, crew);
    }

    private boolean isDuplicate(Tank userTank) {
        boolean isDuplicate = false;
        for (int i = 0; i < tankCounter; i++) {
            if (tanks[i].equals(userTank)) {
                isDuplicate = true;
                break;
            }
        }
        return isDuplicate;
    }

    public void showGarage() {
        for (int i = 0; i < tankCounter; i++) {
            System.out.println(tanks[i]);
        }
    }
}
