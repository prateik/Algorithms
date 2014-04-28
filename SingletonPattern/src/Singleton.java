
public class Singleton {

	static Singleton singleTon = null;
	static int instancecount = 0;
	private Singleton()
	{	
		instancecount++;
	}
	
	public static synchronized Singleton getInstance(){
		if(singleTon == null){
		System.out.println("Creating new instance");
		  singleTon = new Singleton();	
		}
		return singleTon;
	}
	
}
