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

        for (int i = 1 ; i <= n ; i++){
            System.out.println("Shape #" +  1 + " data: ");
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
                list.add(new Rectangle(color,width,height));
            }else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color,radius));
            }
        }

        System.out.println("SHAPE AREAS: ");
        System.out.println();
        for (Shape shape: list){
            System.out.println(String.format("%.2f",shape.area()));
        }
        sc.close();
    }
}
