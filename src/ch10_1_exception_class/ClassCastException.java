package ch10_1_exception_class;

public class ClassCastException {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat); //Casting exception
	}
		public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
		} else {
			System.out.println("Dog타입이 아닙니다. ");
		}
	}
}	
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
