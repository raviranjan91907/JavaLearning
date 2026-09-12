package ObjectOrientedProgramming.WrapperClass;

/*
    WrapperClass is the class which wraps a primitive data type inside an object
    java has 8 primitive data type for which each corresponding wrapper class
    Primitive Data Type	        Wrapper Class
    byte	                    Byte
    short	                    Short
    int	                        Integer
    long	                    Long
    float	                    Float
    double	                    Double
    char	                    Character
    boolean	                    Boolean

    Note:- we need wrapper class because collection require object like ArrayList
*/
public class WrapperClass {
    public static void main(String args[]){
        int num1=8;
        Integer num2=new Integer(8);// this called boxing converting a primitive data type to its corresponding wrapper class
        Integer num=5;//this is called auto-boxing where java automatically convert a primitive data type into its corresponding wrapper class

        int num3=num2.intValue();// this is called unboxing: converting value of wrapper class into its primitive data type
        System.out.println(num3);

        int num4=num2;// this is called auto-unboxing: where java automatically convert value of a wrapper class into its corresponding primitive data type
        System.out.println(num4);


        String str1="12";
        System.out.println(str1+" "+str1.getClass());

        Integer n=Integer.parseInt(str1);
        System.out.println(n+" "+n.getClass());

    }
}
