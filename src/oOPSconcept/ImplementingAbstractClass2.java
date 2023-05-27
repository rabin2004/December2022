package oOPSconcept;

public class ImplementingAbstractClass2 extends ImplementingAbstractClass {

	public static void main(String[] args) {
		ImplementingAbstractClass2 ia = new ImplementingAbstractClass2();
		ia.abstractMethod();
		ia.abstractMethod1();
		
		// access all methods implemented from interface
		ImplementingInterface2 ii2 = new ImplementingInterface2();
		ii2.businessPartner();
		ii2.employee();
		ii2.franchise();
		ii2.furniture();
		ii2.investment();
		ii2.location();
		ii2.menu();

	}

	@Override
	void abstractMethod1() {
		System.out.println("Abstract method - 2");
	}

}
