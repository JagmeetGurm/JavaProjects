package hello.world.app;

/**
 *
 * @author Jagmeet
 */
import java.io.*;
import java.util.Date;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Employ{
    //this public varible will also be accessible to subclasses.
    public String name;
    //this variable will only be available to class methods.
    private double salary;
    public Employ(String name){
        this.name=name;
    }
    public void setSalary(double empSal){
        salary=empSal;
    }
    public void printEmp(){
        System.out.println("name: "+ name);
        System.out.println("salary: "+salary);
    }
}
public class Employee {
    String name;
    int age;
    double salary;
    String designation;
    int xClass;
    
    public Employee(String name){
        this.name=name;
        xClass=10;
    }
    public void empAge(int ag){
        age=ag;
        
    }
    public void empDesign(String design){
        this.designation=design;
    }
    public void empSalary(double sal){
        salary=sal;
    }
    public void print(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("salary: "+salary);
        System.out.println("des: "+designation);
    }
    public int[] printArray(int[] array){
        int[] result=new int[array.length];
    for(int i=0; i<array.length; i++){
    System.out.println("array["+i+"]: "+array[i]);
    result[i]=array[i];
    }
    return result;
    }
    public void passByValue(int a, int b){
        int c=a;
        a=b;
        b=c;
    }
    public void printMax(int... numbers){
        if(numbers.length==0)
            System.out.println("no arguments passed");
        int result=numbers[0];
        for(int i=1;i<numbers.length; i++)
        {  if(numbers[i]>result)
                result=numbers[i];
        }
        System.out.println("max value is "+ result);
    }
/*public void readFile(String fileName) throws IOException
    {
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("input.txt");
         out = new FileOutputStream("output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
    */
public static void main(String args[])throws IOException {
Employ emp1=new Employ("Jag");
Employee emp2=new Employee("Jim");

emp1.setSalary(1000);
emp1.printEmp();
Test2 ternaryTest=new Test2(30);


Vehicle car1=new Car();
boolean result=car1 instanceof Car;
//should return true;
System.out.println(result);
result=car1 instanceof Vehicle;
//should return true;
System.out.println(result);

//while loop
int x=20;
//to print x from 20 t0 30(inlcuding 30)
while(x<=30){
    System.out.println("value of x: "+x +"\n");
    x++;
    
}

//do while loop
int y=20;
//even though the while condition is false, it still gets executed atleast ones because condition is checked later
do{
    System.out.println("value of y: "+y);
    y++;
}while(y<20);

//the For loop
for(int i=0; i<10; i++){
    System.out.println(i);
}

//Enhanced loops: used mainly for arrays
int [] numbers={10,20,30,40};
for (int a: numbers){
    //using of print instead of println
    //print prints the output in same line
    System.out.print(a);
    System.out.print(", ");
    System.out.println("");
}

//break keyword
//break is used to exit the loop when the condition is met
for( x=0; x<5; x++)
{if(x==3)
    break;

System.out.print(x+", ");
    }

//continue keyword
//continue causes the loop to jump to the next iteration
for(x=10; x<15; x++)
{  if(x==13)
        continue;
//13 wouldn't get printed
System.out.print("\n");
System.out.print(x+", ");

}

//if..else 
int num2=20;
if(num2<20)
    System.out.println("value of num2< 20");
else if(num2>15)
    System.out.println("value of num2>15");
else if(num2==20)
    System.out.println("value of num2 is 20");


//the switch statement
//break to exist the switch block when condition is met
char grade='B';
switch(grade){
    case 'A':
System.out.println("Excellent!");
        break;
    case 'B':
System.out.println("Great");
        break;
    case 'C':
System.out.println("Good");
        break;
    default:
System.out.println("Try again");
}

//using wrapping classes
//when we use primitive data types as objects
//Boxing and unboxing

Integer var=5;//boxes int to an Integer object
var=var+20; //unboxes the Integer to an int
System.out.println(var);


//strings are objects in Java

//simple way to create a string(object)
String myString="hello guys!";
//Another way of creating Strings
char []charArray={'h', 'e', 'l', 'l', 'o'};
System.out.println(charArray); //prints hello
String helloString=new String(charArray);
System.out.println("1st string: "+ myString); //
System.out.println("2nd string: "+ helloString);//prints hello also

//calculating the length of the string
System.out.println("length of myString: "+myString.length());//includes white space as well


//Declaring Arrays
// 1st method
 int array1[] = new int[10]; //
 //2nd method : the preferred way of declaring(using reference)
int[] array2=new int[10];
int[] array3; //3rd method
//the preferred way of declaring(direct assignment)
int array4[]={10,20,30};//4th method 

//accessing elements of array
for(int i=0;i<array4.length; i++){
    System.out.println("value of array element "+ i+":"+array4[i]);
}
//enhanced loop ; used in arrays to traverse them
for(int element: array4){
    System.out.println(element);//traverse entire array without using an indexS
}

Employee myEmployee=new Employee("jim"); //new object of Employee type created
int[] returnedArray=myEmployee.printArray(array4); //array4 an array has been passed

for(int i=0;i<returnedArray.length; i++)
    System.out.println(returnedArray[i]);

//Getting the current date and time
Date date1=new Date();
System.out.println(date1.toString());
String reg="dog";
String input="The dog says meow. All dogs says meow.";
String replace="cat";
Pattern p=Pattern.compile(reg);
Matcher m=p.matcher(input);
input=m.replaceAll(replace);
System.out.println(input);
for (int i=0; i<args.length; i++){
    System.out.println("args["+i+"]: " +args[i]);
}
//creating the instance of class 
MyClass myClass=new MyClass(20);
System.out.println(myClass.x); //accesssing the variable directly.

//callling pass by value
int a3=5, b3=4;
emp2.passByValue(a3,b3);
System.out.println("value of a3: "+a3);
System.out.println("value of b3: "+b3);

//variable no. of arguments

emp2.printMax(2, 4, 5 ,12, 10);
emp2.printMax(4,5,1);
//emp2.readFile("jim.txt");

FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("C:\\Users\\Jagmeet\\Documents\\NetBeansProjects\\Hello World App\\src\\hello\\world\\app\\input.txt");
         out = new FileOutputStream("C:\\Users\\Jagmeet\\Documents\\NetBeansProjects\\Hello World App\\src\\hello\\world\\app\\output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
           //  System.out.println(c);
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   





//character streaming using FileReader, FileWriter

FileReader in2 = null;
      FileWriter out2 = null;

      try {
         in2 = new FileReader("C:\\Users\\Jagmeet\\Documents\\NetBeansProjects\\Hello World App\\src\\hello\\world\\app\\input.txt");
         out2 = new FileWriter("C:\\Users\\Jagmeet\\Documents\\NetBeansProjects\\Hello World App\\src\\hello\\world\\app\\output.txt");
         
         int c;
         while ((c = in2.read()) != -1) {
            out2.write(c);
         }
      }finally {
         if (in2 != null) {
            in2.close();
         }
         if (out2 != null) {
            out2.close();
         }
      }
      
      
      //Standard input
      InputStreamReader cin = null;

      try {
         cin = new InputStreamReader(System.in);
         System.out.println("Enter characters, 'q' to quit.");
         char c;
         do {
            c = (char) cin.read();
            System.out.print(c);
         } while(c != 'q');
      }finally {
         if (cin != null) {
            cin.close();
         }
      }
      
}

}



//non-public class 
class Test2{
    private int a=10;
    public Test2(int num){
        int b=(a==num)? 5: 20;
        System.out.println("b is: " +b);
        
    }
}
//Abstract class(non-public)
class Vehicle{
}

//Derived Class(non-public)
class Car extends Vehicle{
}   
class MyClass{
    int x;
    MyClass(int i){
            x=i;}
}