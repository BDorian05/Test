public class Account {
    private long balance;
    private String ownerName;
    private boolean locked;
    public long getBalance(){
        this.balance=100000;
        return balance;
    }
    public String getOwnerName(){
        this.ownerName="Dorian";
        return this.ownerName;
    }

    public boolean isLocked() {
        return locked;
    }
}
