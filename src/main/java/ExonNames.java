package main.java;

/*
Module 2 Task 37-45
*/

public class ExonNames {
    public boolean areNamesEqual(String name1, String name2) {
        return  name1.equals(name2);
    }
    public String makeFullName(String firstName, String lastName) {
        return (firstName.toLowerCase() + " " + lastName.toUpperCase());
    }
    public boolean isNameLucky(String name) {
        return name.toLowerCase().contains("a") || name.toLowerCase().contains("o");
    }
    public String getNameCode(String name) {
        String getCode = new String();
        int nameLength = name.length() ;
        if (nameLength == 1) {
            getCode = String.valueOf(name.charAt(0));
        } else {
            getCode = String.valueOf(name.charAt(0)) + String.valueOf(name.charAt(name.length() - 1));
        }
        return getCode.toUpperCase();
    }
    public boolean isMoneyName(String name) {
        char symbolFirst = name.charAt(0);
        char symbolLast = name.charAt(name.length() - 1);
        boolean isDigit = (symbolFirst >= '0' && symbolFirst <= '9') && (symbolLast >= '0' && symbolLast <= '9');
        return isDigit;
    }
    public boolean isInvisibleName(String name) {
        return name.isBlank();
    }

    public String makeNamePositive(String name) {
        return name.toLowerCase().replace("no", "yes");
    }

    public String makeNameClean(String name) {
        return "CLEAN" + name.strip() + "CLEAN";
    }

    public String makeHalfOfName(String name) {
        return name.substring(0, name.length() / 2);
    }

    //Test output
    public static void main(String[] args) {
        ExonNames names = new ExonNames();

        //Should be true
        boolean namesEqual = names.areNamesEqual("nm", "nm");
        System.out.println("names.areNamesEqual(\"nm\", \"nm\") = " + namesEqual);
        System.out.println("makeFullName = " + names.makeFullName("Exor", "Max"));
        System.out.println("isNameLucky = " + names.isNameLucky("Igun"));
        String getCode = names.getNameCode("Morat");
        System.out.println("getNameCode = " + names.getNameCode("x"));
        System.out.println("isMoneyName = " + names.isMoneyName("7Max9"));
        System.out.println("isInvisibleName = " + names.isInvisibleName(" java "));
        System.out.println("makeNamePositive = " + names.makeNamePositive("Nomad"));
        System.out.println("makeNameClean = " + names.makeNameClean("bigar"));
        System.out.println("makeHalfOfName = " + names.makeHalfOfName("Javametro"));


    }
}
