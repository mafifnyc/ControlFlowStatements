public class MultiplicationTable {
    public MultiplicationTable(int a) {
        for(int i=1; i<=10; i++ ) {
            System.out.println(a*i);
        }
    }
    public static void main(String[] args) {
        MultiplicationTable m = new MultiplicationTable(5);
    }
}
