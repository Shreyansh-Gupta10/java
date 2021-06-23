public class Wrappers {
    public static void main(String[] args) {
        // Character c = 'a'; //AutoBoxing 
        // //UnBoxing
        // char ch = c; 
        // System.out.println(ch);
        Character obj1 = 's';
        char ch = obj1;
        Character obj2 = 'r';
        System.out.println(obj1);// autoUnboxing
        System.out.println(obj2.charValue());// explicitly telling to give the chaer value.


        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
    }
    
}
