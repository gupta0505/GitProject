package oopS;

                //SIMPLE CLASS AND OBJECT CREATE
                   
public class Student{
	
	int id;                                                        
    String name;
    double fees;
    
    void record(int i, String n, double d)
    {
    	id=i;
    	name=n;
    	fees=d;
    }
    
    void display()
    {
    	System.out.println(id+" "+name+" "+fees);
    }
    
 }

class TestStudent1{

	public static void main(String[] args) {                        
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		s1.record(101, "Deepak",5000);
		s2.record(102, "Julie" ,6000);
		s3.record(103, "palak" ,7000);
		s1.display();
		s2.display();
		s3.display();
		
		
		
		}

}
