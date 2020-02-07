public class Gift {
 String name;
 int price;
 double weight;
 Gift(String n,int p,double w)
 {
	 this.name=n;
	 this.price=p;
	 this.weight=w;
 }
 public  String getName()
 {
	 return this.name;
 }
 public  int getPrice()
 {
	 return this.price;
 }
 public  double getWeight()
 {
	 return this.weight;
 }
 
 public static void main(String args[])
 {
	 Gift g=new Gift("teddy",200,100.5);
	 System.out.println("Name of gift:"+ g.getName());
	 System.out.println("Price:"+g.getPrice());
	 System.out.println("weight:"+g.getWeight());
 }
}
