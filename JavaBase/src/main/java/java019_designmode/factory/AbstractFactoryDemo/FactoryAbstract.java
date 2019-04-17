package java019_designmode.factory.AbstractFactoryDemo;


public interface FactoryAbstract {
	/**
     * 创建CPU对象
     * @return CPU对象
     */
    public Cpu createCpu();
    /**
     * 创建主板对象
     * @return 主板对象
     */
    public CMainboard createMainboard();
}
