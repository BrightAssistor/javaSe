package java019_designmode.Adapter.common;

public abstract class DefaltAdapter implements Target{
	@Override
	public void sampleOperation1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sampleOperation2() {
		// TODO Auto-generated method stub
		
	}
	//抽象方法
	public abstract void sampleOperation3();
	
	//普通方法
	void sampleOperation4(){
		System.out.println("抽象类-普通方法makefriends");
	}
}
