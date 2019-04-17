package java019_designmode.Adapter;

import java019_designmode.Adapter.common.Adaptee;
import java019_designmode.Adapter.common.Target;
/**
 * 类设配器模式
 * 
 * 由于Adaptee实现了Target中的第一个接口，所以这里只需实现第一个，并继承第一个
 * @author bristor
 *
 */
public class AdapterClassDemo extends Adaptee implements Target {

	
	@Override
	public void sampleOperation2() {
		// TODO Auto-generated method stub
		
	}



}
