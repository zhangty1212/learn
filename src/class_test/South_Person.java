package class_test;

public class South_Person extends Person implements swimming {

void eat(){
		
		System.out.println(name+"_"+age+"_"+sex+":吃米饭");
		
	}
	
    void drink (){
		
		System.out.println(name+"_"+age+"_"+sex+":喝咸粥");
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("南方人都会游泳！");
		
	}
}
