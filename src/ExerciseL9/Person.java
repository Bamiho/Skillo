package ExerciseL9;

import java.time.LocalDate;

public class Person {

    String name;
    char sex;
    String religion;
    String language;
    String job;
    String nationality;
    String egn;
    LocalDate birthDate;
    int age;
    String country;

    public Person(String name, char sex, String religion, String language, String job, String nationality, String egn, String country) {
        this.name = name;
        this.sex = validateSex(sex);
        this.religion = religion;
        this.language = language;
        this.job = job;
        this.nationality = nationality;
        this.egn = validateEGN(egn);
        this.country = country;
        this.birthDate = getBirthDate(egn);
        this.age = getAge(birthDate);
    }

    private int getAge(LocalDate birthDate) {
        return LocalDate.now().getYear() - birthDate.getYear();
    }

    private LocalDate getBirthDate(String egn) {
        int birthYear = Integer.parseInt(egn.substring(0, 2));
        int birthMonth = Integer.parseInt(egn.substring(2, 4));
        int birthDay = Integer.parseInt(egn.substring(4, 6));

        if (birthMonth > 40) {
            birthYear += 2000;
            birthMonth -= 40;
        } else {
            birthYear += 1900;
        }
        return LocalDate.of(birthYear, birthMonth, birthDay);
    }

    private String validateEGN(String egn) {
        if (egn.length() == 10 && containsOnlyDigits(egn)) {
            return egn;
        } else {
            throw new IllegalArgumentException("The EGN must consist of 10 digits!");
        }
    }

    private boolean containsOnlyDigits(String egn) {
        try {
            if (Long.parseLong(egn)>0){
                return true;
            } else {
                return false;
            }

        } catch(NumberFormatException e){
            return false;
        }
    }
    private char validateSex(char sex) {
        char lowercaseSex = Character.toLowerCase(sex);
        if (lowercaseSex == 'm' || lowercaseSex == 'f') {
            return lowercaseSex;
        } else {
            throw new IllegalArgumentException("Invalid sex input!");
        }
    }
}
