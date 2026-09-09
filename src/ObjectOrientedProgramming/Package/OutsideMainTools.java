package ObjectOrientedProgramming.Package;

import ObjectOrientedProgramming.Package.Tools.*;

/*
    Package:- In java a package is a namespace used to organize related class, Interface, enum and avoid
    sub-packages. It helps avoid naming conflicts and makes code easier to maintains
*/
public class OutsideMainTools {
    public static void main(String args[]) {
        InsideTools1 obj1 = new InsideTools1();
        obj1.show();
    }
}
