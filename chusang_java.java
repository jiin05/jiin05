package rlawldls;

public class chusang_java {

	public static void main(String[] args) {
		Dog dog = new Dog("�ʷ���");
		System.out.println(dog.name);
		dog.play();
		dog.sound();
	}
}
abstract class Animal {
	String name;
	void setName(String name) {
		this.name=name;
	}
	abstract void sound();
}
interface pet{
	abstract public void play();
}
class Dog extends Animal implements pet{
	Dog(String name){
		super.setName(name);
	}
	public void play() {
		System.out.println("������");
	}
	public void sound() {
		System.out.println("�۸�");
	}
	
}