package chap10;

class Animal{};
class Dog extends Animal{};
class Cat extends Animal{};
public class ClassCastEx {
	public static void changeDog(Animal animal) {
		// if(animal instanceof dog {
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal; //class Exception 발생
			System.out.println("변환됩니다");
		} else {
			System.out.println("실행이 안됩니다");
		}
		
	}
	public static void main(String[] args) {
		Animal ani = new Dog();
//		Animal ani2 = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		changeDog(ani);
//		
//		if(Cat instanceof Dog) {
//			cat = (Cat) ani;
//		}
//		Dog dog = (Dog) ani;
//		Cat cat = (Cat) ani;
	}
}
