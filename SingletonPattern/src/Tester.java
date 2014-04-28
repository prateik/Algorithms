
public class Tester {
	public static void main(String args[]){
	for(int i = 0;i < 10000;i++){
	new Thread(){
	@Override
	public void run() {
		Singleton.getInstance();
		System.out.println("Code for thread "+Singleton.instancecount);	
		              }	
	          }.start();
		}
	}
}
