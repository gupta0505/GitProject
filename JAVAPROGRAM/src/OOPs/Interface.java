package OOPs;

interface  Interface {
	 void print();
}
class Aaaa implements Interface{
	public void print() {
		System.out.println("it is amazing");
	}

	public static void main(String[] args) {
		Aaaa b=new Aaaa();
		b.print();
		
	}

}
