package class_test;

public class South_Person extends Person implements swimming {

void eat(){
		
		System.out.println(name+"_"+age+"_"+sex+":���׷�");
		
	}
	
    void drink (){
		
		System.out.println(name+"_"+age+"_"+sex+":������");
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("�Ϸ��˶�����Ӿ��");
		
	}
}
