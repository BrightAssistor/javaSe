package java019_designmode.factory.FactoryMethodDemo;


public class FactoryCpuIntel {
	public static Cpu createIntelCpu(int type){
        return new CpuIntel(type);
    }
}
