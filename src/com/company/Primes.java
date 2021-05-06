package com.company;

public class Primes
{
    public static boolean prime(int n)
    {
        for(int i = 2; i < 100; i++)
        {
            if(n == i)
                continue;
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
