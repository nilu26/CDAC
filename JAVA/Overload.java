class Overload{
	void add(int a, int b){
		System.out.print("Addition of Int: "+(a+b));
			
	}
		
	void add(float a, float b){
		System.out.print("\nAddition of float: "+(a+b));
			
	}
	
	void add(double a, double b){
		System.out.print("\nAddition of double: "+(a+b));
			
	}
	
	void add(int a, int b){
		System.out.print("\nAddition of double: "+(a+b));
			
	}
		
	public static void main(String[] args){
		Overload od=new Overload();
		od.add(12,21);
		od.add(12.21f,21.12f);
		od.add(23.12,34.62);
		od.add(6,4,95);
	}
	
}