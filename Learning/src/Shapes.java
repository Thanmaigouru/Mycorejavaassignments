public interface Shapes {
    double calculateArea(double length , double breadth);


}

class RectangleShape implements Shapes{

    public double calculateArea(double length , double breadth){

        return length*breadth;

    }
}

class CircleShape implements Shapes{

    public double calculateArea(double radius,double radi){

        return 3.14*radius*radius;
    }
}