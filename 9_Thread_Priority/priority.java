class A extends Thread{
    public void run(){
      for(int i=1;i<=100;i++){
        System.out .println("Hi..");
      }  
    }
} 
class B extends Thread{
    public void run(){
      for(int i=1;i<=100;i++){
        System.out.println("Hello..");
        try {
          Thread.sleep(10);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }  
    }
}
public class priority {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        System.out.println(obj1.getPriority());
        // By default priority is 5... We can change it 
        obj2.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        obj2.start();
    }
}
