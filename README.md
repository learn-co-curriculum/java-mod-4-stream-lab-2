# Stream Lab 2

## Instruction

### Task1

Edit the `printStringLengths` method in Task1.java:
 
- Create a stream from the parameter list.
- Map each string to its length (try to use a method reference).
- Print the resulting stream.

```java
import java.util.List;
import java.util.Arrays;

public class Task1 {

    //map each string to its length, then print the mapped stream elements
    //stream --> map --> forEach
    public static void printStringLengths(List<String> stringList) {
        
        
    }

    public static void main(String[] args) {
        printStringLengths(Arrays.asList("John", "Joe", "Al", "Kate" ));
    }
}
```

Run the program and confirm the output shows the length of each string:

```text
4
3
2
4
```

Run the Junit test class `Task1Test` to confirm your implementation.


### Task2

Edit the `printAbsolute` method in Task2.java:

- Create a stream from the parameter list.
- Map each string to its absolute value (try to use a method reference).
- Print the resulting stream.

```java
public class Task2 {

    //map each integer to its absolute value, then print mapped stream elements
    //stream --> map --> forEach
    public static void printAbsolute(List<Integer> numberList) {
         
        
    }

    public static void main(String[] args) {
        printAbsolute(Arrays.asList(6,2,-7,-3));
    }
}
```

Run the program and confirm the output shows the absolute value for each list element:

```text
6
2
7
3
```

Run the Junit test class `Task2Test` to confirm your implementation.


### Task3

Edit the `sumAbsolute` method in Task3.java:

- Create a stream from the parameter list.
- Map each string to its absolute value.
- Reduce the stream to compute the sum of values (try to use a method reference).
- Return the sum.

```java
import java.util.Arrays;
import java.util.List;

public class Task3 {

    //return the sum of the absolute values using map and reduce
    //stream --> map --> reduce
    public static int sumAbsolute(List<Integer> nums) {
        return 0; //replace with your solution
    }

    public static void main(String[] args) {
        int sum = sumAbsolute(Arrays.asList(6,2,-7,-3));
        System.out.println(sum);  //18
    }
}
```

Run the program and confirm the output is the sum of the absolute values:

```text
18
```

Run the Junit test class `Task3Test` to confirm your implementation.
