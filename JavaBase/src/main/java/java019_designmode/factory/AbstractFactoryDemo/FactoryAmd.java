package java019_designmode.factory.AbstractFactoryDemo;


public class FactoryAmd implements FactoryAbstract {
	@Override
    public Cpu createCpu() {
        // TODO Auto-generated method stub
        return new CpuAmd(938);
    }

    @Override
    public CMainboard createMainboard() {
        // TODO Auto-generated method stub
        return new CMainboardAmd(938);
    }
}
