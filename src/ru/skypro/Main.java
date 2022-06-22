package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String firstName = "семён ";
        String middle = "семёнович ";
        String lastName = "иванов ";
        String fullName = firstName + middle + lastName;
        System.out.println("ФИО сотрудника - " + fullName);
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName);
        fullName = fullName.replace('ё', 'е');
        fullName = fullName.replace('Ё', 'Е');
        System.out.println("Данные ФИО сотрудника для заполнения отчета без 'Ё' - " + fullName);


        System.out.println("");
        System.out.println("Дополнительные задания");
        System.out.println("");
        firstName = "";
        middle = "";
        lastName = "";
        int i;
        int j = 0;
        for (i = 0; i <= fullName.length() - 1; i++) {
            if (fullName.charAt(i) == ' ') {
                j = i;
                break;
            } else {
                firstName = firstName + fullName.charAt(i);
            }
        }
        for (i = j + 1; i <= fullName.length() - 1; i++) {
            if (fullName.charAt(i) == ' ') {
                j = i;
                break;
            } else {
                middle = middle + fullName.charAt(i);
            }
        }
        for (i = j + 1; i <= fullName.length() - 1; i++) {
            if (fullName.charAt(i) == ' ') {
                j = i;
                break;
            } else {
                lastName = lastName + fullName.charAt(i);
            }
        }
        System.out.println("Имя сотрудника - " + firstName);
        System.out.println("Отчество сотрудника - " + middle);
        System.out.println("Фамилия сотрудника - " + lastName);
        fullName = "ivanov ivan ivanovich";

        char[] result = fullName.toCharArray();
        System.out.println();
        fullName = "";
        for (int i1 = 0; i1 < result.length; i1++) {

            if (i1 == 0) {
                fullName = fullName + Character.toUpperCase(result[0]);

            }
            if (result[i1] == ' ') {
                result[i1 + 1] = Character.toUpperCase(result[i1 + 1]);
                fullName = fullName + ' ';
            } else {
                fullName = fullName + result[i1];
            }
        }
        System.out.println("ФИО - " + fullName);

        String first = "135";
        String two = "246";
        String full = "";
        for (i = 0; i < first.length(); i++) {
            full = full + first.charAt(i) + two.charAt(i);
        }
        System.out.println("fullName = " + full);

        String str = "aabccddefgghiijjkk";
        String strNew = "";
        for (i = 0; i < str.length(); i++) {
            for (int g = 0; g < str.length(); g++) {
                if (str.charAt(i) == str.charAt(g) && i != g) {
                        strNew = strNew + str.charAt(i);
                    i++;
                }
            }
        }
        System.out.println("Новая строка без повторений " + strNew);

    }
}
