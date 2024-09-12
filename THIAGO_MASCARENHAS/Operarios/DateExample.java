/* 

//if else
int age = 18;
if (age >= 18) {
    System.out.println("You are eligible to vote.");
} else {
    System.out.println("You are not eligible to vote.");
}
--------------------------------------------------------
//switch - case
String day = "Tuesday";
switch (day) {
    case "Monday":
        System.out.println("Today is Monday.");
        break;
    case "Tuesday":
        System.out.println("Today is Tuesday.");
        break;
    default:
        System.out.println("Unknown day.");
}

--------------------------------------------------------

//loop for
for (int i = 0; i < 5; i++) {
    System.out.println("Iteration: " + i);
}
--------------------------------------------------------


//Herança
class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public void bark() {
        System.out.println(name + " is barking.");
    }
}

Dog dog = new Dog("Buddy");
dog.eat(); // Buddy is eating.
dog.bark(); // Buddy is barking.


--------------------------------------------------------



//classes
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

Person person = new Person("John Doe", 30);
person.displayDetails(); // Name: John Doe, Age: 30


--------------------------------------------------------


//date
//Neste exemplo, criamos um objeto Date para obter a data e hora atuais.
//Em seguida, formatamos a data usando a classe SimpleDateFormat para exibi-la em um formato específico.
//A saída será semelhante a esta:
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println("Current Date: " + currentDate);

        // Using Date with SimpleDateFormat
        SimpleDateFormat formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
        String formattedDate = formatter.format(currentDate);
        System.out.println("Formatted Date: " + formattedDate);
    }
}
Current Date: Tue Feb 14 15:26:18 PST 2023
Formatted Date: Tue, 14 Feb 2023 15:26:18 PST
//tradução
Data atual: terça-feira, 14 de fevereiro, 15:26:18 PST de 2023
Data formatada: terça-feira, 14 de fevereiro de 2023 15:26:18 PST
*/ 
