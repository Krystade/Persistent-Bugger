
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
      count = 0;
      int[] remainders = int[count];
      while (n > 9){
        int remainder = n % 10;
        remainders[count] = remainder;
        n /= 10;
        count++
      }
      placeholder = count;
      for (int i = 0; i < placeholder; i++){
      n *= remainders[count + i]
      }
      System.out.println("n: " + n);
      persist++;
    int remainder = n % 10;
    }else{}
    return persist;
	}
}
