//这个类要定义为抽象类
public abstract class Duck {
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quakBehavior;

	public Duck() {

	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuakBehavior(QuackBehavior quakBehavior) {
		this.quakBehavior = quakBehavior;
	}

	public abstract void display();

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quakBehavior.quack();
	}

	public void swim() {
		System.out.print("swimming....");
	}

}
