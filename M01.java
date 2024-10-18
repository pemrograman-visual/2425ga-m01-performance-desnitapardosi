// 12S24043 - desnita pardosi
// 12S24018 - kelvin yohannes putra
import java.util.*;
import java.lang.Math;

public class M01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double performance;
        double nilaiangka, a, aB, b, bC, c, d, e;
        double totalkredit;
        String jenishuruf, kredit;

        totalkredit = 0;
        a = 4.0;
        aB = 3.5;
        b = 3.0;
        bC = 2.5;
        c = 2.0;
        d = 1.0;
        e = 0.0;
        kredit = input.nextLine();
        if (kredit.equals("---")) {
            kredit = kredit;
        } else {
            totalkredit = Integer.parseDouble(kredit);
        }
        jenishuruf = input.nextLine();
        while (!jenishuruf.equals("---")) {
            if (jenishuruf.equals("A")) {
                nilaiangka = 4.0;
            } else {
                if (jenishuruf.equals("AB")) {
                    nilaiangka = 3.5;
                } else {
                    if (jenishuruf.equals("B")) {
                        nilaiangka = 3.0;
                    } else {
                        if (jenishuruf.equals("BC")) {
                            nilaiangka = 2.5;
                        } else {
                            if (jenishuruf.equals("C")) {
                                nilaiangka = 2.0;
                            } else {
                                if (jenishuruf.equals("D")) {
                                    nilaiangka = 1.0;
                                } else {
                                    if (jenishuruf.equals("E")) {
                                        nilaiangka = 0.0;
                                    } else {
                                        nilaiangka = 0.0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            performance = totalkredit * nilaiangka;
            System.out.println(toFixed(performance,1));
            kredit = input.nextLine();
            if (kredit.equals("---")) {
                kredit = kredit;
            } else {
                totalkredit = Integer.parseDouble(kredit);
            }
            jenishuruf = input.nextLine();
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
