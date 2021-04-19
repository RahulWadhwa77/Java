package revision;

//ClassA is the parent class
class ClassA{
	void methodA() {
		System.out.println("I am a method of Class A");
	}
}

//ClassB is the child class of parent ClassA.
class ClassB extends ClassA {				//use of keyword extends.
	void methodB() {
		System.out.println("I am a method of Class B");
	}
	
	public static void main(String[] args) {
		
		ClassB object = new ClassB();		//object of ClassB
		object.methodA();			//calling mehtodA() of ClassA i.e parent class.
		object.methodB();			//calling methodB() within the class. 
	}
}
