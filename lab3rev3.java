import java.util.Scanner;

class Point {
    double x, y;

    public Point(double x2, double y2) {
        this.x = x2;
        this.y = y2;
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }
}

public class lab3rev3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of points: ");
        int n = scanner.nextInt();
        Point[] points = new Point[n];

        System.out.println("Enter the points (x y): ");
        for (int i = 0; i < n; i++) {
            double x = scanner.nextDouble();
            double  y = scanner.nextDouble();
            points[i] = new Point(x, y);
        }

        Pair nearestPair = findNearestPoints(points);
        System.out.println("Nearest Points: (" + nearestPair.p1.x + ", " + nearestPair.p1.y + ") and (" + nearestPair.p2.x + ", " + nearestPair.p2.y + ")");
        scanner.close();
    }

    static class Pair {
        Point p1, p2;
        double distance;

        public Pair(Point p1, Point p2, double distance) {
            this.p1 = p1;
            this.p2 = p2;
            this.distance = distance;
        }
    }

    public static Pair findNearestPoints(Point[] points) {
        if (points.length < 2) {
            throw new IllegalArgumentException("At least two points are required");
        }

        Point closest1 = points[0];
        Point closest2 = points[1];
        double minDistance = Point.distance(closest1, closest2);

        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double dist = Point.distance(points[i], points[j]);
                if (dist < minDistance) {
                    minDistance = dist;
                    closest1 = points[i];
                    closest2 = points[j];
                }
            }
        }

        return new Pair(closest1, closest2, minDistance);
    }
}
