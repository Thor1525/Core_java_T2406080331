package session_08;

public class ThreadGroupDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		//
		
		ThreadGroup g1=new ThreadGroup("First Group");
		System.out.println(g1.getParent().getName());
		
		ThreadGroup g2=new ThreadGroup(g1,"second Group");
		System.out.println(g2.getParent().getName()+" "+g2.getName());
		
	}

}
