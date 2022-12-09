public class Knapsack {
    Item[] items;
    int W;

    public Knapsack(Item[] items, int W) {
        this.items = items;
        this.W = W;
    }

    public float solve() {
        int i, j, pos;
        Item mx, temp;
        float totalValue = 0, totalWeight = 0;

        //calculating density of each item
        for (i = 0; i < items.length; i++) {
            items[i].density = (float) items[i].value / items[i].weight;
        }

        //sorting w.r.t to density by using compare function
        for (i = 0; i < items.length; i++) {
            mx = items[i];
            pos = i;
            for (j = i; j < items.length; j++) {
                if (items[j].density > mx.density) {
                    mx = items[j];
                    pos = j;
                }
            }
            temp = items[i];
            items[i] = mx;
            items[pos] = temp;
        }

        for (i = 0; i < items.length; i++) {
            if (totalWeight + items[i].weight <= W) {
                totalValue += items[i].value;
                totalWeight += items[i].weight;
            } else {
                int wt = (int) (W - totalWeight);
                totalValue += (wt * items[i].density);
                totalWeight += wt;
                break;
            }
        }
        System.out.println("total weight in bag " + totalWeight);
        return totalValue;
    }
}
