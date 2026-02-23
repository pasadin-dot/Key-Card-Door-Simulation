public class SmartCard {
    private String ownerName;
    private boolean isStaff;

    public SmartCard(String name) {
        this.ownerName = name;
        this.isStaff = false;
    }

    public String getOwner() {
        return ownerName;
    }

    public boolean isStaff() {
        return isStaff;
    }

    public void setStaff(boolean status) {
        isStaff = status;
    }
}
