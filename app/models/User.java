package models;

import Util.Encryption;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import play.data.format.*;


@Entity
@Table(name = "users")
public class User extends Model{

    @Id
    @GeneratedValue
    public Long id;
    
    public String email;

    public String firstName;

    public String lastName;

    public String gender;

    public String role;
    
    @Formats.DateTime(pattern = "yyyy-MM-dd hh:mm:ss")
    public Date birthDate;

    public String password;

    public Boolean activated = false;

}
