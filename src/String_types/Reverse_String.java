package String_types;

public class Reverse_String {

    public static void main(String[] args) {

//        My Name Is Ram Reverse In =yM emaN sI maR

        String str="My Name Is Ram";

       String[] splitArray = str.split(" ");

      int len= splitArray.length;

      for(int i=0;i<=len-1;i++){
//          System.out.println(splitArray[i]);
          StringBuffer stringBuffer=new StringBuffer(splitArray[i]);
//          stringBuffer.reverse();
          System.out.println(stringBuffer.reverse());
      }

    }
}
