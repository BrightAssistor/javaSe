package java019_designmode.factory.SimpleFactoryDemo;


public class FactorySimpleCpu {
	public static Cpu createCpu(int type){
        Cpu cpu = null;
        if(type == 1){
            cpu = new CpuIntel(755);
        }else if(type == 2){
            cpu = new CpuAmd(938);
        }
        return cpu;
    }
}
