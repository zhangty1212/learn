package class_test;

public class North_Person extends Person implements raiding_horse {
	
	
  
	void eat(){
		
		System.out.println(name+"_"+age+"_"+sex+":������");
		
	}
	
    void drink (){
		
		System.out.println(name+"_"+age+"_"+sex+":��ϡ��");
		
	}

	@Override
	public void raid() {
		// TODO Auto-generated method stub 
		System.out.println("�����˶�������");
	}
    
}
