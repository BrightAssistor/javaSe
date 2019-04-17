package java019_designmode.factory.FactoryMethodDemo;

import java.util.Calendar;

public class ClientNormal {
	public static void main(String[]args){
        Cpu amdCpu = FactoryCpuAmd.createAmdCpu(1);
        amdCpu.calculate();
        
        
        Cpu intelCpu = FactoryCpuIntel.createIntelCpu(1);
        intelCpu.calculate();
        
        Calendar.getInstance();
    }
}
