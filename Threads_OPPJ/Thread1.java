class T1 extends Thread{
    public void run(){
        System.out.println("Thread1:");
        for(int i=1; i<6; i++)
            System.out.print(i+"\t");
    }
}
class T2 extends Thread{
    public void run(){
        System.out.println("\nThread2, Strats after Thread1 finishes.");
    }
}
public class Thread1 {
    public static void main(String[] args){
        T1 t1 = new T1();
        T2 t2 = new T2();
        try{
            t1.start();
            t1.join();
            t2.start();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
