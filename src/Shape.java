interface Shape {
    void shapeName();
}

class Circle implements Shape{
    @Override
    public void shapeName() {
        System.out.println("Circle");
    }
}

class Triangle implements Shape{
    @Override
    public void shapeName(){
        System.out.println("Triangle");
    }
}
class Cube implements Shape{
    @Override
    public void shapeName() {
        System.out.println("Cube");
    }
}

class Rectangle implements Shape{
    @Override
    public void shapeName() {
        System.out.println("Rectangle");
    }
}
class Star implements Shape{

    @Override
    public void shapeName() {
        System.out.println("Star");
    }
}


class Print{
    public void nameShape(Shape shape){

        shape.shapeName();
    }
}

class PrintOut{
    public static void main(String[] args) {

        new Print().nameShape(new Star());
        new Print().nameShape(new Cube());
        new Print().nameShape(new Rectangle());
        new Print().nameShape(new Triangle());
        new Print().nameShape(new Circle());
        new Print().nameShape(new Star());
    }
}
