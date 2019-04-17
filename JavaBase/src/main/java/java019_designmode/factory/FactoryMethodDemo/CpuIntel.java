package java019_designmode.factory.FactoryMethodDemo;

public class CpuIntel implements Cpu {
	 /**
     * CPU的针脚数
     */
    private int pins = 0;
    public  CpuIntel(int pins){
        this.pins = pins;
    }
    @Override
    public void calculate() {
        // TODO Auto-generated method stub
        System.out.println("Intel CPU的针脚数：" + pins);
    }

}
