package a04;

import java.util.Scanner;

/**
 * The program is to draws some simple figures.
 *
 * @author rakhuzhuwosapruna
 */
public class DrawFigures {

    public static final Scanner kbd = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int option = printIntroduction();
        if (option == 1) {
            drawRectangleOption();
        }//end if
        else if (option == 2) {
            drawRightTriangleOption();
        }//end if-else
        else if (option == 3) {
            drawInvertedTriangleOption();
        }//end if-else
        else if (option == 4) {
            drawIsoscelesTriangleOption();
        }//end if-else
        else if (option == 5) {
            drawIndentedRectangleOption();
        }//end if-else
        else if (option == 6) {
            drawTreeOption();
        }//end if-else

    }//end main()

    /**
     * printIntroduction prints the Introduction
     *
     * @return returns the option chosen by the user
     */
    public static int printIntroduction() {
        System.out.println("\nDrawing Figures\n"
                + "----------------\n"
                + "by Rakhuzhuwo Sapruna (A00455075)\n"
                + "This program draws some figures.\n");
        System.out.println("Main Menu:\n"
                + "1 Draw a rectangle\n"
                + "2 Draw a right triangle\n"
                + "3 Draw an upside-down right triangle\n"
                + "4 Draw an isosceles triangle\n"
                + "5 Draw an indented rectangle\n"
                + "6 Draw a fire tree");
        System.out.print("\nPlease choose the option: ");
        int option = kbd.nextInt();
        return option;
    }//end printIntroduction()

    /**
     * drawRectangleOption take height, width and symbol from the user, to draw
     * a Rectangle
     */
    public static void drawRectangleOption() {
        String symbol;
        int height, width;
        System.out.println("\nDrawing a Rectangle ...\n");
        System.out.print("What are height and width of the rectangle? ");
        height = kbd.nextInt();
        width = kbd.nextInt();
        kbd.nextLine();
        System.out.print("What character should be used? ");
        symbol = kbd.nextLine();
        drawRectangle(symbol, height, width);
    }//end drawRectangleOption()

    /**
     * drawRightTriangleOption take symbol and base from the user, to draw a
     * Right Triangle
     */
    public static void drawRightTriangleOption() {
        String symbol;
        int base;
        System.out.println("\nDrawing a Right Triangle ...\n");
        System.out.print("What size is the base of the triangle? ");
        base = kbd.nextInt();
        kbd.nextLine();
        System.out.print("What character should be used? ");
        symbol = kbd.nextLine();
        System.out.println();
        drawRightTriangle(symbol, base);
    }//end drawRightTriangleOption()

    /**
     * drawInvertedTriangleOption take symbol and base from the user, to draw an
     * Inverted Triangle
     */
    public static void drawInvertedTriangleOption() {
        String symbol;
        int base;
        System.out.println("\nDrawing an Upside-down Right Triangle ...\n");
        System.out.print("What size is the base of the triangle? ");
        base = kbd.nextInt();
        kbd.nextLine();
        System.out.print("What character should be used? ");
        symbol = kbd.nextLine();
        System.out.println();
        drawInvertedTriangle(symbol, base);
    }//end drawInvertedTriangleOption()

    /**
     * drawIsoscelesTriangleOption take symbol and base from the user, to draw a
     * IsoscelesTriangle
     */
    public static void drawIsoscelesTriangleOption() {
        String symbol;
        int height;
        System.out.println("\nDrawing an Isosceles Triangle ...\n");
        System.out.print("What is height of the traingle? ");
        height = kbd.nextInt();
        kbd.nextLine();
        System.out.print("What character should be used? ");
        symbol = kbd.nextLine();
        drawIsoscelesTriangle(symbol, height);
    }//end drawIsoscelesTriangleOption()

    /**
     * drawIndentedRectangleOption take symbol, height, width and indent from
     * the user, to draw an Indented Rectangle
     */
    public static void drawIndentedRectangleOption() {
        String symbol;
        int height, width, indent;
        System.out.println("\nIndented Rectangle ...\n");
        System.out.print("What is the height and width of the rectangle? ");
        height = kbd.nextInt();
        width = kbd.nextInt();
        kbd.nextLine();
        System.out.print("What is the size of indentation? ");
        indent = kbd.nextInt();
        kbd.nextLine();
        System.out.print("What character should be used? ");
        symbol = kbd.nextLine();
        System.out.println();
        drawIndentedRectangle(symbol, height, width, indent);
    }//end drawIndentedRectangleOption()

    /**
     * drawTreeOption take symbol, height, width and indent from the user, to
     * draw a Tree
     */
    public static void drawTreeOption() {
        String symbol;
        int branches, trunkHeight, trunkWidth;
        System.out.println("\nDraw a Tree ...\n");
        System.out.print("What is the size of branches and height and width "
                + "of trunk? ");
        branches = kbd.nextInt();
        trunkHeight = kbd.nextInt();
        trunkWidth = kbd.nextInt();
        kbd.nextLine();
        System.out.print("What character should be used? ");
        symbol = kbd.nextLine();

        drawTree(symbol, branches, trunkHeight, trunkWidth);
    }//end drawTreeOption()

    /**
     * drawRectangle print a rectangle
     *
     * @param symbol is the symbol to print
     * @param height is the height of rectangle
     * @param width is the width of rectangle
     */
    public static void drawRectangle(String symbol, int height, int width) {
        System.out.println();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }

    }//end drawRectangle()

    /**
     * drawRightTriangle print a RightTriangle
     *
     * @param symbol is the symbol to print
     * @param base is the base of the Triangle
     */
    public static void drawRightTriangle(String symbol, int base) {
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }//end drawRightTriangle()

    /**
     * drawInvertedTriangle print a Inverted RightTriangle
     *
     * @param symbol is the symbol to print
     * @param base is the base of the Triangle
     */
    public static void drawInvertedTriangle(String symbol, int base) {
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < base - i; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }//end drawInvertedTriangle()

    /**
     * drawIsoscelesTriangle prints an Isosceles Triangle
     *
     * @param symbol is the symbol to print
     * @param height is the height of the Triangle
     */
    public static void drawIsoscelesTriangle(String symbol, int height) {
        int row = height;
        System.out.println();
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < 2 * row - 2; j++) {
                System.out.print(" ");
            }
            row = row - 1;
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(symbol + " ");
            }
            System.out.println(); // move to the next line after each row
        }
    }//end drawIsoscelesTriangle()

    /**
     * drawIndentedRectangle prints an Indented Rectangle
     *
     * @param symbol is the symbol to print
     * @param height is the height of the Rectangle
     * @param width is the width of the Rectangle
     * @param indent is the indent of the Rectangle
     */
    public static void drawIndentedRectangle(String symbol, int height,
            int width, int indent) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < indent; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < width; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }//end drawIndentedRectangle()

    /**
     * drawTree print a Tree
     *
     * @param symbol is the symbol to print
     * @param branches is the height of the tree
     * @param trunkHeight is the width of the trunk
     * @param trunkWidth is the indent of the trunk
     */
    public static void drawTree(String symbol, int branches, int trunkHeight,
            int trunkWidth) {
        int row = branches;
        System.out.println();
        for (int i = 1; i <= branches; i++) {
            for (int j = 0; j < 2 * row - 2; j++) {
                System.out.print(" ");
            }
            row = row - 1;
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(symbol + " ");
            }
            System.out.println(); // move to the next line after each row
        }
        int indent = branches + 1;
        for (int i = 0; i < trunkHeight; i++) {
            for (int j = 0; j < indent; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < trunkWidth; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }//end drawTree()
}
