package Package1;

public class EncapsulationSDETEx2 {

	public static void main(String[] args) 
	{
		EncapsulationEx1SDET acc=new EncapsulationEx1SDET();
		
		acc.setAccno(200);
		acc.setAmount(200.5);
		acc.setName("Nitin");
		
		System.out.println(acc.getAccno());
		
	}

}
