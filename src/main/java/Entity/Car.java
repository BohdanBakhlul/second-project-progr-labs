package Entity;

public class Car  {

    private static final long serialVersionUID = 1L;

    private Integer ID;
    private String creator;
    private String model;
    private String country;
    //private Carspecs carspecs;

    public Car() {}

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

//    public Carspecs getCarspecs() {
//        return carspecs;
//    }
//
//    public void setCarspecs(Carspecs carspecs) {
//        this.carspecs = carspecs;
//    }

}
