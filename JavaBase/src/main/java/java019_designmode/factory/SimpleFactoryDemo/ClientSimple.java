package java019_designmode.factory.SimpleFactoryDemo;

public class ClientSimple {
	public static void main(String[] args) {
		Cpu cpu = FactorySimpleCpu.createCpu(1);
		cpu.calculate();
	}
}
