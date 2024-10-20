package lesson.lesson_15_10.inner_class;

public class Main {
    public static void main(String[] args) {
        //        inner class
        OuterClass outerClass = new OuterClass();
        System.out.println(outerClass.x);
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(innerClass.y);
        System.out.println(outerClass.x + innerClass.y);
        //        static inner class

//        OuterStaticClass outerClass = new OuterStaticClass();
//        System.out.println(outerClass.x);
//        OuterStaticClass.InnerClass = new OuterStaticClass.InnerClass();
//        System.out.println(innerClass.y);
    }
}
