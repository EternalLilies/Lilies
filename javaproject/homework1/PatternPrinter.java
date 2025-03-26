package homework1;

public class PatternPrinter {
    public static void main(String[] args){
        int size=Integer.parseInt(args[1]);
        switch (args[0]) {
            case "a":
                printPatternA(size);
                break;
            case "b":
                printPatternB(size);
                break;
            case "c":
                printPatternC(size);
                break;
            case "d":
                printPatternD(size);
                break;
            case "e":
                printPatternE(size);
                break;
            case "f":
                printPatternF(size);
                break;
            case "g":
                printPatternG(size);
                break;
            default:
                System.out.println("Invalid pattern. Choose from a, b, c, d, e, f, g.");
                break;
        }
    }

    private static void printPatternA(int size) {
        for (int i = size; i >= 1; i--) {
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        return;
    }

    private static void printPatternB(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        return;
    }

    private static void printPatternC(int size) {
        printPatternB(size);
        size--;
        for (int i = size; i >= 1; i--) {
            System.out.print(" ");
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        return;
    }

    private static void printPatternD(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        return;
    }

    private static void printPatternE(int size) {
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        return;
    }

    private static void printPatternF(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        return;
    }

    private static void printPatternG(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = size - i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        return;
    }
}
