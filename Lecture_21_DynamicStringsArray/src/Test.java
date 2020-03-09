public class Test {
    public static void main(String[] args) {
        DynamicStringsArray dsa = new DynamicStringsArray();

        dsa.add("A");
        dsa.add("B");
        dsa.add("C");
        dsa.add("D");
        dsa.add("E");

        System.out.println(dsa);

        dsa.clip();

        System.out.println(dsa);

        dsa.remove(2);

        System.out.println(dsa);

        dsa.clear(true);

        System.out.println(dsa);

    }
}
