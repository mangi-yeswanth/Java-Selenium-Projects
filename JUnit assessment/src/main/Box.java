package main;

public class Box {
	//Area of the circle calculation
	public double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // Area of triangle calculation
    public double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    // Area of square calculationd
    public double areaOfSquare(double side) {
        return side * side;
    }

    // Area of rectangle calculation
    public double areaOfRectangle(double length, double breadth) {
        return length * breadth;
    }

    // Simple Interest calculation
    public double simpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    // 6. Amount calculation while calling the simple interest 
    public double amount(double principal, double rate, double time) {
        double si = simpleInterest(principal, rate, time);
        double compound = principal * Math.pow((1 + rate / 100), time);
        return si + compound;
    }
}
