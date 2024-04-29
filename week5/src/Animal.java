abstract class Mammal extends Animal {
	public abstract void bark();
	public abstract void getFood();
}

abstract class Reptile extends Animal {
	public abstract void getFood();
}

class Cat extends Mammal {
	String name;
	float weight;
	String nameSlave;
	
	public Cat(String name, float weight, String nameSlave) {
		this.name = name;
		this.weight = weight;
		this.nameSlave = nameSlave;
	}
	
	public void bark() {
		System.out.println("Meow");
	}
	
	public void getFood() {
		System.out.println("Fish");
	}
	
	public void getName() {
		System.out.println("Name: " + this.name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void getWeight() {
		System.out.println("Weight: " + this.weight);
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public void getNameSlave() {
		System.out.println("NameSlave: " + this.nameSlave);
	}
	
	public void setNameSlave(String nameSlave) {
		this.nameSlave = nameSlave;
	}
}

class Dog extends Mammal {
	String name;
	float weight;
	String nameMaster;
	
	public Dog(String name, float weight, String nameMaster) {
		this.name = name;
		this.weight = weight;
		this.nameMaster = nameMaster;
	}
	
	public void bark() {
		System.out.println("Bowbow");
	}
	
	public void getFood() {
		System.out.println("Apple");
	}
	
	public void getName() {
		System.out.println("Name: " + this.name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void getWeight() {
		System.out.println("Weight: " + this.weight);
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public void getNameMaster() {
		System.out.println("NameMaster: " + this.nameMaster);
	}
	
	public void setNameMaster(String nameMaster) {
		this.nameMaster = nameMaster;
	}
}

class Crocodile extends Reptile {
	String name;
	float weight;
	
	public Crocodile(String name, float weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public void getFood() {
		System.out.println("Meat");
	}
	
	public void getName() {
		System.out.println("Name: " + this.name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void getWeight() {
		System.out.println("Weight: " + this.weight);
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
}


public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
