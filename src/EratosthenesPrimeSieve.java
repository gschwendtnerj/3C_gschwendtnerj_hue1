public class EratosthenesPrimeSieve implements PrimeSieve {

    private int upperLimit;

    public EratosthenesPrimeSieve(int upperLimit)
    {
        this.upperLimit = upperLimit;
    }

    @Override
    public boolean isPrime(int p) {
        boolean[] primenumbers = new boolean[upperLimit];
        for(int i = 0; i<upperLimit;i++)
        {
            primenumbers[i] = true;
        }

        for(int i = 2; i<upperLimit;i++)
        {
            if(i<2)
            {
                primenumbers[i] = false;
            }

            if(primenumbers[i]==true)
            {
                if(i == p)
                {
                    return true;
                }

                for(int j = i;j<upperLimit;j++)
                {
                    int primeIndex = i*j;
                    if(primeIndex<upperLimit)
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
        boolean[] primenumbers = new boolean[upperLimit];
        for(int i = 0; i<upperLimit;i++)
        {
            primenumbers[i] = true;
        }
        System.out.println("Primzahlen:");
        for(int i = 2; i<upperLimit;i++) {
            if (i < 2) {
                primenumbers[i] = false;
            }

            if (primenumbers[i] == true) {
                System.out.println(i);

                for (int j = i; j < upperLimit; j++) {
                    int primeIndex = i * j;
                    if (primeIndex < upperLimit) {
                        primenumbers[primeIndex] = false;
                    }
                }
            }
        }
    }



}
