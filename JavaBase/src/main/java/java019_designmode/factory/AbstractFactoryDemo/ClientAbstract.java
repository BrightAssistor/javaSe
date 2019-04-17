package java019_designmode.factory.AbstractFactoryDemo;

public class ClientAbstract {
	public static void main(String[]args){
        FactoryAbstract factoryAmd=new FactoryAmd();
        Cpu amdCpu = factoryAmd.createCpu();
        CMainboard amdMainboard = factoryAmd.createMainboard();
        amdCpu.calculate();
        amdMainboard.installCPU();
        
        FactoryAbstract factoryIntel = new FactoryIntel();
        Cpu intelCpu = factoryIntel.createCpu();
        CMainboard intelMainboard = factoryIntel.createMainboard();
        intelCpu.calculate();
        intelMainboard.installCPU();
    }
}
