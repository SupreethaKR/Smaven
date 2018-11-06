package smaven;
import java.util.Map;
import java.util.HashMap;


public class Hash extends Thread {
	
	public void run() {
		System.out.println("Running thread name is: "+Thread.currentThread().getName());
		System.out.println("running thread priority is:"+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
	Hash s1=new Hash();
	Hash s2=new Hash();
	Hash s3=new Hash();
	s1.setPriority(Thread.MIN_PRIORITY);
	s2.setPriority(Thread.NORM_PRIORITY);
	s3.setPriority(Thread.MAX_PRIORITY);
	s1.start();
	s2.start();
	s3.start();
	}

}
