package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House 
       extends Building {
       
    // TODO - Put your code here.
    private String mOwner;
    private boolean mPool;

    public House(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
        this.mOwner = null;
        this.mPool = false;
    }

    //another constructor with owner name
    public House(int length, int width, int lotLength, int lotWidth, String owner) {
        super(length, width, lotLength, lotWidth);
        this.mOwner = owner;
        this.mPool = false;
    }

    //another constructor with owner name and pool status
    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool) {
        super(length, width, lotLength, lotWidth);
        this.mOwner = owner;
        this.mPool = pool;
    }

    //getters
    public String getOwner() {
        return mOwner;
    }

    public boolean hasPool(){
        return mPool;
    }

    //setters
    public void setOwner(String owner) {
        this.mOwner = owner;
    }

    public  void setPool(boolean pool) {
        this.mPool = pool;
    }

    @Override
    public String toString() {
        return "Owner: " + (mOwner!=null ? mOwner : "n/a") +
                (hasPool() ? "; has a pool" : "") +
                (calcLotArea() > calcBuildingArea() ? "; has a big open space" : "");
    }

    @Override
    public boolean equals(Object o) {

        House house = (House) o;
        return o instanceof House && (mPool == house.hasPool()) && (calcBuildingArea() == house.calcBuildingArea());

    }
}
