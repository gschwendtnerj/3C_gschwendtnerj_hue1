public class EratosthenesPrimeSieve implements PrimeSieve {

    private final int UPPER_LIMIT;
    private static boolean[] primenumbers;

    public EratosthenesPrimeSieve(int UPPER_LIMIT)
    {
        this.UPPER_LIMIT = UPPER_LIMIT;
    }

    private void initializePrimes()
    {
        primenumbers = new boolean[UPPER_LIMIT+1];
        for(int i = 0; i<UPPER_LIMIT+1;i++)
        {
            primenumbers[i] = true;
        }
    }

    @Override
    public boolean isPrime(int p) {
        initializePrimes();

        for(int i = 2; i<=UPPER_LIMIT;i++)
        {


            if(primenumbers[i])
            {
                if(i == p)
                {
                    return true;
                }

                for(int j = i;j<=UPPER_LIMIT;j++)
                {
                    int primeIndex = i*j;
                    if(primeIndex<=UPPER_LIMIT)
                    {
                        primenumbers[primeIndex] = false;
                    }
                }
            }

        }
        return false;
    }

    @Override
    public void printPrimes() {
      initializePrimes();
        System.out.println("Primzahlen:");
        for(int i = 2; i<UPPER_LIMIT+1;i++)
        {
            if (primenumbers[i]) {
                System.out.println(i);

                for (int j = i; j < UPPER_LIMIT+1; j++) {
                    int primeIndex = i * j;
                    if (primeIndex < UPPER_LIMIT+1) {
                        primenumbers[primeIndex] = false;
                    }
                }
            }
        }
    }



}
