public class Second {

    public static void main(String[] args) {
        String s;
        int i;
        long l;
        float f;
        double d;

        int x = Integer.MAX_VALUE;
        x = x + 1;
        System.out.println(x); //-2147483648

        int y = Integer.MIN_VALUE;
        y = y - 1;
        System.out.println(y); //2147483647

        double z = Double.MAX_VALUE;
        z = z * 2;

//        System.out.println(z); //inf
//
//        System.out.println(z / 0);		// +infinity
//        System.out.println(-2.0f / 0);   // -infinity
//        System.out.println(2 / 0);		// error - divide by 0
//        System.out.println(Double.POSITIVE_INFINITY - Double.POSITIVE_INFINITY);		// inf - inf = NaN
//        System.out.println(Double.NEGATIVE_INFINITY * Double.POSITIVE_INFINITY);	// inf * (-inf) = -inf
		
		/*boolean a;
		int b;
		a = b;
		System.out.println(aux * z);	// ERR: Cannot convert boolean to int
		*/

        f=222.54324214135f; //it cuts the decimals to max 5
        System.out.println(f);
        f=f+2.55115115532555f;
        System.out.println(f);
    }

}