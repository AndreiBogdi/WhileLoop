public class LogicalOperation {
    public void getNumaratoare(int start, int max) {
        while (start <= 100) {

            System.out.println(start);
            start++;

        }
    }

    public void getNumaratoareInversa(int start, int max) {
        start = 2;
        while (start >= -100) {
            System.out.println(start);
            start--;
        }
    }

    public void getNumaratoareParameters(int x, int y) {
        x = 2;
        y = 6;
        while (x <= y) {
            System.out.println(x);
            x++;
        }
    }

    public void getNumaratoareParametersCompared(int x, int y) {
        x = 2;
        y = 6;
        if (x < y) {
            while (x > y) {
                System.out.println(x);
                x++;
            }

        } else {
            while (x < y) {
                System.out.println(y);
                y--;
            }
        }
    }

    public void getEnumerationEvenNumbers(int x, int y) {

        while (x < y) {
            if (x % 2 == 0) {
                System.out.println(x);
                x++;
            }

        }
    }
}

