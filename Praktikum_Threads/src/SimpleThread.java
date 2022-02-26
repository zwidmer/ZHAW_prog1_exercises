import java.sql.SQLOutput;

public class SimpleThread extends Thread{

    SimpleThread(){
        String name;
    }
    public void run(){
        System.out.println("start run " + getName());
        try{
            for(int i=0; i<20 ;i++){
                System.out.println(getName() + " " + i);
                Thread.sleep(((int)Math.random()*1000));
            }
        }catch(InterruptedException e){
            System.err.println("interrupted");
        }
    }

}
