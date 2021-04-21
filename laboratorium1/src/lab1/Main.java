package lab1;


import javax.swing.*;


public class Main {


    public static void main(String[] args) {

       int i, j, k;
       String s;

       s = JOptionPane.showInputDialog(null, " Podaj pierwszy argument całkowity");
       j = Integer.parseInt(s);
       s = JOptionPane.showInputDialog(null, "Podaj drugi argument całkowity");
       k = Integer.parseInt(s);

       float u, v ,w;
       s = JOptionPane.showInputDialog(null, "Podaj pierwszy argument rzeczywisty");
       v = Float.parseFloat(s);
        s = JOptionPane.showInputDialog(null, "Podaj drugi argument rzeczywisty");
        w = Float.parseFloat(s);


        i = j + k;      s= "j + k wynosi " + i + "/n";
        i = j - k;      s+="j - k wynosi " + i + "/n";
        i = j / k;      s+="j / k wynosi " + i + "/n";
        i = j * k;      s+="j * k wynosi " + i + "/n";
        i = j % k;      s+="j % k wynosi " + i + "/n";

        u = v + w;      s+= "v + w wynosi " + u + "/n";
        u = v - w;      s+= "v - w wynosi " + u + "/n";
        u = v * w;      s+= "v * w wynosi " + u + "/n";
        u = v / w;      s+= "v / w wynosi " + u + "/n";

        u += v;         s += "u += v wynosi " + u + "/n";
        u -= v;         s += "u -= v wynosi " + u + "/n";
        u *= v;         s += "u *= v wynosi " + u + "/n";
        u /= v;         s += "u /= v wynosi " + u + "/n";

        JOptionPane.showMessageDialog(null, s);
        System.exit(0);


            //Operatory inkrementacji i dekrementacji

//        int a, a2, b, b2;
//        a = 10; b = 10;
//        System.out.println("a = " + a + "b= " + b);
//        a2 = ++a;
//        b2 = b++;
//        System.out.println("Wykonuje instrukcje: a2=++a; b2=b++;");
//        System.out.println("a= " +a+ " a2=" +a2);
//        System.out.println("b= " +b+ " b2=" + b2);
    }
}



















//    Random rand = new Random();
//    int i, j, k;
//    String s;
//        j = rand.nextInt() % 10;
//                k = rand.nextInt() % 10;
//                s = "j wynosi " + j;
//                System.out.println(s);
//                s = "k wynosi " + k;
//                System.out.println(s);
//
//                i = j + k;
//                s = "j + k wynosi " + i;
//                System.out.println(s);
//                i = j - k;
//                s = "j - k wynosi " + i;
//                System.out.println(s);
//                i = j / k;
//                s = "j / k wynosi " + i;
//                System.out.println(s);
//                i = j * k;
//                s = "j * k wynosi " + i;
//                System.out.println(s);
//                i = j % k;
//                s = "j % k wynosi " + i;
//                System.out.println(s);
//                i = j;
//
//                j += k;
//                s = "j += K wynosi " + j;
//                System.out.println(s);
//                j -= k;
//                s = "j -= K wynosi " + j;
//                System.out.println(s);
//                j *= k;
//                s = "j *= K wynosi " + j;
//                System.out.println(s);
//                j /= k;
//                s = "j /= K wynosi " + j;
//                System.out.println(s);
//                j %= k;
//                s = "j %= K wynosi " + j;
//                System.out.println(s);
//
//                float u, v, w;
//
//                v = rand.nextFloat();
//                w = rand.nextFloat();
//                s = "v = " + v;
//                System.out.println(s);
//                s = "w = " + w;
//                System.out.println(s);
//                u = v + w;
//                s = "v + w wynosi " + u;
//                System.out.println(s);
//                u = v - w;
//                s = "v - w wynosi " + u;
//                System.out.println(s);
//                u = v * w;
//                s = "v * w wynosi " + u;
//                System.out.println(s);
//                u = v / w;
//                s = "v / w wynosi " + u;
//                System.out.println(s);
//
//                u += v;
//                s = "u += v wynosi " + u;
//                System.out.println(s);
//                u -= v;
//                s = "u -= v wynosi " + u;
//                System.out.println(s);
//                u *= v;
//                s = "u *= v wynosi " + u;
//                System.out.println(s);
//                u /= v;
//                s = "u /= v wynosi " + u;
//                System.out.println(s);




//    Obliczenia rachunek = new Obliczenia();
//        rachunek.wpisz();
//                rachunek.oblicz();