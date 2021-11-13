public class Main {
    public static void main(String[] args){
        LogicalOperation op = new LogicalOperation();
        System.out.println("Exercitiul 1: ");
        op.getNumaratoare(1,100);
        System.out.println("Exercitiul 2: ");
        op.getNumaratoareInversa(2,-100);
        System.out.println("Exercitul 3:");
        op.getNumaratoareParameters(2,6);
        System.out.println("Exercitul 4:");
        op.getNumaratoareParametersCompared(2,6);
        System.out.println("Exercitiul 4:");
        System.out.println("Exercitiul 5:");
        op.getEnumerationEvenNumbers(1,100);
    }

}
