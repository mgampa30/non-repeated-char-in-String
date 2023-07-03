import java.util.*;
class NoRepeatedChar {
    public static void main(String[] args) {
       NoRepeatedChar("llello");
    }
    public static void NoRepeatedChar(String s){
        List<Character> list = new ArrayList<>();
        for(char c:s.toCharArray()){
            if(list.contains(c)){
                list.remove((Character) c);
            }
        list.add(c);
        }
        System.out.println(list.get(0));   
    }
    }
