package string;

/**
 * Created by rohan on 4/9/17.
 */
public class chararray {
    public static void main(String args[]){
        String s1="hello";
        char[] ch=s1.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
    }
}
