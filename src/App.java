import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String,String[]> phoneBoock = new HashMap<>();
        String [] phones = new String[] {"+46466544","+841846184"};
        phoneBoock.put("Anton",phones);
        phones = new String[] {"+464555544","+8545484","+56484484"};
        phoneBoock.put("Igor", phones);
        phones = new String[] {"+464544"};
        phoneBoock.put("Olga", phones);
        phones = new String[] {"+464884","+8665484","+56477484"};
        phoneBoock.put("Vika", phones);
        int numberOfTelephoneMax = 0;
            for (var item:phoneBoock.entrySet()) 
                if (numberOfTelephoneMax<item.getValue().length) 
                    numberOfTelephoneMax=item.getValue().length;
        for (int i = numberOfTelephoneMax;i>=0;i--){
            for (var item:phoneBoock.entrySet())
                if (item.getValue().length==i) {
                    System.out.print(item.getKey()+": ");
                    for (var temp:item.getValue()) System.out.print(temp+"; ");
                    System.out.println();}
        }
        System.out.println();
    }
}
