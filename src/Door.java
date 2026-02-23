public class Door {
    private CardLock lock;

    public Door(CardLock lock){
        this.lock = lock;
    }

    public void open(){
        if (lock.isUnlocked()){
            System.out.println("Door is opened.");
        } else {
            System.out.println("Door is closed.");
        }
    }
}
