package DataTypes;

public class DataTypes {
    public static void main(String args[]){
        /*
            There are mainly two type of data types are available in the java
            ->Primitive data types
            ->Non-Primitive data types

            Primitive DataTypes
            DataType	Size	                    Example	                    Used for
            byte	    1 byte	                    byte a = 10;	            Small integers
            short	    2 bytes	                    short a = 1000;	            Integers
            int	        4 bytes	                    int a = 100;	            Whole numbers
            long	    8 bytes	                    long a = 100000L;	        Large whole numbers
            float	    4 bytes	                    float a = 10.5f;	        Decimal numbers
            double	    8 bytes	                    double a = 10.5;	        Precise decimal numbers
            char	    2 bytes	                    char grade = 'A';	        Single characters
            boolean	    JVM-dependent storage	    boolean isJavaFun = true;	true or false

            Non-Primitive DataType :Non-primitive data types are also called reference data types
                                    because variables store a reference to an object.

            Example include:
            String
            Array
            object
            interface
            Enums

         */

        //Example of Primitive DataTypes
        byte a = 10;
        short b = 1000;
        int c = 100000;
        long d = 10000000000L;

        float e = 10.5f;
        double f = 99.99;

        char g = 'A';
        boolean h = true;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        //Example of Non-Primitive DataType
        String name = "Ravi";
        int[] numbers = {10, 20, 30};

        System.out.println(name);

    }
}
