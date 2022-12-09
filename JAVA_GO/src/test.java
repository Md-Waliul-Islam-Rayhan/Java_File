import java.util.Scanner;

public class test {
    static Scanner in = new Scanner(System.in);

    public static void main(String args[]){
        int n=3, W;

        Item[] items = new Item[3];

        System.out.println("Enter data");

        System.out.println("Enter total "+n+" item's values and weight");
        for(int i=0; i<n; i++){
            Item item = new Item(0,0,0);
            System.out.print("Enter "+(i+1)+" Value ");
            item.value = in.nextInt();
            System.out.print("Enter "+(i+1)+" Weight ");
            item.weight = in.nextInt();
            items[i] = item;
        }

        System.out.println("Entered data");
        display(items);

        System.out.println("Enter Knapsack Weight");
        W = in.nextInt();

        Knapsack ks = new Knapsack(items, W);

        float mxVal = ks.solve();
        System.out.println("---Max value for "+ W +" weight is "+mxVal);

    }

    static void display(Item items[]){
        System.out.print("values:   ");
        for(int i=0; i<items.length; i++){
            System.out.print(items[i].value + "\t");
        }

        System.out.println();
        System.out.print("weight:   ");

        for(int i=0; i<items.length; i++){
            System.out.print(items[i].weight+"\t");
        }
        System.out.println();
    }
}