
class Example22 {
    public static void main(String[] argv) {
        int sum, product, i;
        sum = 0;
        product = 1;
        i=1;

        while ( i <= 10) {
            sum = sum + i;
            product = product * i;
            i = i + 1;

        }
        System.out.println("Sum from 1 to 10:" + sum);
                System.out.println("Product from 1 to 10:"+product);
    }
}