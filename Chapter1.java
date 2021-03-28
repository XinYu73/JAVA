package tes;
import java.util.List;
//An Introduction to Java and Its History
public class Chapter1 {
//Section 1 Who This Book Is For
// Who wants to make full use of this language
public static void main(String[]args)
{
    List<String> items=List.of("1", "a", "2", "a", "3", "a");
    items.forEach(item->{
        if (item.equals("a"))
        {
        System.out.println("A");
         }
        else
        {
            System.out.println("Not A");
        }
    });
    //Java's advantages
    //security
    //automatic memory management
    //support for multithreaded execution
    //portability
    //Why Is Java Portable
    //Java is a high-level programming
    //JVM=platform-independent execution environment hat converts Java code into machine language and executes it
    //
}
}
