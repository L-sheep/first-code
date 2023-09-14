package Phone;

import java.util.Scanner;

public class Phonetext {
    public static void main(String[] args) {
        Phone[] p = new Phone[3];
        Phone p1 = new Phone("小米", 1999, "blue");
        Phone p2 = new Phone("华为", 5999, "red");
        Phone p3 = new Phone("realme", 3999, "yellow");
        p[0] = p1;
        p[1] = p2;
        p[2] = p3;
        int sum = 0;
        for (int i = 0; i < p.length; i++) {
            sum += p[i].getPrice();
        }
        System.out.println(sum);
        double averavge = 0;
        averavge = sum * 1.0/ p.length;
        System.out.println(averavge);
    }


}
