package models;

import com.avaje.ebean.Model;

import play.data.format.Formats;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Sharukh on 5/18/16.
 */
public class Reservation extends Model {

    @Id
    @GeneratedValue
    public Long id;

    public Guest guest;

    @Formats.DateTime(pattern = "yyyy-MM-dd")
    public Date check_in;

    @Formats.DateTime(pattern = "yyyy-MM-dd")
    public Date check_out;

    public String room_type;

    public String type_of_stay;

    public float amount_paid;
}
