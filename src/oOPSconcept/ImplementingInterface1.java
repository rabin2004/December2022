package oOPSconcept;

public abstract class ImplementingInterface1 implements InterfaceConcept, Interface2 { // multiple inheritance

	@Override
	public void employee() {
		System.out.println("Implementing default abstract method from interface");	
	}

	@Override
	public void location() {
		System.out.println("Implementing default abstract method from interface");
	}

	@Override
	public void furniture() {
		System.out.println("Implementing default abstract method from interface");
	}

}
