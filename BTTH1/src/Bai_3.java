import java.util.*;

public class Bai_3 {
    static class Point implements Comparable<Point> {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point other) {
            return this.x == other.x ? Integer.compare(this.y, other.y) : Integer.compare(this.x, other.x);
        }

        @Override
        public String toString() {
            return x + " " + y;
        }
    }

    private static int crossProduct(Point O, Point A, Point B) {
        return (A.x - O.x) * (B.y - O.y) - (A.y - O.y) * (B.x - O.x);
    }

    public static List<Point> convexHull(Point[] points) {
        Arrays.sort(points);
        List<Point> hull = new ArrayList<>();

        for (Point p : points) {
            while (hull.size() >= 2 && crossProduct(hull.get(hull.size() - 2), hull.get(hull.size() - 1), p) <= 0) {
                hull.remove(hull.size() - 1);
            }
            hull.add(p);
        }

        int lowerSize = hull.size();
        for (int i = points.length - 2; i >= 0; i--) {
            Point p = points[i];
            while (hull.size() > lowerSize && crossProduct(hull.get(hull.size() - 2), hull.get(hull.size() - 1), p) <= 0) {
                hull.remove(hull.size() - 1);
            }
            hull.add(p);
        }

        hull.remove(hull.size() - 1);
        return hull;
    }

    public static void Output() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Point[] points = new Point[n];

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            points[i] = new Point(x, y);
        }

        List<Point> hull = convexHull(points);
        for (Point p : hull) {
            System.out.println(p);
        }

        scanner.close();
    }
}