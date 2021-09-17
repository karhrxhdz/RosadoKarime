

public class App {
    public static void main(String[] args) throws Exception {
       
       int x=1;
       int y=2;
       int i=20;
       int Contador=1;
       int s=0;

       System.out.println(x);
       System.out.println(y);


    do{
        Contador=Contador+1;
        s=x+y;
        System.out.println(s);
        x=y;
        y=s;
    }
       while(Contador<=i);
       {
           Contador=Contador+1;
           s=x+y;
           System.out.println(s);
           x=y;
           y=s;
       }
    }
}
