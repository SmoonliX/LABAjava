import java.util.LinkedList;

public class OrderHashTable {
    private static class Entry {
        int key;
        Order value;

        public Entry(int key, Order value) {
            this.key = key;
            this.value = value;
        }
    }

    private static final int DEFAULT_CAPACITY = 10;
    private LinkedList<Entry>[] table;

    public OrderHashTable() {
        table = new LinkedList[DEFAULT_CAPACITY];
    }

    private int hash(int key) {
        return Math.abs(key) % table.length;
    }

    public void put(int key, Order value) {
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        for (Entry entry : table[index]) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }

        table[index].add(new Entry(key, value));
    }

    public Order get(int key) {
        int index = hash(key);
        if (table[index] != null) {
            for (Entry entry : table[index]) {
                if (entry.key == key) {
                    return entry.value;
                }
            }
        }
        return null;
    }

    public void remove(int key) {
        int index = hash(key);
        if (table[index] != null) {
            table[index].removeIf(entry -> entry.key == key);
        }
    }

    public static void main(String[] args) {
        Order order1 = new Order(1, "Laptop", "348 Main St", 999.99);
        Order order2 = new Order(2, "Phone", "3112 New St", 399.99);

        OrderHashTable orderHashTable = new OrderHashTable();
        orderHashTable.put(order1.getOrderNumber(), order1);
        orderHashTable.put(order2.getOrderNumber(), order2);

        System.out.println("Order with number 1: " + orderHashTable.get(1));
        System.out.println("Order with number 2: " + orderHashTable.get(2));

        orderHashTable.remove(1);
        System.out.println("Order with number 1 after removal: " + orderHashTable.get(1));
    }
}
