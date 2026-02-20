package func;

public class Main {

    public static void main(String[] args) {

        FuncList empty = new FuncList();

        FuncList list = empty.cons(3)
                .cons(2)
                .cons(1);

        System.out.println(list);      // [1, 2, 3]
        System.out.println(list.head()); // 1
        System.out.println(list.tail()); // [2, 3]

        // original list remains unchanged
        System.out.println(list);      // [1, 2, 3]
    }
}