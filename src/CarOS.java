public class CarOS {

    public String lastUpdate;

    public void update(String updatePackage){

        this.lastUpdate = updatePackage;
    }

    public CarOS(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CarOS{");
        sb.append("lastUpdate='").append(lastUpdate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
