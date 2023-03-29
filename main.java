import java.util.*;
import java.math.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int t1=0,t2=0;
        ArrayList<ArrayList> al=new ArrayList<ArrayList>();
        for(int i=0;i<n;i++)
        {
            ArrayList liss=new ArrayList<>();
            liss.add(sc.nextLine()); //reads the name of the product.
            liss.add(sc.nextInt());  //production rate in first yesr
            liss.add(sc.nextInt());  //production rate in second year
            al.add(liss);
            sc.nextLine();
            
        }
        System.out.println(al);
        ArrayList<ArrayList> res=new ArrayList<ArrayList>();
        for(int i=0;i<n;i++)
        {
            ArrayList ress=new ArrayList<>();
            int d=((int)(al.get(i).get(2)))-((int)(al.get(i).get(1)));   //calculate the variance in production rate, for some specified product.
            double d1=(double)((((int)(al.get(i).get(1)))/(d))*100);     //calculate the variance percentage, for the obtained variance of specified object.
            ress.add(d);                                                 //adds the variance data of product into the result arraylist
            ress.add(d1);                                                //adds the variance percentage data of product into the result arraylist
            res.add(ress);
        }
        System.out.println(res); //prints the array list of arraylists that contains all my product details.
        for(int i=0;i<n;i++)
        {
            t1+=(int)(al.get(i).get(1));  //production rate of all the products in first year
            t2=t2+(int)(al.get(i).get(2)); //production rate of all the products in the second year.
        }
        System.out.println(t1);
        System.out.println(t2);
    }
}
