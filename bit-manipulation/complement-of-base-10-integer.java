class Solution {
    public int bitwiseComplement(int n) {

        if(n == 0) return 1;

        String binary = Integer.toBinaryString(n);

        String newstr = "";

        for(int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i) == '0')
                newstr += '1';
            else
                newstr += '0';
        }

        int decimalNumber = Integer.parseInt(newstr, 2);

        return decimalNumber;
    }
}