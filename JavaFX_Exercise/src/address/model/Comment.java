package address.model;

import java.time.LocalDate;

import address.util.LocalDateAdapter;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Model class for a Person.
 *
 * @author Marco Jakob
 */
public class Comment {

/*    private final StringProperty usrName;
    private final StringProperty cmtChinese;
    private final StringProperty street;
    private final IntegerProperty cmtTime;
    private final StringProperty city;
    private final ObjectProperty<LocalDate> birthday;*/

    private final StringProperty usrName;
    private final StringProperty cmtChinese;
    private final StringProperty street;
    private final IntegerProperty cmtTime;
    private final StringProperty city;
    private final ObjectProperty<LocalDate> birthday;


    /**
     * Default constructor.
     */
    public Comment() {
        this(null, null);
    }

    /**
     * Constructor with some initial data.
     *
     * @param usrName
     * @param cmtChinese
     */
    public Comment(String usrName, String cmtChinese) {
        this.usrName = new SimpleStringProperty(usrName);
        this.cmtChinese = new SimpleStringProperty(cmtChinese);

        // Some initial dummy data, just for convenient testing.
        this.street = new SimpleStringProperty("Xueyuan Road");
        this.cmtTime = new SimpleIntegerProperty(518055);
        this.city = new SimpleStringProperty("Shenzhen");
        this.birthday = new SimpleObjectProperty<LocalDate>(LocalDate.of(1999, 2, 21));
    }

    public String getFirstName() {
        return usrName.get();
    }

    public void setFirstName(String usrName) {
        this.usrName.set(usrName);
    }

    public StringProperty firstNameProperty() {
        return usrName;
    }

    public String getLastName() {
        return cmtChinese.get();
    }

    public void setLastName(String cmtChinese) {
        this.cmtChinese.set(cmtChinese);
    }

    public StringProperty lastNameProperty() {
        return cmtChinese;
    }

    public String getStreet() {
        return street.get();
    }

    public void setStreet(String street) {
        this.street.set(street);
    }

    public StringProperty streetProperty() {
        return street;
    }

    public int getPostalCode() {
        return cmtTime.get();
    }

    public void setPostalCode(int cmtTime) {
        this.cmtTime.set(cmtTime);
    }

    public IntegerProperty postalCodeProperty() {
        return cmtTime;
    }

    public String getCity() {
        return city.get();
    }

    public void setCity(String city) {
        this.city.set(city);
    }

    public StringProperty cityProperty() {
        return city;
    }
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    public LocalDate getBirthday() {
        return birthday.get();
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday.set(birthday);
    }

    public ObjectProperty<LocalDate> birthdayProperty() {
        return birthday;
    }
}