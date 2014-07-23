
public class MallardDuck extends Duck {

	public MallardDuck(){
		flyBehavior=new FlyWithWings();
		quakBehavior=new Quack();
	}

	public void display() {
		System.out.print("MallardDuck....");
		
	}
	
}
