package StringRevision;

class Parent {
	void run() {
		System.out.println("Parent is running");
	}
}
class Child extends Parent{
	void run() {
		System.out.println("child is rinning");
	}
}

public class PracticeOnlyPractice {
    public static void main(String[]args) {
    	
    	Parent obj=new Child();
    	obj.run();
    	}
    }
