package my_package;
class Aa{
	int a=5;
}
class Bb extends Aa{
	int b=6;
}
class Cc extends Bb{
	int c=8;
}
class Dd extends Bb{
	int d=4;
}
public class HierarchicalInheritance extends Dd {
	public static void main(String[] args) {
		HierarchicalInheritance obj=new HierarchicalInheritance();
		System.out.println(obj.a);
		System.out.println(obj.b);

	}
}
