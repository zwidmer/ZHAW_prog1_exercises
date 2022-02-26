public class Main{


    public static void main(String[] args) {
    Thread threadOne = new SimpleThread();
    threadOne.setName("thread one");
    Thread threadTwo = new SimpleThread();
    threadTwo.setName("thread two");
    threadOne.start();
    threadTwo.start();
    }
}
