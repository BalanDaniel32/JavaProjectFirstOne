package FirstProjecttt;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Poligon poligon=new Poligon("varfuri.txt");


        Poligon poligon=new Poligon("varfuri.txt");


        try {
            File myFile = new File("varfuri.txt");
            Scanner scanner = new Scanner(myFile);
            Punct[] varfuri = new Punct[scanner.nextInt()];
            scanner.nextLine();

            for(int i = 0; i < varfuri.length - 1; i++) {
                varfuri[i] = new Punct(scanner.nextInt(), scanner.nextInt());
                scanner.nextLine();
                System.out.println(varfuri[i]);
            }

            varfuri[2] = new Punct(scanner.nextInt(), scanner.nextInt());
            System.out.println(varfuri[2]);
            Poligon poligon1 = new Poligon(varfuri);
            System.out.println("Perimetrul este:"+poligon1.calcPerimetru(varfuri));
        } catch (IOException e) {
            System.out.println("Eroare");
            e.printStackTrace();
        }

    }
}