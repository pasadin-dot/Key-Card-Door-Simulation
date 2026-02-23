public class Simulation {
    public static void main(String[] args) {
        //Create CardLock & Door
        CardLock lock = new CardLock();
        Door door = new Door(lock);

        //Create student card
        SmartCard studCard = new SmartCard("Ali");

        //Attempts to swipe student card
        lock.swipeCard(studCard);
        System.out.println("Student Card is swiped.");
        door.open();

        //Create staff card
        SmartCard staffCard = new SmartCard("Mdm Sita");
        staffCard.setStaff(true); //Make staffCard a staff card

        //Attempts to swipe staffCard
        lock.swipeCard(staffCard);
        System.out.println("Staff Card is swiped");
        door.open();
    }
}