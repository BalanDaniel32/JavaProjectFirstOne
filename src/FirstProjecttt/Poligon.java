package FirstProjecttt;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Poligon {
    protected Punct[] varfuri;

    public Poligon(String numeFisier) {
        try {
            File myFile = new File(numeFisier);
            if (myFile.createNewFile()) {
                System.out.println("File has been created" + myFile.getName());
            } else {
                System.out.println("Error File already exists!");
            }
        } catch (IOException var3) {
            System.out.println("An error occured!");
            var3.printStackTrace();
        }

    }

    public void Citire(String numeFisier) {
        try {
            File myFile = new File(numeFisier);
            Scanner myScaner = new Scanner(myFile);

            while(myScaner.hasNextLine()) {
                String data = myScaner.nextLine();
                System.out.println(data);
            }

            myScaner.close();
        } catch (IOException var5) {
            System.out.println("error");
            var5.printStackTrace();
        }

    }

    public Poligon(Punct[] varfuri) {
        this.varfuri = varfuri;
    }

    public Punct[] getVarfuri() {
        return this.varfuri;
    }

    public void setVarfuri(Punct[] varfuri) {
        this.varfuri = varfuri;
    }

    public double calcPerimetru(Punct[] varfuri) {
        int perimetru = 0;

        for(int i = 0; i < varfuri.length - 1; ++i) {
            perimetru = (int)((double)perimetru + varfuri[i].Rezolva(varfuri[i + 1]));
        }

        return (double)perimetru;
    }
}