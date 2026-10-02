package ObjectOrientedProgramming.StreamAPI;

import java.util.Arrays;
import java.util.List;

/*\
    A method reference is a shorter way of writing a lambda expression when the lambda's only job is to call an existing method.

    The basic syntax is:
        ClassName::methodName

      ->I want to refer to the method named methodName inside ClassName.

    The :: is called the method reference operator.

    A method reference is not a replacement for every lambda. It is useful when the lambda simply calls an existing method.

    Example with filter()
        Suppose:
        List<String> names =
                Arrays.asList("Ravi", "", "John", "");

        You want to remove empty strings.

        Lambda:
        List<String> result = names.stream()
                .filter(name -> !name.isEmpty())
                .toList();

        Here, however, the lambda contains:
        !name.isEmpty()
        The ! means additional logic is being performed, so you cannot simply replace it with:

        String::isEmpty
        because that would do the opposite:

        .filter(String::isEmpty)
        would select empty strings.
 */
public class MethodReference {
    public static void main(String args[]){
        List<String> names= Arrays.asList("Jarvis","John","Friday","Thor");

        List<String> uName=names.stream()
                .map(String::toUpperCase)
                .toList();

        uName.forEach(System.out::println);
    }
}
