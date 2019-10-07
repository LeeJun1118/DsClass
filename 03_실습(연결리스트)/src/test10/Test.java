package test10;

public class Test {
    public static void main(String[] args) {


        SimpleList<String> list = new SimpleList<>();

        list.addFirst("Korea");
        list.addFirst("Japan");
        list.addFirst("China");

        System.out.println(list);

        SimpleList<Double> list1 = new SimpleList<>();
        list1.addFirst(2.34);
        list1.addFirst(23.34);
        System.out.println(list1);
    }
}
