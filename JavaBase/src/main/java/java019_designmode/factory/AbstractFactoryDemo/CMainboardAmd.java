package java019_designmode.factory.AbstractFactoryDemo;

public class CMainboardAmd implements CMainboard {
	/**
     * CPU插槽的孔数
     */
    private int cpuHoles = 0;
    /**
     * 构造方法，传入CPU插槽的孔数
     * @param cpuHoles
     */
    public CMainboardAmd(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }
    @Override
    public void installCPU() {
        // TODO Auto-generated method stub
        System.out.println("AMD主板的CPU插槽孔数是：" + cpuHoles);
    }
}
