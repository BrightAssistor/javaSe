package java019_designmode.factory.AbstractFactoryDemo;


public class FactoryIntel implements FactoryAbstract{
	@Override
    public Cpu createCpu() {
        // TODO Auto-generated method stub
        return new CpuIntel(755);
    }

    @Override
    public CMainboard createMainboard() {
        // TODO Auto-generated method stub
        return new CMainboardIntel(755);
    }

}
