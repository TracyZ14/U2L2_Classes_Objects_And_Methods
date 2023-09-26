import java.util.Scanner;
public class U2L2Runner {
    public static void main(String[] args) {
        // Code segment I
        // int len = 65;
        // int wid = len + 10;
        // Rectangle rect = new Rectangle(len, wid);

        // Code segment II
        // Rectangle rect = new Rectangle(10.0, 30.0);

        // Code segment III
        // Rectangle rect = new Rectangle(0);

        /*
        // 1
        Rectangle rect1 = new Rectangle(150, 200);
        Rectangle rect2 = new Rectangle(100);
        Rectangle rect3 = new Rectangle();
        // 2
        rect1.setWidth(125);
        rect2.setWidth(125);
        rect2.setLength(125);
        rect3.setWidth(125);
        // 3
        int rect1Length = rect1.getLength();
        int rect1Width = rect1.getWidth();
        int rect1Perimeter = 2 * (rect1Length + rect1Width);
        int rect2Length = rect2.getLength();
        int rect2Width = rect2.getWidth();
        int rect2Perimeter = 2 * (rect2Length + rect2Width);
        int rect3Length = rect3.getLength();
        int rect3Width = rect3.getWidth();
        int rect3Perimeter = 2 * (rect3Length + rect3Width);
        int rectPerimeterSum = rect1Perimeter + rect2Perimeter + rect3Perimeter;
        // 4
        int rect1Area = rect1.calculateArea();
        int rect2Area = rect2.calculateArea();
        int rect3Area = rect3.calculateArea();
        int rectAreaSum = rect1Area + rect2Area + rect3Area;
        // 5
        System.out.println("The total length of fencing that will be needed to enclose all three plots of land is " + rectPerimeterSum + " feet.");
        System.out.println("The total area that will need seeding is " + rectAreaSum + " square feet.");
        */

        /*
        // 1
        Rectangle rect1 = new Rectangle(150, 200);
        Rectangle rect2 = new Rectangle(100);
        Rectangle rect3 = new Rectangle();
        // 2
        rect1.setWidth(125);
        rect2.setWidth(125);
        rect2.setLength(125);
        rect3.setWidth(125);
        // 3
        int rect1Perimeter = rect1.calculatePerimeter();
        int rect2Perimeter = rect2.calculatePerimeter();
        int rect3Perimeter = rect3.calculatePerimeter();
        int rectPerimeterSum = rect1Perimeter + rect2Perimeter + rect3Perimeter;
        // 4
        int rect1Area = rect1.calculateArea();
        int rect2Area = rect2.calculateArea();
        int rect3Area = rect3.calculateArea();
        int rectAreaSum = rect1Area + rect2Area + rect3Area;
        // 5
        System.out.println("The total length of fencing that will be needed to enclose all three plots of land is " + rectPerimeterSum + " feet.");
        System.out.println("The total area that will need seeding is " + rectAreaSum + " square feet.");
        */

        Scanner s = new Scanner(System.in);
        System.out.println("How many pieces of lumber do you need for the home you are building?");
        String answer1 = s.nextLine();
        int piecesOfLumber = Integer.parseInt(answer1);
        System.out.println("How many windows do you need?");
        String answer2 = s.nextLine();
        int numberOfWindows = Integer.parseInt(answer2);
        System.out.println("What is the tax rate for your area?");
        String answer3 = s.nextLine();
        double taxRate = Double.parseDouble(answer3);
        final double lumberPrice = 11.50;
        final double windowPrice = 25.75;
    }
}
