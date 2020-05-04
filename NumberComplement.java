class Solution {
    private static byte getBinary(int num, byte[] binary) {
        byte bits = 0;
        int i = 0;
        while(num != 0) {
           binary[i++] = (byte) (num % 2);
            num /= 2;
            bits++;
        }
        return bits;
    }
    public int findComplement(int num) {
        byte binary[] = new byte[32];
        byte bits = getBinary(num,binary);
        int complement = 0;
        for(int i=0; i<bits; ++i) {
            byte reverseBit = (binary[i] == (byte)1)?(byte)0:(byte)1;
            complement += ((int) Math.pow(2,i) * reverseBit);
        }
        return complement;
    }
}