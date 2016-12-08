
class Persist {
	public static int persistence(long n) {
    int test = 1;
    int count = 0;
    int persist = 0;
    if (n > 9){
    	while (test < n){
        test *= 10;
        count++;
      }
      int[] remainders = int[count];
      while (n > 9){
	 int remainder = n % 10;
	 remainders[persist] = remainder;
         n /= 10;
	 persist++;
      }
    int remainder = n % 10;
    }else{}
    return persist;
	}
}
