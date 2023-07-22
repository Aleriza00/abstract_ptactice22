import practice.A;
import practice.B;
import practice.Bank;
import practice.C;
import practice2.Circle;
import practice2.Shape;
import practice2.Triangle;

public class Main {
    public static void main(String[] args) {
//        Animal cat = new Cat();
//        cat.cat();
//        Animal dog =new Dog();
//        dog.dog();

//        Bank a = new A();
//        Bank b= new B();
//        Bank c =new C();
//        a.getBAlance();
//        b.getBAlance();
//        c.getBAlance();

        Shape circle = new Circle(3.14,4);
        Shape triangle = new Triangle(3,3,4);
        circle.calculateArea();
        circle.calculatePerimeter();
        triangle.calculatePerimeter();
        triangle.calculateArea();
    }
}