public class StringBuilderEx{
    public static void main(String[]args){
        String p="pippo";
        StringBuilder sb=new StringBuilder(p); 
        sb.reverse();
        System.out.println(sb);
        //String reversed=sb.toString();
        System.out.println(p);
        //System.out.println(reversed);
    }
}