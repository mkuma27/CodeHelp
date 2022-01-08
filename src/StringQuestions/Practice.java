package StringQuestions;

public class Practice {

    public static void main(String[] args){
        char[] ch=new char[20];

        ch[0]='a';
        String str="Kumar Mayank";
        System.out.println(str);
        for(int i=0;i<ch.length;i++){
            ch[i]='b';
        }

        System.out.println(ch[8]);
    }
}
