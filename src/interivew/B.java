package interivew;

public class B extends A{

	   void display() {
	        System.out.println("B");
	    }
	 
	    void print() {
	        this.display();
	        super.display();
	    }
	}
