package sda.pawoj.model;

public abstract class Location {
    private String name;
    private String voivodeship;
    private LocationType locationType;

    public Location(String name, String voivodeship, LocationType locationType) {
        this.name = name;
        this.voivodeship = voivodeship;
        this.locationType = locationType;
    }

    public String getName() {
        return name;
    }

    public String getVoivodeship() {
        return voivodeship;
    }

    public LocationType getLocationType() {
        return locationType;
    }

    public abstract String sayGreeting();
}
