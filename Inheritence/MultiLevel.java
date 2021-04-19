package revision;

class ClassA{
	void methodA() {
		System.out.println("I am a method of ClassA");
	}
}

class ClassB extends ClassA{
	void methodB() {
		System.out.println("I am a method of ClassB");
	}
}

class ClassC extends ClassB{
	
	public static void main(String[] args) {
		
		ClassC objectC = new ClassC();
		objectC.methodA();
		objectC.methodB();
		objectC.methodC();
	}
	
	void methodC() {
		System.out.println("I am a method of ClassC");
	}
}
