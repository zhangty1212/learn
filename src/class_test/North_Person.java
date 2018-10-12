package class_test;

public class North_Person extends Person implements raiding_horse {
	
	
  
	void eat(){
		
		System.out.println(name+"_"+age+"_"+sex+":吃面条");
		
	}
	
    void drink (){
		
		System.out.println(name+"_"+age+"_"+sex+":喝稀饭");
		
	}

	@Override
	public void raid() {
		// TODO Auto-generated method stub 
		System.out.println("北方人都会骑马！");
	}
    
}
