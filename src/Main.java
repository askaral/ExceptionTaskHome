import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                command();
                int number = scanner.nextInt();
                if(number == 0){
                    System.out.println("Finished");
                    break;
                }
                if (number == 1) {
                    System.out.print("Write down the radius: ");
                    double radius = scanner.nextDouble();
                    if (radius < 0) {
                        throw new IllegalArgumentException("Radius is negative number");
                    }
                    System.out.print("Write down the height: ");
                    double height = scanner.nextDouble();
                    if (height < 0) {
                        throw new IllegalArgumentException("Height is negative number");
                    }
                    Cylinder cylinder = new Cylinder(radius, height);

                    System.out.println("Cylinder area: " + cylinder.area());
                    System.out.println("Cylinder volume: " + cylinder.volume());
                }
                if (number == 2) {
                    System.out.print("Write down the length: ");
                    int length = scanner.nextInt();
                    if (length < 0) {
                        throw new IllegalArgumentException("Length is negative number");
                    }
                    System.out.print("Write down the height: ");
                    int height = scanner.nextInt();
                    if (height < 0) {
                        throw new IllegalArgumentException("Height is negative number");
                    }
                    System.out.print("Write down the width: ");
                    int width = scanner.nextInt();
                    if (width < 0) {
                        throw new IllegalArgumentException("Width is negative number");
                    }
                    Parallelepiped parallelepiped = new Parallelepiped(length, height, width);
                    System.out.println("Parallelepiped area: " + parallelepiped.area());
                    System.out.println("Parallelepiped volume: " + parallelepiped.volume());
                }
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            catch (InputMismatchException e) {
                System.out.println("Error write the number " + e.getMessage());
                scanner.nextLine();
            }
        }


        }
        public static void command () {
            System.out.println("""
                    Select which shape to calculate.
                    Parallelepiped -> 1
                    Cylinder       -> 2
                    Exit           -> 0
                    """);
        }

}