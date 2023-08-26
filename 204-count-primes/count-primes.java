class Solution {
    public int countPrimes(int number) {
        int count=0;
        // int count = 0;
        boolean primes[] = new boolean[number + 1];
        for (int i = 0; i < number; i++) {
            primes[i] = true;
        }
        for (int i = 2; i <Math.sqrt(number); i++) {
            {
                if (primes[i] == true) {
                    for (int j = i * i; j <= number; j = j + i) {
primes[j]=false;
                    }
                }
                }
        }
            for(int i=2;i<=number;i++)
            {
                if(primes[i]==true)
                {
                    count++;
                }
            }
            return count;
            
    }

}