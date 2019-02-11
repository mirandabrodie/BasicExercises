public class Runner {

    public static void main(String[] args){
        Car mirandaCar = new Car(2018, "Tesla", "Model 3");
        System.out.println(mirandaCar.toString());
        mirandaCar.drive(300);
        System.out.println(mirandaCar.toString());

        Rectangle rect = new Rectangle(10, 10);
        System.out.println(rect.getArea());
        System.out.println(rect.getDiagonal());
        System.out.println(rect.isSquare());
    }

}
