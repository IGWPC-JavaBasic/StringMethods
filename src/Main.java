public class Main {
    public static void main(String[] args) {
//        int myInt = 123;
//        System.out.println(myInt.length());

//        String method : length()
        String str = "Java: int cannot be referenced";
        int strLength = str.length();
        System.out.println("str length : " + strLength);

//        String method : toUpperCase()
        String strUpper = str.toUpperCase();
        System.out.println(strUpper);
//        Original String can not change Upper Case Letter
        System.out.println(str);

//        String method : toLowerCase()
        String strLower = str.toLowerCase();
        System.out.println(strLower);

//        String method : indexOf()
        String str2 = "apple apple";
        int pPos = str2.indexOf("p");
        System.out.println("first p pos : " + pPos);

//        String method : lastIndexOf()
        pPos = str2.lastIndexOf("p");
        System.out.println("last p pos : " + pPos);

//        l pos
        int lPos = str2.indexOf("l");
        System.out.println("l pos : " + lPos);

//        if not exists return -1
        int rPos = str2.indexOf("r");
        System.out.println("r pos : " + rPos);

//        String method : charAt
        String str3 = "Happy new year 2023"; // 0 - 18
        char charVal = str3.charAt(4);
        System.out.println("pos 4 of char : " + charVal);
//        the char you search by position is out of string range
//        occurs Exception error
//        charVal = str3.charAt(30);
//        System.out.println(charVal);

//        String method : concat()
        String pieceOne = "Hello";
        String pieceTwo = "World";
        String pieceCombine = pieceOne.concat(" " + pieceTwo);
        System.out.println(pieceCombine);

//        String vs String compare
//         0 => equal
//        !0 (differences) => not equal
        String myStr1 = "Nice";
        String myStr2 = "Nice";
        String myStr3 = "NICE";
        int comRes = myStr1.compareTo(myStr2);
        System.out.println(comRes);

        int comRes1 = myStr1.compareTo(myStr3);
        System.out.println(comRes1);

//        String method : contains()
        String str4 = "Today is Wednesday. Yesterday is Tuesday.";
        boolean isExistWednesday = str4.contains("Wednesday");
        System.out.println("isExistWednesday : " + isExistWednesday);

        boolean isExistFriday = str4.contains("Friday");
        System.out.println("isExistFriday : " + isExistFriday);

//        String method : endsWith()
        boolean isEndsWithTuesday = str4.endsWith("Tuesday.");
        System.out.println("isEndsWithTuesday : " + isEndsWithTuesday);

//        String method : startsWith()
        boolean isStartsWithToday = str4.startsWith("Today");
        System.out.println("isStartsWithToday : " + isStartsWithToday);

//        isEmpty method
        String str5 = "";
        boolean isEmptyRes = str5.isEmpty();
        System.out.println(isEmptyRes);

//        String method : equals()
        String oneStr = "HELLO";
        String twoStr = "hello";
        boolean isEqual = oneStr.equals(twoStr);
        System.out.println("isEqual : " + isEqual);

        isEqual = oneStr.equalsIgnoreCase(twoStr);
        System.out.println("isEqual : " + isEqual);

        int a = 10;
        System.out.println(a / 0);
    }
}