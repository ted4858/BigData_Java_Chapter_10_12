package chapter10;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		changeDog(dog);
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	private static void changeDog(Animal animal) {
//		if(animal instanceof Dog) {
//			Dog dog = (Dog) animal;
//		} else {
//			Cat cat = (Cat) animal;
//		}
		
		try {
			Dog dog = (Dog) animal;
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
		System.out.println("Well Done!!");
	}
	
}
