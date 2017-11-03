import java.util.Scanner;

public class SqTriangle {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите х1,у1");
        int x1 = myScanner.nextInt(), y1 = myScanner.nextInt();
        System.out.println("Введите х2,у2");
        int x2 = myScanner.nextInt(), y2 = myScanner.nextInt();
        System.out.println("Введите х3,у3");
        int x3 = myScanner.nextInt(), y3 = myScanner.nextInt();
        double sideA,sideB,sideC,per,sq;
        sideA = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2-y1), 2));
        System.out.println("длина стороны А: " + sideA);
        sideB = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3-y2), 2));
        System.out.println("длина стороны B: " + sideB);
        sideC = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1-y3), 2));
        System.out.println("длина стороны А: " + sideC);
        per = (sideA+sideB+sideC)/2;
        sq = Math.sqrt(per*(per-sideA)*(per-sideB)*(per-sideC));
        System.out.println("Площадь треугольника: " + sq);
    }
}
