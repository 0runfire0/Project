public class HelloWorldOnSteroids{
    public int indice;
    public String variabile;
    public static final String MY_PARAM = "myValue";

    public HelloWorldOnSteroids(int indice, String variabile) {
        this.indice = indice;
        this.variabile = variabile;
    }

    public static void main(String[] args){
        int x=3;
        double y=3.14;
        String a="buongiorno mondo.";
        System.out.println(x+" "+y+"\n"+a);
        double w=20.1;
        int z=(int)w;
        int l= 10;
        double k= (double)l;
        System.out.println(k);
        //System.out.println(String.valueOF(z)+" "+String.valueOF(w));
        System.out.println(z+" "+w);
        boolean h= true;
        byte b1=8;     //8 bit signed
        short s1= 200; //16 bit signed
        int i1= 1_000_000_000; //32 bit signed
        long l1=10_000_000_000L; //64 bit signed
        char c1='a'; //16 bit unsigned
        float f1= 3.14f; //32 bit
        double d1=3.14; //64 bit
        boolean b2= false; //1 bit(?)

    }
    

}
HelloWorldOnSteroids o = new HelloWorldOnSteroids();
HelloWorldOnSteroids.MY_PARAM;