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
@Table(name = "reservations")
public class Reservation extends Model {

    @Id
    @GeneratedValue
    public Long id;

    public String guest;

    @Formats.DateTime(pattern = "yyyy-MM-dd")
    public Date check_in;

    @Formats.DateTime(pattern = "yyyy-MM-dd")
    public Date check_out;

    public String room_type;

    public String type_of_stay;

    public float amount_paid;
}
