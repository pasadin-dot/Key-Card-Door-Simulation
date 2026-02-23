public class CardLock {
    private SmartCard lastCardSeen;
    private boolean allowStudents = false;

    public void swipeCard(SmartCard card) {
        lastCardSeen = card;
    }

    public SmartCard getLastCardSeen() {
        return lastCardSeen;
    }

    public void toggleStudentAccess(){
        allowStudents = !allowStudents;
    }

    public boolean isUnlocked(){
        if (lastCardSeen == null){
            return false;
        }
        return lastCardSeen.isStaff() || allowStudents;
    }
}
