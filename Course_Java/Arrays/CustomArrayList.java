import java.util.ArrayList;

public class CustomArrayList<T> {
    private ArrayList<T> list;

    public CustomArrayList() {
        list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    public T get(int index) {
        return list.get(index);
    }

    public int size() {
        return list.size();
    }

    public void print() {
        for (T element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // Create a CustomArrayList for integers
        CustomArrayList<Integer> intList = new CustomArrayList<>();

        intList.add(1);
        intList.add(2);
        intList.add(3);

        System.out.println("Size of intList: " + intList.size());

        System.out.println("Elements in intList:");
        intList.print();

        // Create a CustomArrayList for doubles
        CustomArrayList<Double> doubleList = new CustomArrayList<>();

        doubleList.add(1.1);
        doubleList.add(2.2);
        doubleList.add(3.3);

        System.out.println("Size of doubleList: " + doubleList.size());

        System.out.println("Elements in doubleList:");
        doubleList.print();

        // Create a CustomArrayList for strings
        CustomArrayList<String> stringList = new CustomArrayList<>();

        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");

        System.out.println("Size of stringList: " + stringList.size());

        System.out.println("Elements in stringList:");
        stringList.print();
    }
}
