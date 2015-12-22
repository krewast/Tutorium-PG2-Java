public class Bottle {
    
    private BeverageKind _beverageKind;
    
    public Bottle(BeverageKind beverageKind) {
        this._beverageKind = beverageKind;
    }
    
    public BeverageKind getBeverageKind() {
        return this._beverageKind;
    }

    public String toString() {
    	return getBeverageKind().getDescription() + "-Flasche@" + this.hashCode();
    }
}
