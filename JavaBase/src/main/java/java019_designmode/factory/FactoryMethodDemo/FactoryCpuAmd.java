package java019_designmode.factory.FactoryMethodDemo;


public class FactoryCpuAmd {
	public static Cpu createAmdCpu(int type){
        return new CpuAmd(type);
    }
}
