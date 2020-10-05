public class VariableTypes {

    public static void main(String[] args) {
        
        byte verySmallNum = 6;
        // byte	1 byte Stores whole numbers from -128 to 127

        short slightlyBiggerNum = 300;
        // short 2 bytes Stores whole numbers from -32,768 to 32,767

        int evenBiggerNum = 100000;
        // int 4 bytes Stores whole numbers from -2,147,483,648 to 2,147,483,647

        long biggestInt = 83906834;
        // long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        float decimalNum = 9.15f;
        // float 4 bytes Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits

        double bigDecimalNum = 3.999999;
        // double 8 bytes Stores fractional numbers. Sufficient for storing 15 decimal digits

        boolean isTrue = true;
        // boolean 1 bit Stores true or false values

        char letter = 'a';
        // char	2 bytes	Stores a single character/letter or ASCII values

        System.out.println(verySmallNum);
        System.out.println(slightlyBiggerNum);
        System.out.println(evenBiggerNum);
        System.out.println(biggestInt);
        System.out.println(decimalNum);
        System.out.println(bigDecimalNum);
        System.out.println(isTrue);
        System.out.println(letter);
        
        // System.out.println = sysout + tab
    }
    
}
