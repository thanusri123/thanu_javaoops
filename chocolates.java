import java.util.ArrayList;
public class chocolates extends Gift implements NewYear{
	static ArrayList<Integer> p=new ArrayList<Integer>();
	static ArrayList<Double> w=new ArrayList<Double>();
	chocolates(String s,int p,double w)
	{
		super(s,p,w);
	}
    public void weight()
    {
    	int size=p.size();
    	int total=0;
    	for(int i=0;i<size;i++)
    	{
    		total=total+p.get(i);
    	}
    	System.out.println("Total weight of chocolates:"+total+"gm");
    }
    public void price()
    {
    	int size1=w.size();
    	double total1=0;
    	for(int j=0;j<size1;j++)
    	{
    		total1=total1+w.get(j);
    	}
    	System.out.println("Total price of chocolates:Rs"+total1);
    }
    public  static void main(String args[])
    {
    	chocolates c=new chocolates("cadbury",15,1.2);
    	System.out.println("Name of chocolate:"+c.getName());
    	p.add(c.price);
    	w.add(c.weight);
    	chocolates c1=new chocolates("mars",50,2.5);
    	System.out.println("Name of chocolate:"+c1.getName());
    	p.add(c1.price);
    	w.add(c1.weight);
    	chocolates c2=new chocolates("5Star",20,3.2);
    	System.out.println("Name of chocolate:"+c2.getName());
    	p.add(c2.price);
    	w.add(c2.weight);
    	c2.price();
    	c2.weight();
    }
}
