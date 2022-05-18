package sample;

public class SingletonExample {
	
	    private static SingletonExample singletonExample;  

	    private SingletonExample() { 

	    }

	    public static SingletonExample getObject() { 

	        if (singletonExample == null) {
	            
	            singletonExample = new SingletonExample();
	        }

	        return singletonExample;
	    }

	    void display() { //method
	        System.out.println("This is example of Singleton program");
	      
	            
	       
	    }
	    
	    public static void main(String[] args) {

	        SingletonExample singleton = SingletonExample.getObject();
	        singleton.display();
	        
	    }
	

}
