package java019_designmode.Adapter;

import java019_designmode.Adapter.common.Adaptee;

/**
 * 对象适配器
 * @author bristor
 *
 */
public class AdapterObjectDemo {
	private Adaptee adaptee;

	public AdapterObjectDemo(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	/**
	 * 源类Adaptee有方法sampleOperation1 因此适配器类直接委派即可
	 */
	public void sampleOperation1() {
		this.adaptee.sampleOperation1();
	}

	/**
	 * 源类Adaptee没有方法sampleOperation2 因此由适配器类需要补充此方法
	 */
	public void sampleOperation2() {
		// 写相关的代码
	}

}
