import java.util.ArrayList;
import java.util.List;

public class PG2MasterProgramm {

    public static void main(String[] args) {
        // Beispiel einer ArrayList, die SuperClass, SubClass beinhalten kann
        
        ArrayList<SuperClass> list = new ArrayList<SuperClass> ();
        list.add(new SubClass());
        list.add(new SuperClass());
    }

}
