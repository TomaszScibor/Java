//package lab1;
//
//import javax.swing.*;
//
//
//public class Obliczenia {
//    float a = 0, x = 0, p = 0;
//    float wartoscNetto = 0, wartoscPodatku = 0;
//    String cena, ilosc, podatek;
//
//    void wpisz() {
//
//        cena = JOptionPane.showInputDialog("Wprowadz cene towaru: ");
//        a = Float.parseFloat(cena);
//        ilosc = JOptionPane.showInputDialog("Wprowadz ilosc towaru: ");
//        x = Float.parseFloat(ilosc);
//        podatek = JOptionPane.showInputDialog("Wprowadz wysokosc podatku: ");
//        p = Float.parseFloat(podatek);
//    }
//
//    void oblicz() {
//        wartoscNetto = a * x;
//        wartoscPodatku = (p/100) * a * x;
//        JOptionPane.showMessageDialog(null,"Wartosc rachunku netto wynosi: "+ wartoscNetto + " zl");
//        JOptionPane.showMessageDialog(null,"Wartosc podatku wynosi: "+ wartoscPodatku + " %");
//
//
//
//    }
//
//
//}
