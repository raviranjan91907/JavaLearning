package ObjectOrientedProgramming.Interface;
/*
 In java Interface can be categorized across to dimensions:
 ->method structure(how methods and behaviors are declared) and
 ->special design categories(how they are defined and scoped);

 */

/*
    By Method Structure
    1.Normal(Standard) interface
    An interface that contains multiple abstract methods representing a contract that
    an implementing class must fullfill
 */
interface Vehicle {
    void startEngine();
    void stopEngine();
    void accelerate(int speed);
}

/*
    Functional Interface(Single Abstract Mthod/SAM)
    Contains exactly one abstract method.It can also contain any number of default or
    Static methods. They serve aas target type fo lambda expression and method references
 */
@java.lang.FunctionalInterface
interface demoFunctionalInterface{
    void show();// Only one abstract method
}


/*
    3. Marker (Tagging) Interface
    An interface with no methods, fields, or constants.
    It serves as metadata or a "tag" informing the JVM or a framework that the
    implementing class has a special capability.


    ->Most famous built-in examples: java.io.Serializable, java.lang.Cloneable, java.util.RandomAccess.

    ->Modern Java generally favors annotations (like @Entity or @Deprecated) over marker interfaces for metadata,
    though marker interfaces still exist for type checking via instanceof.

 */
// Marker interface - body is empty
interface Deletable {
}

public class TypeOfInterface {
}
