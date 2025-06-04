package com.parking;

import javax.swing.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

public class Symulator {

    public static void main(String[] args) 
    {
        Symulator symulator = new Symulator();
        Scanner scanner = new Scanner(System.in);
        int wybor;

        do {
            System.out.println("\n===== MENU PARKINGU =====");
            System.out.println("1. Rejestruj wjazd pojazdu");
            System.out.println("2. Rejestruj wyjazd pojazdu");
            System.out.println("3. Wyświetl zaparkowane pojazdy");
            System.out.println("4. Wyświetl historię parkowania");
            System.out.println("0. Wyjście");
            System.out.print("Wybierz opcję: ");
            wybor = scanner.nextInt();
            scanner.nextLine(); // 

            switch (wybor) {
                case 1:
                    System.out.print("Podaj numer rejestracyjny: ");
                    String nrRej = scanner.nextLine().toUpperCase();
                    System.out.println("Wybierz typ pojazdu:");
                    for (TypPojazdu t : TypPojazdu.values()) {
                        System.out.println("- " + t);
                    }
                    String typStr = scanner.nextLine().toUpperCase();
                    try {
                        TypPojazdu typ = TypPojazdu.valueOf(typStr);
                        symulator.ZglosWjazd(nrRej, typ);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Nieprawidłowy typ pojazdu.");
                    }
                    break;

                case 2:
                    System.out.print("Podaj numer rejestracyjny pojazdu: ");
                    String nrWyjazd = scanner.nextLine().toUpperCase();
                    symulator.zarejestrujWyjazd(nrWyjazd);
                    break;

                case 3:
                    symulator.wyswietlZaparkowanePojazdy();
                    break;

                case 4:
                    symulator.wyswietlHistorieParkowania();
                    break;

                case 0:
                    System.out.println("Zamykam symulator...");
                    break;

                default:
                    System.out.println("Nieprawidłowy wybór.");
            }

        } while (wybor != 0);

        scanner.close();
    }
}