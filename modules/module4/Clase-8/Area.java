public class Area {
    //Hacer una función que calcule el área de un cuadrado. Al llamarla debe devolver el área del cuadrado.
    //Hacer una función que calcule el área de un triángulo. Al llamarla debe devolver el área del triángulo.
    public static void main(String[] args) {
        double square = getSquareArea(8.2);
        double triangle = getTriangleArea(3.5, 4.2);
        System.out.println("Area of a square: " + square);
        System.out.println("area of a triangle: " + triangle);

    }

    public static double getSquareArea(double feet) {
        return feet * 4;
    }

    public static double getTriangleArea(double base, double height) {
        return (base * height) / 2;
    }
}
