# Log Book

## Days 1 & 2 

```java
class myClass {
    
  String s = String.format("Format string content: %.2f %d %s ", 
          myFloat, myInt, myString);
  // then in main or method you can run print as:
  // System.out.println(s);
}
```

Lesson about difference in behavior of & / && and | / || was interesting for me someone coming from Python / Ruby.

## Day 3

```java
import java.util.StringTokenizer;

class Demo_Token {
    public static void main(String[] args){
        StringTokenizer tokens = new StringTokenizer("Hello, World!");

        tokens.asIterator().forEachRemaining(token -> {
            // demo func 
            DoSomethingWithToken(token);
        }); 
        
        int number = Integer.parseInt("8080");
    }
}
```