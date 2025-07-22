package Java_Basic_Programs;

public class StringFunctions {
    public static void main(String[] args) {

        String str1 = "Hello";                      // Creates or reuses "Hello" in the String Constant Pool (SCP)
        String str2 = "Hello";                      // Reuses the "Hello" from the String Constant Pool (SCP)
        String str3 = new String("Hello");   // Creates a new object on the Object Area (OA)

        // ------------------ Checks reference equality, not content ------------------

        System.out.println(str1 == str2);           // Both refer to the same object in the SCP
        //OUTPUT : true

        System.out.println(str1 == str3);           // str3 is a new object in the OA
        //OUTPUT : false

        // --------------- Use equals() to compare the content of strings ---------------

        System.out.println(str1.equals(str3));      // Because the content is the same
        //OUTPUT : true

        // For Practice
        String name = "Avinash";
        String name2 = "Avinash Sinha";

        // 1. charAt() - Returns the character at the specified index.
        System.out.println(name.charAt(3));

        //OUTPUT : n

        // 2. concat("text") - Concatenates the specified text to the end of the string.
        System.out.println(name.concat(" Sinha"));

        //OUTPUT : Avinash Sinha

        // 3. contains("sequence") - Checks if the string contains a specific sequence of characters.
        System.out.println(name.contains("Avinash"));

        //OUTPUT : true

        // 4. equals("anotherStr") - Checks if two strings have the same value.
        System.out.println(name.equals("Avinash"));

        //OUTPUT : true

        // 5. equalsIgnoreCase("anotherStr") - Checks if two strings are equal, ignoring case.
        System.out.println(name.equalsIgnoreCase("avinash"));

        //OUTPUT : true

        // 6. indexOf()
        System.out.println(name.indexOf('v'));

        //OUTPUT : 1

        // 7. length() - Returns the length of the string.
        System.out.println(name.length());

        //OUTPUT : 7

        // 8. replace('oldChar', 'newChar') - Replaces all occurrences of a character.
        System.out.println(name.replace('n', 'N'));

        //OUTPUT : AviNash

        // 9. split() - Split a string based on a delimiter using split(regex):
        String name3 = "Avinash Sharma";
        String[] split = name3.split("n");
        System.out.println(split[0]);
        System.out.println(split[1]);

        //OUTPUT : Avi
        //         ash Sharma

        // 10. substring(start , end) - Returns a substring from the start index to the end index.
        System.out.println(name.substring(1, 3));

        //OUTPUT : vi

        // 11. toLowerCase() - Converts all characters to lowercase.
        System.out.println("AVINASH".toLowerCase());

        //OUTPUT : avinash

        // 12. toUpperCase() - Converts all characters to uppercase.
        System.out.println("avinash".toUpperCase());

        //OUTPUT : AVINASH

        // 13. replaceAll()
        System.out.println(name2.replaceAll(" ", " Kumar "));

        //OUTPUT : Avinash Kumar Sinha

        // 14. startsWith("prefix") - Checks if the string starts with a specific sequence.
        System.out.println(name.startsWith("A"));

        //OUTPUT : true

        // 15. endsWith("suffix") - Checks if the string ends with a specific sequence.
        System.out.println(name.endsWith("a"));

        //OUTPUT : false

        // 16. isEmpty()
        System.out.println(name.isEmpty());

        //OUTPUT : false

        // 17. trim() - Removes any leading and trailing whitespace from the string.
        String name4 = "    Avinash Sinha     ";
        System.out.println(name4.trim());

        //OUTPUT : Avinash Sinha

        // 18. compareTo(anotherStr) - Compares two strings lexicographically.
        System.out.println(name.compareTo("Avinash"));

        //OUTPUT : 0

        // 19. compareToIgnoreCase()
        System.out.println(name.compareToIgnoreCase("avinash"));

        //OUTPUT : 0

        // 20. lastIndexOf()
        System.out.println(name.lastIndexOf("a"));

        //OUTPUT : 4

        // 21. repeat()
        System.out.println(name.repeat(2));

        //OUTPUT : AvinashAvinash


        // -------------------- String Builder --------------------

        StringBuilder stringBuilder = new StringBuilder("Avinash");
        stringBuilder.append("Sinha");
        System.out.println(stringBuilder);

        //OUTPUT : AvinashSinha

        StringBuilder sb = new StringBuilder("Hi");
        sb.append(" It's my World!");
        System.out.println(sb.toString());

        //OUTPUT : Hi It's my World!


        // -------------------- String Buffer --------------------

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        stringBuffer.append("Dutta");
        System.out.println(stringBuffer);

        //OUTPUT : PramodDutta

        stringBuffer.reverse();
        System.out.println(stringBuffer);

        //OUTPUT : attuDdomarP


        // -------------------- String --------------------

        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2;        // Creates a new string "Hello World!"

        System.out.println(s3);

        // OUTPUT : Hello World!

        System.out.println(s1);

        // OUTPUT : Hello
    }
}
