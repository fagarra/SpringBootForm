package desarrollosoftwareisabados.springbootform;
import java.sql.Date;
/*import org.springframework.format.annotation.*;
import org.springframework.validation.*;
import org.springframework.validation.annotation.Validated.*;*/


public class User {

/*
    @Size(min = 3, max = 50)
    private String name;

    @NotBlank
    @Email(message = "Please enter a valid e-mail address")
    private String email;

    @NotBlank
    @Size(min = 8, max = 15)
    private String password;

    @NotBlank
    private String gender;

    @Size(max = 100)
    private String note;

    @AssertTrue
    private boolean married;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date birthday;

    @NotBlank
    private String profession;

    @Min(value = 20_000)
    @Max(value = 200_000)
    private long income;
**/


    private String name;
    private String email;
    private String password;
    private String gender;
    private String note;
    private boolean married;
    private Date birthday;
    private String profession;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    //private String profession;
    @Override
    public String toString() {
        return "User [name=" + name + ", email=" + email + ", password=" + password + ", gender=" + gender + ", note="
                + note + ", married=" + married + ", birthday=" + birthday + ", profession=" + profession + "]";
    }
}
