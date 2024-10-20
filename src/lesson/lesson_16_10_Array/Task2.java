package lesson.lesson_16_10_Array;

public class Task2 {
    public static void main(String[] args) {
        Pen pens[] = new Pen[]{
                new Pen(),
                new Pen(),
                new Pen()
        };

        pens[0].setColor("Green");
        pens[1].setColor("Red");
        pens[2].setColor("Black");

        for (int i = 0; i < pens.length; i++) {
            System.out.println(pens[i]);
        }
    }

//    public static void main(String[] args) {
//        Pen green = new Pen();
//        Pen red = new Pen();
//        Pen black = new Pen();
//
//        Pen[] pens = new Pen[]{
//                green,
//                red,
//                black
//        };
//
//        for (int i = 0; i < pens.length; i++) {
//            System.out.println(pens[i]);
//        }
//
//        pens[0].setColor("green");
//        pens[1].setColor("red");
//        pens[2].setColor("black");
//
//        for (int i = 0; i < pens.length; i++) {
//            System.out.println(pens[i].getColor());
//        }
//    }
}
