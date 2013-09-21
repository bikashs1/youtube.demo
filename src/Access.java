
public class Access {

	/**
	 * changes made
	 */
	public static void main(String[] args) {
		Subscriber s=new Subscriber();
		Subscriber s1=new Subscriber("Ram", 543);
		System.out.println("sub name: "+s.name);
		System.out.println("sub n0=  "+s.no);
		System.out.println("sub1 name: "+s1.name);
		System.out.println("sub1 n0=  "+s1.no);
		s.makecall();
		s1.makecall();
		s.Subscriber();
	}

}
