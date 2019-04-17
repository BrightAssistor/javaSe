package java019_designmode.factory.FactoryMethodDemo;

public class CpuAmd implements Cpu {
	 /**
     * CPU的针脚数
     */
    private int pins = 0;
    public  CpuAmd(int pins){
        this.pins = pins;
    }
    @Override
    public void calculate() {
        // TODO Auto-generated method stub
        System.out.println("AMD CPU的针脚数：" + pins);
    }
}
