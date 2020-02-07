import java.util.ArrayList;
public class sweets extends Gift implements NewYear {
	static  ArrayList<Integer> p=new ArrayList<Integer>();
	static ArrayList<Double> p1=new ArrayList<Double>();
	sweets(String s,int p,double w)
	{
		super(s,p,w);
	}
    public void weight()
    {
    	int size1=p1.size();
        double total=0;
        for(int i=0;i<size1;i++)
        {
            total=total+p1.get(i);
        }
    	System.out.print("Total weight of sweets:"+total+"gm\n");
    }
    public void price()
    { 
    	int size=p.size();
        int total=0;
        for(int j=0;j<size;j++)
        {
           total=total+p.get(j);
        }
    	System.out.println("Total price of sweets:Rs"+total);
    }
    public static void main(String args[])
    {
    	sweets s=new sweets("jamun",25,1.2);
    	System.out.println("name of sweet:"+s.getName());
        p.add(s.price);
        p1.add(s.weight);
        sweets s1=new sweets("laddu",20,1.7);
        System.out.println("name of sweet:"+s1.getName());
        p.add(s1.price);
        p1.add(s1.weight);
        sweets s2=new sweets("jalebi",35,2.0);
        System.out.println("name of sweet:"+s2.getName());
        p.add(s2.price);
        p1.add(s2.weight);
        s2.weight();
        s2.price();
        
    	
    }
}
