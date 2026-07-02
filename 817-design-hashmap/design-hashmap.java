class MyHashMap {

    class Node {
        int key, value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int size = 1000;
    private Node[] map;

    public MyHashMap() {
        map = new Node[size];
    }

    // Hash function
    private int hash(int key) {
        return key % size;
    }

    // Insert or update
    public void put(int key, int value) {
        int index = hash(key);

        if (map[index] == null) {
            map[index] = new Node(key, value);
            return;
        }

        Node temp = map[index];

        while (temp != null) {
            if (temp.key == key) {
                temp.value = value; // update
                return;
            }
            if (temp.next == null)
                break;
            temp = temp.next;
        }

        temp.next = new Node(key, value); // insert
    }

    // Get value
    public int get(int key) {
        int index = hash(key);
        Node temp = map[index];

        while (temp != null) {
            if (temp.key == key)
                return temp.value;
            temp = temp.next;
        }

        return -1;
    }

    // Remove key
    public void remove(int key) {
        int index = hash(key);
        Node temp = map[index];
        Node prev = null;

        while (temp != null) {
            if (temp.key == key) {
                if (prev == null)
                    map[index] = temp.next;
                else
                    prev.next = temp.next;
                return;
            }
            prev = temp;
            temp = temp.next;
        }
    }
}