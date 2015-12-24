public abstract class Fahrzeug {

    private String _kennzeichen;
    private boolean _istBenziner;
    private COLOR _color;
    private int _ps;
    
    protected Fahrzeug(String kennzeichen, boolean istBenziner, COLOR color, int ps) {
        this._kennzeichen = kennzeichen;
        this._istBenziner = istBenziner;
        this._color = color;
        this._ps = ps;
    }

    public String getKennzeichen() {
        return this._kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this._kennzeichen = kennzeichen;
    }

    public boolean isIstBenziner() {
        return this._istBenziner;
    }

    public void setIstBenziner(boolean istBenziner) {
        this._istBenziner = istBenziner;
    }

    public COLOR getColor() {
        return this._color;
    }

    public void setColor(COLOR color) {
        this._color = color;
    }

    public int getPs() {
        return this._ps;
    }

    public void setPs(int ps) {
        this._ps = ps;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;

        Fahrzeug fahrzeug = (Fahrzeug)obj;

        if (this.getKennzeichen() != fahrzeug.getKennzeichen())
            return false;
        if (this.isIstBenziner() != fahrzeug.isIstBenziner())
           return false;
        if (this.getColor() != fahrzeug.getColor())
           return false;
        if (this.getPs() != fahrzeug.getPs())
           return false;
       
        return true;
    }

    @Override
    public String toString() {
        return "Fahrzeug: {kennzeichen=" + this._kennzeichen + ", istBenziner=" + this._istBenziner + ", color=" + this._color + ", ps=" + this._ps + "}";
    }
}
