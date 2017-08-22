package com.rrt.leverton;

public class HashAdler32 {

    final int PRIME_MOD = 65521;

    /* From wikipedia:
        An Adler-32 checksum is obtained by calculating two 16-bit checksums A and B and concatenating their bits
        into a 32-bit integer. A is the sum of all bytes in the stream plus one, and B is the sum of the individual
        values of A from each step.

        At the beginning of an Adler-32 run, A is initialized to 1, B to 0. The sums are done modulo 65521
        (the largest prime number smaller than 216). The bytes are stored in network order (big endian), B
        occupying the two most significant bytes.
     */

    private int adler32(String s) {
        int a = 1;
        int b = 0;
        for (byte c: s.getBytes()) {
            a = (c + a) % PRIME_MOD;
            b = (b + a) % PRIME_MOD;
        }
        return (b * 65536) + a;
    }

    public String adler32String(String s) {
        return Integer.toHexString(adler32(s));
    }
}
