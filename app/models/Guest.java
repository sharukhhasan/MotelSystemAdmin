package models;

import com.avaje.ebean.Model;

import play.data.format.Formats;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Sharukh on 5/18/16.
 */
@Entity
@Table(name = "guests")
public class Guest extends Model {

    @Id
    @GeneratedValue
    public Long id;

    public String first_name;

    public String last_name;

    public String gender;

    public String plate_number;

    @Formats.DateTime(pattern = "yyyy-MM-dd")
    public Date birthdate;



}
