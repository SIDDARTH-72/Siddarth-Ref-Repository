// READ ONLY NOT FOR USE

// package JAVA;

// public class java_work {

// public static void main(String[] args) {

// }

// }

// ------------------------------------------------------
// for(int i=1; i<=5; i++)
// {
// for(int j=1; j<=i; j++)
// {
// System.out.print(j + " ");
// }
// System.out.println(" ");

// -----------------------------------------------------------
// int n = sc.nextInt();
// if( n % 2 != 0){
// System.out.println("Weird");
// }else if(n>=2 && n<=5){
// System.out.println("Not Weird");
// }else if(n>=6 && n<=20){
// System.out.println("Weird");
// }else if(n>=20){
// System.out.println("Weird");

// -----------------------------------------------------------
// int n = sc.nextInt();
// for(int i=1; i<=10; i++)
// {
// System.out.println(n+" x "+i+" = "+ n*i);

// ---------------------------------------------------------
// int t=sc.nextInt();
// for(int i=0;i<t;i++){
// int a = sc.nextInt();
// int b = sc.nextInt();
// int n = sc.nextInt();

// for(int j=0; j<n; j++){
// a = a + (int)Math.pow(2,j) * b;
// System.out.print(a+" ");
// }
// System.out.println(" ");

// ------------------------------------------------------
// try
// {
// long x = sc.nextLong();
// System.out.println(x+" can be fitted in: ");
// if(x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)
// System.out.println("BYTE");
// if(x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)
// System.out.println("BYTE");
// if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)
// System.out.println("BYTE");
// if(x >= Long.MIN_VALUE && x <= Long.MAX_VALUE)
// System.out.println("BYTE");
// }
// catch (Exception e) {
// System.out.println(sc.next()+" can't be fitted anywhere.");

// ------------------------------------------------------------
// int i =1;

// while(sc.hasNext()){
// System.out.println(i+" "+sc.nextLine());
// i++;

// --------------------------------------------------------------
// import java.time.LocalDate;
// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.function.*;
// import java.util.regex.*;
// import java.util.stream.*;
// import static java.util.stream.Collectors.joining;
// import static java.util.stream.Collectors.toList;
// import java.time.LocalDate;

// class result
// {
// public static String findDay(int month, int day, int year)
// {
// LocalDate ld = LocalDate.of(year, month, day);
// return ld.getDayOfWeek().name();
// }
// }

// public class StaticDemo
// {
// public static void main(String[] args) throws IOException
// {
// BufferedReader bufferedReader = new BufferedReader(new
// InputStreamReader(System.in));
// BufferedWriter bufferedWriter = new BufferedWriter(new
// FileWriter(System.getenv("OUTPUT_PATH")));

// String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$",
// "").split(" ");

// int month = Integer.parseInt(firstMultipleInput[0]);

// int day = Integer.parseInt(firstMultipleInput[1]);

// int year = Integer.parseInt(firstMultipleInput[2]);

// String res = result.findDay(month, day, year);

// bufferedWriter.write(res);
// bufferedWriter.newLine();

// bufferedReader.close();
// bufferedWriter.close();
// }

// ---------------------------------------------------------------------
// System.out.println("ENTER YOUR GRADE: ");
// char grade = sc.next().charAt(0);
// switch(grade) {
// case 'A':
// System.out.println("EXCELLENT");
// break;
// case 'B':
// System.out.println("GOOD");
// break;
// case 'C':
// System.out.println("AVERAGE");
// break;
// case 'D':
// System.out.println("FAIL");
// break;
// default:
// System.out.println("WRONG ARGUMENT");

// ----------------------------------------------------------------------------------
// int marks[] = {18, 36, 54, 72};
// for(int i = 0; i < marks.length; i++) {
// System.out.println(marks[i]);

// String cars[] = {"HYUNDAI", "MARUTI", "VOLVO" };
// cars[1] = "WOLKSWAGEN"; --> changes the value of that index.
// for(String i : cars) {
// System.out.println(i);

// int d[][] = {
// {1, 2},
// {3, 4}
// };
// System.out.println(d[0][0])
// -----------------------------------------------------------------------------
// int a = 27;
// do {
// System.out.println(a);
// a++;
// } while (a <= 45)
// -------------------------------------------------------------------------------
// CLASS AND OBJECT:-
// import java.util.Scanner;
// class calc
// {
// int n1;
// int n2;
// int result;

// public void perform()
// {
// result = n1 + n2;
// }
// }
// public class practice_part
// {
// public static void main(String[] args)
// {
// Scanner sc = new Scanner(System.in);
// calc add = new calc();
// add.n1 = sc.nextInt();
// add.n2 = sc.nextInt();
// add.perform();
// System.out.println(add.result);
// }

// -------------------------------------------------------------------------------------
// "this" KEYWORD:-
// class calc
// {
// int n1;
// int n2;
// public calc(int i, int k)
// {
// this.n1 = i;
// this.n2 = k;
// }
// }
// public class practice_part
// {
// public static void main(String[] args)
// {
// calc obj = new calc(4, 5);
// System.out.println(obj.n1);
// System.out.println(obj.n2);
// }

// ---------------------------------------------------------------------------------
// CONSTRUCTOR:-
// class calc
// {
// int i;
// float f;
// public calc()
// {
// i = 7;
// f = 7.2f;
// System.out.println("HI");
// }
// public calc(int k)
// {
// k = i;
// System.out.println("HELLO WORLD");
// }

// }
// public class practice_part
// {
// public static void main(String[] args)
// {
// calc obj = new calc();

// }

// -------------------------------------------------------------------------------
// "static" KEYWORD:-
// import java.util.Scanner;
// class emp
// {
// int id;
// int salaray;
// static String ceo;
// static
// {
// ceo = "Siddarth";
// }
// public emp()
// {
// Scanner sc = new Scanner(System.in);
// id = sc.nextInt();
// salaray = sc.nextInt();
// }
// public void show()
// {
// System.out.println(id + " : " + salaray + " : " + ceo);
// }
// }
// public class practice_part
// {
// public static void main(String[] args)
// {
// emp p = new emp();
// p.show();
// }

// -----------------------------------------------------------------------------
// VARANGS:-
// class calc
// {
// public int add(int...i)
// {
// int sum = 0;
// for(int k : i)
// {
// sum = sum + k;
// }
// return sum;
// }
// }
// public class practice_part
// {
// public static void main(String[] args)
// {
// calc obj = new calc();
// System.out.println(obj.add(1, 2, 4, 5, 9));
// }

// ------------------------------------------------------------------------------
// INHERITANCE:-
// class calc
// {
// public int add(int i, int j)
// {
// return i + j;
// }
// }
// class demo extends calc
// {
// public int sub(int i, int j)
// {
// return i - j;
// }

// -------------------------------------------------------------------------
// "super" KEYWORD:-
// class A
// {
// public A()
// {
// System.out.println("default A");
// }
// public A(int i)
// {
// System.out.println("in int A");
// }
// }
// class B extends A
// {
// public B()
// {
// super(0);
// System.out.println("default B");
// }
// public B(int i)
// {
// super(i);
// System.out.println("in int B");
// }

// ----------------------------------------------------------------------------
// METHOD OVERRIDING:-
// class A
// {
// public void show()
// {
// System.out.println("in A");
// }
// }
// class B extends A
// {
// @Override
// public void show()
// {
// super.show();
// System.out.println("in B");
// }
// }
// ----------------------------------------------------------------------------
// ENCAPSULATION- GETTERS AND SETTERS:-
// class student
// {
// private int rollno;
// private String name;

// public int getRollno() {
// return rollno;
// }
// public void setRollno(int rollno) {
// this.rollno = rollno;
// }
// public String getName() {
// return name;
// }
// public void setName(String name) {
// this.name = name;
// }
// }
// public class practice_part

// public static void main(String[] args)
// {
// Scanner sc = new Scanner(System.in);
// student s = new student();
// System.out.println("Roll no: ");
// s.setRollno(sc.nextInt());
// System.out.println("Name: ");
// s.setName(sc.next());
// System.out.println("Your roll no: " + s.getRollno());
// System.out.println("Your name: " + s.getName());
// }
// -----------------------------------------------------------------------------------
// EXCEPTION HANDLING:-
// try {

// int a[] = new int[];
// int i = 7;
// int j = 0;
// int k = i/j;
// System.out.println(" "+ k);
// }catch (Exception e) {
// System.err.println("Error");
// }finally {
// system.out.println("bye");
// }
// -----------------------------------------------------------------------------------------
// BUFFERED_READER:-

// import java.io.BufferedReader;
// import java.io.InputStreamReader;

// public class hello {

// public static void main(String[] args) throws Exception {

// System.out.println("Enter a number: ");
// BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
// int n = Integer.parseInt(reader.readLine());
// System.out.println(n);
// reader.close();
// }
// }

// int n = 0;
// System.out.println("Enter a number: ");
// BufferedReader br = null;
// try {
// br = new BufferedReader(new InputStreamReader(System.in));
// n = Integer.parseInt(br.readLine());
// } catch (Exception e) {
// System.out.println(e);
// } finally {
// br.close();
// }
// System.out.println(n);

// if there is a try statement there has to finally statement at the end but,
// if we declare the bufferedReader statement in a try statement then no need to
// declare finally.

// int n = 0;
// System.out.println("Enter a number: ");
// try (BufferedReader br = new BufferedReader(new
// InputStreamReader(System.in))) {
// n = Integer.parseInt(br.readLine());
// }
// System.out.println(n);

// User defined errors:

// int i, j;
// i = 8;
// j = 0;

// try {
// int k = i / j;
// if (k == 0)
// throw new SiddarthException("This is not possible!");
// // here SiddarthException is not inbuilt so we need to create the class of
// after which it runs.
// System.out.println(k);
// } catch (Exception e) {
// System.out.println("Error " + e.getMessage());
// }

// ----------------------------------------------------------------------------------------
// MULTI THREADING:-

// class Hi {
// public void show() {
// for (int i = 0; i <= 5; i++) {
// System.out.println("Hi");
// try {
// Thread.sleep(500);
// } catch (Exception e) {
// }
// }
// }
// }
// class Hello2 {
// public void show() {
// for (int i = 0; i <= 5; i++) {
// System.out.println("Hello");
// try {
// Thread.sleep(500);
// } catch (Exception e) {
// }
// }
// }
// }
// public class hello {

// public static void main(String[] args) {
// Hi obj1 = new Hi();
// Hello2 obj2 = new Hello2();
// obj1.show();
// obj2.show();
// }
// }
// here the method 2 has to wait for the completions of method 1.
// But we can avoid that by extending the classes with Thread
// But also we need to keep in mind that in main class we need
// initiate obj.start(); and this start cab only call "run" method.
// So we need to change the name of the method to run.

// class Hi extends Thread {
// public void run() {
// for (int i = 0; i <= 5; i++) {
// System.out.println("Hi");
// try {
// Thread.sleep(1000);
// } catch (Exception e) {
// }
// }
// }
// }

// class Hello2 extends Thread {
// public void run() {
// for (int i = 0; i <= 5; i++) {
// System.out.println("Hello");
// try {
// Thread.sleep(1000);
// } catch (Exception e) {
// }
// }
// }
// }

// public class hello {

// public static void main(String[] args) {
// Hi obj1 = new Hi();
// Hello2 obj2 = new Hello2();

// obj1.start();
// try {
// Thread.sleep(1000);
// } catch (Exception e) {
// }
// obj2.start();
// }
// }
// Runnable Interface:

// class Hi implements Runnable {
// public void run() {
// for (int i = 0; i <= 5; i++) {
// System.out.println("Hi");
// try {
// Thread.sleep(1000);
// } catch (Exception e) {
// }
// }
// }
// }

// class Hello2 implements Runnable {
// public void run() {
// for (int i = 0; i <= 5; i++) {
// System.out.println("Hello");
// try {
// Thread.sleep(1000);
// } catch (Exception e) {
// }
// }
// }
// }

// public class hello {

// public static void main(String[] args) {
// Runnable obj1 = new Hi();
// Runnable obj2 = new Hello2();

// Thread t1 = new Thread(obj1);
// Thread t2 = new Thread(obj2);

// t1.start();
// try {
// Thread.sleep(1000);
// } catch (Exception e) {
// }
// t2.start();
// }
// }

// Using Lambda :

// public class hello {
// public static void main(String[] args) {
// Runnable obj1 = () -> {
// for (int i = 0; i <= 5; i++) {
// System.out.println("Hi");
// try {
// Thread.sleep(1000);
// } catch (Exception e) {
// }
// }
// };
// Runnable obj2 = () -> {
// for (int i = 0; i <= 5; i++) {
// System.out.println("Hello");
// try {
// Thread.sleep(1000);
// } catch (Exception e) {
// }
// }
// };
// Thread t1 = new Thread(obj1);
// Thread t2 = new Thread(obj2);

// t1.start();
// try {
// Thread.sleep(1000);
// } catch (Exception e) {
// }
// t2.start();
// }
// }

// isAlive Method:

// t1.join();
// t2.join();

// System.out.println(t1.isAlive());
// System.out.println(t2.isAlive());

// // isAlive is a method to know whether the t1 and t2
// // threads are alive or not. If they are alive then
// // it shows true or else it shows false.

// System.out.println("bye");

// t1.setName("HI THREAD");
// t2.setName("HELLO THREAD");

// System.out.println(t1.getName());
// System.out.println(t2.getName());

// Thread Priority:

// public class hello {
// public static void main(String[] args) throws Exception {

// Thread t1 = new Thread(() -> {
// for (int i = 0; i <= 5; i++) {
// System.out.println("Hi" + Thread.currentThread().getPriority());
// try {
// Thread.sleep(1000);
// } catch (Exception e) {
// }
// }
// });
// Thread t2 = new Thread(() -> {
// for (int i = 0; i <= 5; i++) {
// System.out.println("Hello" + Thread.currentThread().getPriority());
// try {
// Thread.sleep(1000);
// } catch (Exception e) {
// }
// }
// });
// t1.setPriority(Thread.MIN_PRIORITY);
// t2.setPriority(Thread.MAX_PRIORITY);

// System.out.println(t1.getPriority());
// System.out.println(t2.getPriority());

// t1.start();
// try {
// Thread.sleep(1000);
// } catch (Exception e) {
// }
// t2.start();

// t1.join();
// t2.join();

// System.out.println(t1.isAlive());
// System.out.println(t2.isAlive());

// System.out.println("bye");
// }
// }

// Synchronise:

// After using the synchronized keyword there is no clash between
// the two threads. Multiple threads can access the same method
// independently.

// class Counter {
// int count;
// public synchronized void increment() {
// count++;
// }
// }
// public class hello {
// public static void main(String[] args) throws Exception {
// Counter c = new Counter();
// Thread t1 = new Thread(new Runnable() {
// public void run() {
// for (int i = 1; i <= 1000; i++) {
// c.increment();
// }
// }
// });
// Thread t2 = new Thread(new Runnable() {
// public void run() {
// for (int i = 1; i <= 1000; i++) {
// c.increment();
// }
// }
// });
// t1.start();
// t2.start();
// t1.join();
// t2.join();
// System.out.println("Count " + c.count);
// }
// }
// ----------------------------------------------------------------

// COLLECTIONS AND GENERICS:-

// Collections are the advanced version of arrays.
// We can set any number of values to be entered.
// Collections does not support index numbers.
// So for this we sometime use lists(ArrayList) or sets(HasSet)
// sets also has TreeSet as an inerface.
// Map has keys and values. Every value has a key.
// Mao is also an interface and its class is HashMap.

// ArrayList is a class that implements Collections.
// Even List interface is implemented by ArrayList.
// In list we can have duplicate elements but we cannot have the same in Set
// interface.

// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.Iterator;

// public class hello {
// public static void main(String[] args) throws Exception {

// Collection values = new ArrayList<>();
// values.add(9);
// values.add(3);
// values.add(6);

// Iterator it = values.iterator();
// while (it.hasNext()) {
// System.out.println(it.next());
// }
// }
// }
// Iterator is an interface which overcomes the problem of
// collections not supporting the index values.

// As we know that collection interface doesnot support index
// values so we use another interface called as List which extends
// the collection interface. We need to import list interface.

// List values = new ArrayList<>();
// values.add(9); // Integer v = new Integer(9)
// values.add(3);
// values.add(6);
// values.add(2, 4);

// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.Iterator;
// import java.util.List;

// public class hello {
// public static void main(String[] args) throws Exception {

// List values = new ArrayList<>();
// values.add(9);
// values.add(3);
// values.add(6);

// for (Object o : values) {
// System.out.println(o);
// }
// }
// }

// The object of list interface can take any type of values whether
// it may be int, float, string or anything because everything
// is object.

// GENERICS:
// List<Integer> values = new ArrayList<Integer>();
// values.add(9);
// values.add(3);
// values.add(6);

// for (Integer i : values) {
// System.out.println(i);
// }
// This is helpful in creating the array of a specific type.

// Arrangement of values:

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;
// public class hello {
// public static void main(String[] args) {
// List<Integer> values = new ArrayList<Integer>();
// values.add(9);
// values.add(0);
// values.add(8);
// values.add(6);
// Collections.sort(values);
// Collections.reverse(values);
// Collections.shuffle(values);
// for (Integer i : values) {
// System.out.println(i);
// }
// }
// }

// If we want to sort the numbers according to their last digits then we can do
// that by using
// Comparator interface. We cannot create the object of comparator so we need to
// find the class
// that implements the comparator. But we dont have any class that implements
// the comparator. So
// we need to create our method.

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;
// public class hello {
// public static void main(String[] args) {
// List<Integer> values = new ArrayList<Integer>();
// values.add(909);
// values.add(101);
// values.add(808);
// values.add(606);
// Comparator<Integer> c = new Comparator<Integer>() {
// public int compare(Integer i, Integer j) {
// if (i % 10 > j % 10)
// return 1;
// else
// return -1;
// }
// };
// Collections.sort(values, c);
// for (Integer i : values) {
// System.out.println(i);
// }
// }
// }

// As comparator is a functional interface it can also be written as:

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;
// public class hello {
// public static void main(String[] args) {
// List<Integer> values = new ArrayList<Integer>();
// values.add(909);
// values.add(101);
// values.add(808);
// values.add(606);
// Comparator<Integer> c = (i, j) -> i % 10 > j % 10 ? 1 : -1;
// Collections.sort(values, c);
// for (Integer i : values) {
// System.out.println(i);
// }
// }
// }

// Comparable:

// We created new class in list and for that if we need to use sort function
// then we need to implement
// comparable interface to the created class.

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;
// class Stud implements Comparable<Stud> {
// int rollno, marks;
// String name;
// public Stud(int rollno, String name, int marks) {
// this.rollno = rollno;
// this.marks = marks;
// this.name = name;
// }
// @Override
// public String toString() {
// return "Stud [marks=" + marks + ", name=" + name + ", rollno=" + rollno +
// "]";
// }
// public int compareTo(Stud s) {
// return marks > s.marks ? 1 : -1;
// // name.length>s.name.length
// }
// }
// public class hello {
// public static void main(String[] args) {
// List<Stud> studs = new ArrayList<>();
// studs.add(new Stud(72, "Siddarth", 144));
// studs.add(new Stud(73, "Sid", 143));
// studs.add(new Stud(74, "Siddu", 145));
// studs.add(new Stud(75, "Si", 146));
// Collections.sort(studs);
// for (Stud s : studs) {
// System.out.println(s);
// }
// }
// }
// SET INTERFACE:-
// Set inteface is implemented by HashSet class. We cannot have duplicate values
// in set. It only takes unique values.
// Set does not follow the sequence this is bcoz hash does not support
// sequencing. For that we import
// TreeSet class that implements Set interface.

// import java.util.Set;
// import java.util.TreeSet;

// public class hello {
// public static void main(String[] args) {
// Set<Integer> values = new TreeSet<Integer>();
// values.add(5);
// values.add(7);
// values.add(9);
// for (int v : values) {
// System.out.println(v);
// }
// }
// }

// MAP INTERFACE:-

// import java.util.Map;
// import java.util.Set;
// public class hello {
// public static void main(String[] args) {
// Map<String, String> map = new HashMap<>();
// map.put("JAVA", "ECLIPSE");
// map.put("PYTHON", "PYCHARM");
// map.put("C", "CODEBLOCKS");
// Set<String> keys = map.keySet();
// for (String k : keys) {
// System.out.println(k + " -- " + map.get(k));
// }
// }
// }

// As we are using set here we cannot create dupliacte key but we can create
// dupliacate value for
// different keys. And if we create duplicate key then the value of the second
// key will be considered.

// Map Interface is implemented two classes that is HashMap and HashTable. The
// difference is HashTable is
// Synchronised but not HashMap.
