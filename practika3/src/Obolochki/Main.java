package Obolochki;//task 1

public class Main {
    public static void main(String[] args) {

//      task 1.1
        Double d1 = Double.valueOf("3.1415");
        Double d2 = Double.valueOf("2.71");
//      task 1.2
        String s = "4315.3125";
        Double d3 = Double.parseDouble(s);
        System.out.println(d3);
//      task 1.3
        byte b = d1.byteValue();
        short sh = d1.shortValue();
        int i = d1.intValue();
        long l = d1.longValue();
        float f = d1.floatValue();
        double d = d1.doubleValue();
//      task 1.4
        System.out.println(d1);
        System.out.println(d2);
//      task 1.5
        String pi = d1.toString();




    }
}