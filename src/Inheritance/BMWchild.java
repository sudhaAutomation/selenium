package Inheritance;

public class BMWchild extends singleinheritanceparent{

	public void BMWEngine() {
		System.out.println("BMW engine designed successfully");
	}

	public void BMWdriver() {
		System.out.println("BMW  is ready to drive on road");
	}

	public void BMWcolour() {
		System.out.println("BMW colour seslectgion completed");
	}

	public static void main(String[] args) {

		BMWchild bm=new BMWchild();
		
		System.out.println(bm.cost);
		bm.carstart();
		bm.carstop();
		bm.carparts();
		bm.BMWcolour();
		bm.BMWEngine();
		bm.BMWdriver();
		bm.cardesign();
		bm.manufacturebodyparts();
		
		
	}
}
