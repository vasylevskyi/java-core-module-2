package main.java;

/*
Module 2 Task 46
*/

//Напиши клас NameEncoderDecoder, у якого будуть два методи:
//
//        метод public String encode(String name) шифруватиме ім'я та повертатиме зашифрований результат
//        метод public String decode(String name) братиме зашифроване ім'я та повертатиме оригінальне ім'я
//        Важливо. Коли успішно розв'яжеш завдання - збережи текст рішення в окремому текстовому файлі. Цей текст буде потрібний тобі у наступному завданні.
//
//        виклик encode("Crab") повертає "NOTFORYOUCr5bYESNOTFORYOU"
//        виклик decode("NOTFORYOUCr5bYESNOTFORYOU") повертає "Crab"
//        виклик decode("NOTFORYOUNOTFORYOUYESNOTFORYOU") повертає "NOTFORYOU"

public class NameEncoderDecoder {
    public String encode(String name) {
        String encName = name.replace('e', '1')
                .replace('u', '2')
                .replace('i', '3')
                .replace('o', '4')
                .replace('a', '5');
        return "NOTFORYOU" + encName + "YESNOTFORYOU";
    }


    public String decode(String name) {
        String decName = name.substring(9, name.length() - 12);
        decName = decName.replace('1', 'e')
                .replace('2', 'u')
                .replace('3', 'i')
                .replace('4', 'o')
                .replace('5', 'a');
        return decName;
    }

    public static void main(String[] args) {
        NameEncoderDecoder newEncoderDecoder = new NameEncoderDecoder();
        System.out.println("encode = " + newEncoderDecoder.encode("Crab"));
        System.out.println("decode = " + newEncoderDecoder.decode("NOTFORYOUNOTFORYOUYESNOTFORYOU"));
    }
}
