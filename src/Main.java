public class Main {
    public static void main(String[] args)
    {
        EratosthenesPrimeSieve sieve = new EratosthenesPrimeSieve(100);
        System.out.println(sieve.isPrime(53));
        sieve.printPrimes();
    }


}


