package Dav3;

import java.time.LocalDate;

public class Student
{
    private String name;
    private String lastname;
    private LocalDate birthdate;
    private String university;


    Student(String name, String lastname, LocalDate birthdate, String university)
    {
        this.name = name;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.university = university;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }
    public String getLastname()
    {
        return lastname;
    }

    public void setBirthdate(LocalDate birthdate)
    {
        this.birthdate = birthdate;
    }
    public LocalDate getBirthdate()
    {
        return birthdate;
    }

    public void setUniversity(String university)
    {
        this.university = university;
    }
    public String getUniversity()
    {
        return university;
    }

    int Age()
    {
        LocalDate age = LocalDate.now();

        age = age.minusYears(birthdate.getYear());

        if(age.getMonthValue() < birthdate.getMonthValue())
        {
            return age.getYear() - 1;
        }
        if(age.getMonthValue() == birthdate.getMonthValue())
        {
            if(age.getDayOfMonth() > birthdate.getDayOfMonth())
            {
                return age.getYear() - 1;
            }
        }
        return age.getYear();
    }
}
