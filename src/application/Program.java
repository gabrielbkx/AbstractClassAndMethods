package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Shape> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of shapes:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++){
            System.out.println("Shape #" + (i + 1) + " data: ");
            System.out.println();
            System.out.print("Rectangle or Circle (r/c)? ");
            char r = sc.next().toLowerCase().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (r == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                Shape form = new Rectangle(color,width,height);
                list.add(form);
            }else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                Shape form = new Circle(color,radius);
                list.add(form);
            }
        }

        System.out.println("SHAPE AREAS: ");
        System.out.println();
        for (int i = 0 ; i < n; i ++){
            System.out.println(String.format("%.2f",list.get(i).area()));
        }
        sc.close();
    }
}
