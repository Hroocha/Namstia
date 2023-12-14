package p2;

public class Main {
    public static void main(String[] args) {
        int integerVariable;
        boolean booleanVariable;
        char charVariable;
        long longVariable;
        short shortVariable;
        double doubleVariable;
        float floatVariable;
        byte byteVariable;

        integerVariable = 1;
        booleanVariable = true;
        charVariable = 121;
        charVariable = 'y';
        longVariable = Integer.MAX_VALUE+1;
        shortVariable = 3;
        doubleVariable = 3.9;
        floatVariable = 121.9f;
        byteVariable = 16;

        int b;

        //b = (int) booleanVariable;
        b = (int) charVariable;
        b = (int) longVariable;
        b = (int) shortVariable;
        b = (int) doubleVariable;
        b = (int) floatVariable;
        b = (int) byteVariable;

        boolean c;
        //c = (boolean) integerVariable;
        //c = (boolean) doubleVariable;
        //c = (boolean) charVariable;
        //c = (boolean) 1;

        char charCastExample;
        charCastExample = (char) floatVariable;
//        charCastExample = (char) booleanVariable;

        float floatCastExample;
        floatCastExample = (float) Float.MAX_VALUE+1;


        System.out.println(floatCastExample);



    }
}
