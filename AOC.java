import java.util.*;
public class AOC {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str= sc.nextLine();
        char[] charArray = str.toCharArray();
        for(int i = 0;i< charArray.length;i++){
            if(charArray[i]=='('){
                count += 1;
            }
            else{
                count -= 1;
                if(count == -1){
                    count = i+1;
                    break;
                }
            }

        }
        System.out.println(count);
    }
}
