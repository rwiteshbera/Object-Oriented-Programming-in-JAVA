# Object-Oriented Programming in Java

Object means a real-world entity such as car, pen, table, book, chair etc. **Object-Oriented Programming** is a methodology or paradigm to design a program using classes and objects. It simplifies software development and maintenance by providing some concepts:

[Class & Object](https://www.notion.so/Class-Object-8a01f9b1f56c4a9fbbb5bac24df8a72d)

[Inheritance](https://www.notion.so/Inheritance-ae468602a10f43e99192d5615dc565da)

[Polymorphism](https://www.notion.so/Polymorphism-7bb914f041a84386a2097267e921f6dd)

[Abstraction](https://www.notion.so/Abstraction-e0074690cdec4582bec12b7466a4f1d3)

[Encapsulation](https://www.notion.so/Encapsulation-650b5b1471524e1f9806ec870747dea0)

### 1️⃣ Class & Object

**Class:** A class is a template or blueprint of an object which have common properties. It is a logical entity and doesn't have any physical existence.

**Object:** An Object can be defined as an instance of a class. An object contains an address and takes up some space in memory.

An object has three characteristics:

- **State:** represents the data (value) of an object.
- **Behaviour:** represents the behaviour (functionality) of an object such as deposit, withdrawal, etc.
- **Identity:** An object identity is typically implemented via a unique ID. The value of the ID is not visible to the external user. However, it is used internally by the JVM to identify each object uniquely.

'**new' keyword in Java:** The new keyword is used to allocate memory at runtime. All objects get memory in the Heap memory area. It is important to understand that new allocates memory for an object during run time.

**'dot' operator in Java:** The dot operator links the name of the object with the name of an instance variable. Although commonly referred to as the dot operator, the formal specification for Java categorizes the . as a separator.

**Parameter and variable**

```java
int square(int i){
		return i * i;
}
```

A parameter is a variable defined by a method that receives a value when the method is called. For example, in `square( int i)`, **i** is a parameter. An argument is a value that is passed to a method when it is invoked. For example, `square(100)` passes 100 as an argument. Inside `square( )`, the parameter **i** receives that value.

**Creating Class**

```java
class Student {
    int roll;
    String name;
}
```

**Creating an object of class**

```java
 Student obj = new Student();
```

The left-hand side declares `obj` as a reference to an object of type `Student`. At this point, `obj` does not yet refer to an actual object. The right-hand side allocates an object and assigns a reference to it to `obj`. After the right-hand side executes, you can use `obj`. In reality, `obj` simply holds, in essence, the memory address of the actual `Student` class. The key to Java’s safety is that you cannot manipulate references as you can actual pointers. Thus, you cannot cause an object reference to point to an arbitrary memory location or manipulate it like an integer.

```java
classname class-var = new classname ( );
```

Here, `class-var` is a variable of the class type being created. The `classname` is the name of the class that is being instantiated. The class name followed by parentheses specifies the constructor for the class. A constructor defines what occurs when an object of a class is created.

```java
Box b1 = new Box();
Box b2 = b1;
```

`b1` and `b2` will both refer to the same object. The assignment of `b1` to `b2` did not allocate any memory or copy any part of the original object. It simply makes `b2` refer to the same object as does `b1`. Thus, any changes made to the object through `b2` will affect the object to which `b1` is referring since they are the same object. When you assign one object reference variable to another object reference variable, you are not creating a copy of the object, you are only making a copy of the reference.

**Accessing class members through the reference variable**

```java
class Student {
    int roll;
    String name;
}
public class Main {
    public static void main(String[] args) {
        Student obj = new Student();
        System.out.println(obj.roll); // 0
        System.out.println(obj.name); // null
    }
}
```

### **3 Ways to initialize an object**

- Initialization through the reference variable

```java
class Student {
    int roll;
    String name;
}
public class Main {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.roll = 100;
        obj.name = "Rwitesh";

        System.out.println(obj.roll); // 100
        System.out.println(obj.name); // Rwitesh
    }
}
```

- Initialization through method

```java
class Student {
    int roll;
    String name;

    void insertData (int rollNo, String myName) {
        roll = rollNo;
        name = myName;
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.insertData(55, "Ayan");
        System.out.println(s1.roll); // 55
        System.out.println(s1.name); // Ayan
    }
}
```

- Initialization through constructor

```java
class Student {
    int roll;
    String name;

    Student (int rollNo, String myName) {
        roll = rollNo;
        name = myName;
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(100, "Rwitesh");
        System.out.println(s1.roll); // 100
        System.out.println(s1.name); // Rwitesh
    }
}
```

### **Constructor**

         In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling the constructor, memory for the object is allocated in the memory. It is a special type of method which is used to initialize the object. Every time an object is created using the new() keyword, at least one constructor is called. It calls a **default constructor** if there is no constructor available in the class. In such a case, the Java compiler provides a default constructor by default.

**How constructors are different from methods in Java?**

- Constructors must have the same name as the class within which it is defined while it is not necessary for the method in java.
- Constructors do not return any type while method(s) have the return type or **void** if does not return any value.
- Constructors are called only once at the time of Object creation while method(s) can be called any number of times.

**There are two types of constructors in Java:**

1. Default constructor (no-arg constructor)
2. Parameterized constructor

**No-argument constructor or Default Constructor:** A constructor that has no parameter is known as the default constructor. If we don’t define a constructor in a class, then the compiler creates a **default constructor(with no arguments)** for the class. And if we write a constructor with arguments or no-arguments then the compiler does not create a default constructor.

```java
class Solution {
    Solution() {
        System.out.println("Default constructor is called");
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution(); // Default constructor is called
    }
}
```

**Parameterized Constructor**

A constructor that has parameters is known as parameterized constructor. If we want to initialize fields of the class with our own values, then use a parameterized constructor.

```java
class Solution {
    String name;
    int id;
    Solution(String n, int i) {
        name = n;
        id = i;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution("ABCD", 85);
        System.out.println(s.name); // ABCD
        System.out.println(s.id); // 85
    }
}
```

*There are no “return value” statements in the constructor, but the constructor returns the current class instance. We can write ‘return’ inside a constructor.*

**Constructor overloading**

In Java, a constructor is just like a method but without a return type. It can also be overloaded like Java methods.

Constructor overloading in Java is a technique of having more than one constructor with different parameter lists. They are arranged in a way that each constructor performs a different task. They are differentiated by the compiler by the number of parameters in the list and their types.

```java
class Solution {
    int num1;
    int num2;
    Solution() {
        System.out.println("Constructor without any parameter");
    }

    Solution (int n) {
        num1 = n;
        num2 = n;
        System.out.println("Constructor with one parameter");
    }
    Solution (int m, int n) {
        num1 = m;
        num2 = n;
        System.out.println("Constructor with one parameter");
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s1 = new Solution(); // Constructor without any parameter
        Solution s2 = new Solution(1); // Constructor with one parameter
        Solution s3 = new Solution(1,2); // Constructor with one parameter
    }
}
```

### Packages

Packages are containers for classes. They are used to keep the class namespace compartmentalized. For example, a package allows you to create a class named List, which you can store in your own package without concern that it will collide with some other class named list stored elsewhere. Packages are stored in a hierarchical manner and are explicitly imported into new class definitions.

The package is both a naming and a visibility control mechanism. Java uses file system directories to store packages. For example, the .class files for any classes you declare to be part of `MyPackage` must be stored in a directory called `MyPackage`. Remember that case is significant, and the directory name must match the package name exactly.

A package hierarchy must be reflected in the file system of your Java development system.
For example, a package declared as

```java
package java.awt.image;
```

needs to be stored in `java\awt\image` in a Windows environment. Be sure to choose your package names carefully.
You cannot rename a package without renaming the directory in which the classes are stored.

How does the Java run-time system know where to look for packages that you create? The answer has three parts.

- First, by default, the Java run-time system uses the current working directory as its starting point.
Thus, if your package is in a subdirectory of the current directory, it will be found.
- Second, you can specify a directory path or paths by setting the CLASSPATH environmental variable.
- Third, you can use the -classpath option with java and javac to specify the path to your classes.

When a package is imported, only those items within the package declared as the public will be available to non-subclasses
in the importing code.

### Static Keyword

The **static keyword** in Java is used for memory management mainly. We can apply static keywords with variables, methods, blocks and nested classes. The static keyword belongs to the class than an instance of the class.

The static can be:

1. Variable (also known as a class variable)
2. Method (also known as a class method)
3. Block
4. Nested class

When a member is declared static, it can be accessed before any objects of its class are created,
and without reference to any object. You can declare both methods and variables to be static.
The most common example of a static member is main( ). main( ) is declared as static because it must be called before any objects exist. The static method in Java is a method that belongs to the class and not to the object.

A static method can access only static data. It cannot access non-static data (instance variables)
A non-static member belongs to an instance. It's meaningless without somehow resolving which instance of a class you are talking about. In a static context, you don't have an instance, that's why you can't access a non-static member without explicitly mentioning an object reference.
In fact, you can access a non-static member in a static context by specifying the object reference explicitly :

```java
public class Human {
		String message = "Hello World";

public static void display(Human human){
    System.out.println(human.message);
}

public static void main(String[] args) {
    Human kunal = new Human();
    kunal.message = "Kunal's message";
    Human.display(kunal);
	}
}
```

- A static method can call only other static methods and cannot call a non-static method from it.
- A static method can be accessed directly by the class name and doesn’t need any object.
- A static method cannot refer to "this" or "super" keywords in any way.

### 1. Java static variable

**Program of the counter without static variable**

```java
class Counter{  
		int count=0;//will get memory each time when the instance is created  
  
		Counter(){  
				count++;//incrementing value  
				System.out.println(count);  
		}  
  
public static void main(String args[]){  
			//Creating objects  
			Counter c1=new Counter(); // 1
			Counter c2=new Counter(); // 1
			Counter c3=new Counter(); // 1
	}  
}
```

In this example, we have created an instance variable named count which is incremented in the constructor. Since the instance variable gets the memory at the time of object creation, each object will have a copy of the instance variable. If it is incremented, it won't reflect other objects. So each object will have the value 1 in the count variable.

**Program of the counter by static variable**

As we have mentioned above, a static variable will get the memory only once, if any object changes the value of the static variable, it will retain its value.

```java
class Counter2{  
		static int count=0;//will get memory only once and retain its value  
  
		Counter2(){  
		count++;//incrementing the value of static variable  
		System.out.println(count);  
	}  
  
public static void main(String args[]){  
		//creating objects  
		Counter2 c1=new Counter2();  
		Counter2 c2=new Counter2();  
		Counter2 c3=new Counter2();  
	}  
}
```

### **2. Java static method**

If you apply static keywords with any method, it is known as the static method.

- A static method belongs to the class rather than the object of a class.
- A static method can be invoked without the need for creating an instance of a class.
- A static method can access static data members and can change the value of it.

```java
class Geek {
	public static String geekName = "";
	public static void geek(String name)
	{
		geekName = name;
	}
}

class GFG {
	public static void main(String[] args) {
		// Accessing the static method geek()
		// and field by class name itself.
		Geek.geek("vaibhav");
		System.out.println(Geek.geekName); // vaibhav

		// Accessing the static method geek()
		// by using Object's reference.
		Geek obj = new Geek();
		obj.geek("mohit");
		System.out.println(obj.geekName); // mohit
	}
}
```

**When to use static methods?**

1. When you have code that can be shared across all instances of the same class, put that portion of code into a static method.
2. They are basically used to access the static field(s) of the class.

### 3. Java static block

- Is used to initialize the static data member.
- It is executed before the main method at the time of classloading.

```java
class Solution {
    static {
        System.out.println("Static block invoked");
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution(); // Static block invoked
    }
}
```

### 2️⃣ Inheritance

       **Inheritance in Java** is a mechanism in which one object acquires all the properties and behaviors of a parent object.

```java
class Home {
    int a = 10;
    public void show() {
        System.out.println("I am in Home Class!");
    }
}

class School extends Home {
    public void display() {
        System.out.println("I am in School Class!");
    }
}

public class Main {
    public static void main(String[] args) {
        School sc = new School();
        sc.show(); // I am in Home Class!
        System.out.println(sc.a); // 10
    }
}
```

The **`extends` keyword** is used to indicate that you are making a new class that derives from an existing class. The meaning of "extends" is to increase the functionality.

### Types of Inheritance

![Inheritance.png](Object-Oriented%20Programming%20in%20Java%2079a9eb0653d948a7a0941109e0bf2dd2/Inheritance.png)

1. **Single Inheritance**
    
    In single inheritance, subclasses inherit the features of one superclass.
    

```java
class A {
    public void print_A() {
        System.out.println("I am from Class A!");
    }
}

class B extends A {
    public void print_B() {
        System.out.println("I am from Class B!");
    }
}

public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.print_A(); // I am from Class A!
    }
}
```

1. **Multi-level Inheritance**
    
    In Multilevel Inheritance, a derived class will be inheriting a base class and as well as the derived class also act as the base class to other classes.
    

```java
class A {
    public void print() {
        System.out.println("I am from Class A!");
    }
}

class B extends A {

}

class C extends B {

}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.print(); // I am from Class A
    }
}
```

1. **Hierarchical Inheritance**
    
     When two or more classes inherit a single class, it is known as hierarchical inheritance.
    

```java
class A {
    public void print_A() { System.out.println("Class A"); }
}
 
class B extends A {
    public void print_B() { System.out.println("Class B"); }
}
 
class C extends A {
    public void print_C() { System.out.println("Class C"); }
}
 
class D extends A {
    public void print_D() { System.out.println("Class D"); }
}
 
// Driver Class
public class Test {
    public static void main(String[] args)
    {
        B obj_B = new B();
        obj_B.print_A(); // Class A
 
        C obj_C = new C();
        obj_C.print_A(); // Class A
 
        D obj_D = new D();
        obj_D.print_A(); // Class A
    }
}
```

1. **Multiple Inheritance (Through Interfaces)**
    
    In Multiple inheritances, one class can have more than one superclass and inherit features from all parent classes. Please note that Java does **not** support multiple inheritances with classes. In java, we can achieve multiple inheritances only through interfaces.
    

```java
interface One {
    public void print_geek();
}

class Two {
    public void print_for() {
        System.out.println("for");
    }
}

class Child extends Two implements One {
    @Override
    public void print_geek() {
        System.out.println("Geeks");
    }
}
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.print_geek(); // Geeks
    }
}
```

**5. Hybrid Inheritance(Through Interfaces)**

 ****It is a mix of two or more of the above types of inheritance. Since java doesn’t support multiple inheritances with classes, hybrid inheritance is also not possible with classes. In java, we can achieve hybrid inheritance only through interfaces.

**Important facts about inheritance in Java**

- **Default superclass**: Except Object class, which has no superclass, every class has one and only one direct superclass (single inheritance). In the absence of any other explicit superclass, every class is implicitly a subclass of the Object class.
- **Superclass can only be one:** A superclass can have any number of subclasses. But a subclass can have only **one** superclass. This is because Java does not support multiple inheritance with classes. Although with interfaces, multiple inheritances are supported by java.
- **Inheriting Constructors:** A subclass inherits all the members (fields, methods, and nested classes) from its superclass. Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the subclass.
- **Private member inheritance:** A subclass does not inherit the private members of its parent class. However, if the superclass has public or protected methods(like getters and setters) for accessing its private fields, these can also be used by the subclass.

### Super keyword in Java

The **super** keyword in Java is a reference variable that is used to refer to the immediate parent class object. Whenever you create the instance of a subclass, an instance of parent class is created implicitly which is referred to by the `super` reference variable.

**Usage of Java super Keyword**

1. super can be used to refer to the immediate parent class instance variable.
2. super can be used to invoke the immediate parent class method.
3. super() can be used to invoke immediate parent class constructor.

**1. Use of super with variables:**

```java
/* Base class vehicle */
class Vehicle
{
	int maxSpeed = 120;
}

/* sub class Car extending vehicle */
class Car extends Vehicle
{
	int maxSpeed = 180;

	void display()
	{
		/* print maxSpeed of base class (vehicle) */
		System.out.println("Maximum Speed: " + super.maxSpeed);
	}
}

/* Driver program to test */
class Test
{
	public static void main(String[] args)
	{
		Car small = new Car();
		small.display(); // Maximum Speed: 120
	}
}
```

**2. Use of super with methods:**

```java
/* Base class Person */
class Person
{
	void message()
	{
		System.out.println("This is person class");
	}
}

/* Subclass Student */
class Student extends Person
{
	void message()
	{
		System.out.println("This is student class");
	}

	// Note that display() is only in Student class
	void display()
	{
		// will invoke or call current class message() method
		message();

		// will invoke or call parent class message() method
		super.message();
	}
}

/* Driver program to test */
class Test
{
	public static void main(String args[])
	{
		Student s = new Student();

		// calling display() of Student
		s.display(); 
		// This is student class
		//  This is person class
	}
}
```

**3**. **Use of super with constructors:**

```java
/* superclass Person */
class Person
{
	Person()
	{
		System.out.println("Person class Constructor");
	}
}

/* subclass Student extending the Person class */
class Student extends Person
{
	Student()
	{
		// invoke or call parent class constructor
		super();

		System.out.println("Student class Constructor");
	}
}

/* Driver program to test*/
class Test
{
	public static void main(String[] args)
	{
		Student s = new Student();
		/*
			Person class Constructor
			Student class Constructor
		*/
	}
}
```