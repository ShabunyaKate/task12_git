public class Math{
	public int add(int a, int b){
                System.out.println("This is add method");
		return a+b;
	}
        public int add(int a, int b, int c){
                System.out.println("This is add method for 3 params");
		return a+b+c;
	}
	public int sub(int a, int b){
		return a-b;
	}
	public int div(int a, int b){
		try{
			return a/b;
		}
		catch (Exception e){
			return 0;
		}
	}
	public int mult(int a, int b){
		return a*b;
	}
	public double sqrt(double a){
		return Math.sqrt(a);
	}
}