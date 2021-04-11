package day36_inheritance;

	class Okul {
		
		protected int num1=10;
		public String name = "Ali";
		private int num2=11;
		
		public Okul() {
			
			System.out.println("Parent class cons");
		}
		
		public int getNum2() {
			return num2;
		}
		
		public void setNum2(int num2) {
			this.num2=num2;
		}
		
		
	​
	}
	​
	​
	​
	public class Sinif extends Okul_1 {
		
		
		protected int num3=12;
		public String name2="Veli";
		private int num4=13;
		
		public Sinif() {
			System.out.println(this.num1);
			System.out.println(super.num1);
			System.out.println(this.getNum2());
			System.out.println(super.getNum2());
			this.setNum2(23);
			System.out.println(this.getNum2());
			System.out.println(super.getNum2());
			this.setNum2(33);
			System.out.println(this.getNum2());
			System.out.println(super.getNum2());
			System.out.println(this.num3);
			System.out.println(this.num4);
			System.out.println(this.name);
			System.out.println(super.name);
			System.out.println(this.name2);
			
		}
		public static void main(String[] args) {
		 Sinif sinif = new Sinif();	
	​
		}