import java.util.*;
public class jc5{
    public static void main(String []args)
    {
        ArrayList<Integer> x=new
    ArrayList<Integer>();
        x.add(33);
        x.add(15);
        x.add(20);
        x.add(34);
        x.add(8);
        x.add(12);
        
    Collections.sort(x, Collections.reverseOrder());
        for(int i : x){
            System.out.println(i);
        }

    
    
       
        
    }
}