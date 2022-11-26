// Create three classes: Save, Increment, and Display. The save class should save an integer . The increment class should create a thread that starts incrementing the value of integer variable from 10 (10, 11, 12, 13 ...) and saves each value in the save class. The display class should create a thread that will reading the value in the Save class and display it.  

Write a program that creates an instance of the Save class and sets up a Increment and a Display object to operate on it.  







package Day48;

class Save { 

 int i; 
    
     
    
 public Save(int i) { 
     this.i = i; 
     } 
    
    public void increment() { 
    i++; 
    System.out.println("value incremented by 1 and saved "); 
   } 
     public void display() { 
    System.out.println("Current value is " + i); 
     } 
    
    } 
    
     
    
    class Increment implements Runnable { 
    private Save s; 
    public Increment(int inc) { 
    s = new Save(inc); 
    } 
    public void run() { 
    try { 
    
 int j = 0; 
    
 while (j < 10) { 
    
s.display(); 
    
Thread.sleep(750); 
    
 s.increment(); 
    
j++; 
    
     
    
    } 
     } catch (Exception e) { 
    
System.out.println(e); 
    
 } 
    
 } 
    
    } 
    
     
    
    public class Display { 
    
    public static void main(String [] args) { 
    
    Increment i; 
    
    i = new Increment(10); 
    
     Thread t1 = new Thread(i); 
     t1.start(); 
    } 
    
    } 
    
     
