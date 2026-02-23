import java.util.Scanner;

public class Main {
    public static void printHello(){
        System.out.print("\nHello FROM FUNCTION!\nThis is my first function in Java!");
    }

    public static int readAge(Scanner in) {
        System.out.print("Enter age: ");
        int age = in.nextInt();
        in.nextLine(); // buffer clear
        return age;
    }

    public static String readName(Scanner in) {
        System.out.print("Enter name: ");
        return in.nextLine();
    }

    public static void printInput(int age, String name){
        System.out.println("Hello " + name + " nice to hear you have "
        + age + " year old");
    }
    public static void main(String[] args){
        System.out.print("Hello!\nThis is my first program in Java!");
       // printHello();
        Scanner in = new Scanner(System.in);

        int age = readAge(in);
        String name = readName(in);

        printInput(age, name);
    }
}