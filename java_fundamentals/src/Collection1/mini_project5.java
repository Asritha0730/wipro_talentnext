package Collection1;

import java.util.*;

class Box {
    double length, width, height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double getVolume() {
        return length * width * height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Box)) return false;
        Box box = (Box) o;
        return Double.compare(this.getVolume(), box.getVolume()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVolume());
    }

    @Override
    public String toString() {
        return String.format("Length =%.1f Width =%.1f Height =%.1f Volume =%.2f",
                             length, width, height, getVolume());
    }
}

public class mini_project5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Box> boxSet = new LinkedHashSet<>();

        System.out.println("Enter the number of Box");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the Box " + i + " details");

            System.out.print("Enter Length\n");
            double length = scanner.nextDouble();

            System.out.print("Enter Width\n");
            double width = scanner.nextDouble();

            System.out.print("Enter Height\n");
            double height = scanner.nextDouble();

            Box box = new Box(length, width, height);
            boxSet.add(box);
        }

        System.out.println("Unique Boxes in the Set are");
        for (Box box : boxSet) {
            System.out.println(box);
        }

        scanner.close();
    }
}
