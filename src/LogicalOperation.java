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

        while (x > y) {
            if (x < y) {
                System.out.println(x);
            } else {
                System.out.println(y);
            }
        }
    }

    public void getEnumerationEvenNumbers ( int x, int y){

        while (x <= 100) {
            if (x % 2 == 0) {
                System.out.println(x);

            }
            x++;
        }
    }
            public void getEnumerationOddNumbers( int x, int y){
                while (x <= 100) {
                    if (x % 2 != 0) {
                        System.out.println(x);
                    }
                    x++;
                }
            }
            public float AverageFromInterval(int start, int max){
        int x=start;
        x=99;
        max=8899;
        float sum=0;
        int count=0;
        while(x<=max){
            sum=sum + x;
            count++;
        }
        return sum;
            }


        }