package person;

import java.time.chrono.IsoChronology;
import java.time.LocalDate;

/**
 *
 * CS 5044 Homework 4
 * 
 * @author Shannon Smith (shae1223)
 * @version 2022.07.13
 *
 */
final public class Person implements Comparable<Person> { 
    
    /**
     * Database to store name, birthday, gender and email address of 
     * one or more persons. 
     * 
     * The purpose of this database is to store the above information.
     * The information can be used by any organization for tracking or 
     * reporting this information (i.e. students, employees, etc). 
     *
     */
    public enum Sex { 
        /**
         * People who identify as Male
         */
        MALE, 

        /**
         * People who identify as Female
         */
        FEMALE
    }
    
    private final String name; 
    private final LocalDate birthday;
    private final Sex gender;
    private final String emailAddress;   
    
   /**
    * Construct a new Person object in the database. 
    *
    * @param name of Person
    * @param birthday of above person
    * @param gender of above person
    * @param emailAddress of above person
    */
    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        if (anyAreNull(name, birthday, gender, emailAddress)) {
            throw new NullPointerException();
        }
        if (anyAreInvalid(name, birthday, emailAddress)) {
            throw new IllegalArgumentException(); 
        }
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }
    
   /**
    * Private helper for constructor. 
    *
    * @param name of Person
    * @param birthday of above person
    * @param emailAddress of above person
    * 
    * @return IllegalArgumentException if:
    *         name is empty
    *         birthday is prior to year 1800 
    *         birthday is past current date
    *         email address is empty
    *         email address does not contain @ symbol
    *         
    */
    private boolean anyAreInvalid(String name, LocalDate birthday, String emailAddress) {
        return  name.equals("") || 
                birthday.compareTo(IsoChronology.INSTANCE.date(1800, 1, 1)) < 0 ||
                birthday.compareTo(IsoChronology.INSTANCE.dateNow()) > 0 ||
                emailAddress.equals("") ||
                !emailAddress.contains("@");
    }
    
   /**
    * Private helper for constructor. 
    *
    * @param name of Person
    * @param birthday of above person
    * @param gender of above person
    * @param emailAddress of above person
    * 
    * @return NullPointerException for:
    *         name is null
    *         birthday is null
    *         gender is null 
    *         emailAddress is null
    *         
    */
    private boolean anyAreNull(String name, LocalDate birthday, Sex gender, String emailAddress) {
        return  name == null || 
                birthday == null || 
                gender == null || 
                emailAddress == null;
    }

    /**
     * Gets the name address of the person.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the birthday address of the person.
     *
     * @return birthday
     */
    public LocalDate getBirthday() {
        return birthday;
    }

    /**
     * Gets the gender address of the person.
     *
     * @return gender
     */
    public Sex getGender() {
        return gender;
    }

    /**
     * Gets the email address of the person.
     *
     * @return email address
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Gets the birthday address of the person.
     *
     * @return birthday
     */
    
    public int getAge() {
        return birthday
            .until(IsoChronology.INSTANCE.dateNow())
            .getYears();
    }

    @Override
    public String toString() {
        return  "(" + name + ", " + birthday + ", " + gender + ", " + emailAddress + ")";
    }
 
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 17;
        result = prime * result + name.hashCode();
        result = prime * result + birthday.hashCode();
        result = prime * result + gender.hashCode();
        result = prime * result + emailAddress.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person that = (Person) obj;        
        if (!this.name.equals(that.name)) {
            return false;
        }
        if (!this.birthday.equals(that.birthday)) {
            return false;
        }
        if (this.gender != that.gender) {
            return false;
        }
        return emailAddress.equals(that.emailAddress);
    }

    @Override
    public int compareTo(Person that) {
        if (!this.name.equals(that.name)) {
            return this.name.compareTo(that.name);
        }
        if (!this.birthday.equals(that.birthday)) {
            return this.birthday.compareTo(that.birthday);
        }
        if (this.gender != that.gender) {
            return this.gender.compareTo(that.gender);
        }
        if (!this.emailAddress.equals(that.emailAddress)) {
            return this.emailAddress.compareTo(that.emailAddress);
        }
        return 0;
    }
    
}
