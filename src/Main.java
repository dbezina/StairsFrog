import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter n");
        System.out.println("to stop enter Nan or exit");
        Scanner scanner = new Scanner(System.in);

        String next = scanner.nextLine();
        while (!next.equals("exit")) {
            try {
                int n = Integer.parseInt(next);
                System.out.print("for n=" + n + " ");

                ClimbStairsContext context = new ClimbStairsContext();
                context.setStrategy(n);

                long start = System.nanoTime();
                long result = context.executeStrategy(n);
                long end = System.nanoTime();
                System.out.println("Result: " + result + ", Lead time: " + (end - start) + " nano s");
                next = scanner.nextLine();
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
                System.out.println("good bye");
                break;
            }
        }
    }
}