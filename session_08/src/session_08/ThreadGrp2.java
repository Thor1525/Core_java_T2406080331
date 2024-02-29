package session_08;

public class ThreadGrp2 {
	ThreadGroup g1=new ThreadGroup("tg");
	Thread t1=new Thread(g1,"First Thread");
	Thread t2=new Thread(g1,"second Thread");
	
	/*System.out.println(g1.getMaxPriority());
	System.out.println(t1.getPriority());
	System.out.println(t2.getPriority());
	g1.setMaxPriority(3);
	System.out.println(g1.getMaxPriority());
	System.out.println(t1.getPriority());
	System.out.println(t2.getPriority());
	Thread te=new Thread(g1,"third Thread");
	System.out.println("t3="+t3.getPriority());*/
}
