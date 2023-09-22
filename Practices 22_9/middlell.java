public class middlell {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public middlell insert(middlell list, int data) {
        Node curr = list.head;
        Node new_node = new Node(data);
        if (curr == null) {
            list.head = new_node;
        } else {
            while (curr.next != null) {
                curr = curr.next;
            }

            curr.next = new_node;

        }
        return list;
    }

    public int display(middlell list) {
        Node curr = list.head;
        int count = 0;
        while (curr != null) {
            count++;
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
        return count;
    }

    public void midelement(middlell list, int count) {
        int mid = count / 2;
        System.out.println(mid);
        Node curr = list.head;
        int i = -1;

        while (curr != null) {
            i++;
            if (i == mid) {
                System.out.println(curr.data);
            }
            curr = curr.next;

        }

    }

    public middlell singletodoule(middlell list) {
        Node curNode = list.head;
        Node headnode = list.head;

        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = headnode;

        return list;
    }

    public void displaydouble(middlell list, int count) {
        if (count == 0) {
            System.out.println("no element");
        } else if (count == 1) {
            System.out.println(list.head.data);
        } else {

            Node curr = list.head;
            int c = 0;
            while (c != count) {
                c++;
                System.out.print(curr.data + " -> ");
                curr = curr.next;
            }
            System.out.println(list.head.data);
        }
    }

    public middlell revsublinkedlist(middlell list, int m, int n) {

        Node m_prev = null;
        Node n_next = null;
        Node m_curr = list.head;
        Node n_curr = list.head;
        int m1 = 1;
        int n1 = 1;
        // 2 , 3 , 5
        while (m1 != m) {
            m1++;
            m_prev = m_curr;
            m_curr = m_curr.next;
        }

        while (n1 != n) {
            n1++;
            n_curr = n_curr.next;
            n_next = n_curr.next;
        }

        // ------------> for reverse
        Node m_node = m_curr;
        Node prev = null;
        Node current = m_curr;

        while (current != n_next) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        m_curr = prev;

        m_prev.next = m_curr;
        m_node.next = current;

        return list;
    }

    public static void main(String[] args) {
        middlell list = new middlell();

        list.insert(list, 50);
        list.insert(list, 51);
        list.insert(list, 52);
        list.insert(list, 53);
        list.insert(list, 55);
        list.insert(list, 56);

        int count = list.display(list);
        System.out.println(count);
        // list.midelement(list, count);

        // list.singletodoule(list);
        list.displaydouble(list, count);

        list.revsublinkedlist(list, 2, 4);
        list.display(list);

    }

}
