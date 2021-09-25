public class Prog_10 {
    public static void main(String[] args) {
        print("Привет", 5,1);
        print("Привет", 6L);
        print("Привет", 8.4,1.6379);
        print("Привет", 'z','2');
        print("Привет", 6f);
    }

    static void print (String str, int... symbol){
        System.out.print("\n"+str);
        for (int i = 0; i < symbol.length; i++){
            System.out.print("  ["+symbol[i]+"]; ");
        }
    }
    static void print (String str, double... symbol){
        System.out.print("\n"+str);
        for (int i = 0; i < symbol.length; i++){
            System.out.print("  ["+symbol[i]+"]; ");
        }
    }
    static void print (String str, char... symbol){
        System.out.print("\n"+str);
        for (int i = 0; i < symbol.length; i++){
            System.out.print("  ["+symbol[i]+"]; ");
        }
    }
    static void print (String str, byte... symbol){
        System.out.print("\n"+str);
        for (int i = 0; i < symbol.length; i++){
            System.out.print("  ["+symbol[i]+"]; ");
        }
    }
    static void print (String str, boolean... symbol){
        System.out.print("\n"+str);
        for (int i = 0; i < symbol.length; i++){
            System.out.print("  ["+symbol[i]+"]; ");
        }
    }
    static void print (String str, short... symbol){
        System.out.print("\n"+str);
        for (int i = 0; i < symbol.length; i++){
            System.out.print("  ["+symbol[i]+"]; ");
        }
    }
    static void print (String str, float... symbol){
        System.out.print("\n"+str);
        for (int i = 0; i < symbol.length; i++){
            System.out.print("  ["+symbol[i]+"]; ");
        }
    }
    static void print (String str, long... symbol){
        System.out.print("\n"+str);
        for (int i = 0; i < symbol.length; i++){
            System.out.print("  ["+symbol[i]+"]; ");
        }
    }
}
