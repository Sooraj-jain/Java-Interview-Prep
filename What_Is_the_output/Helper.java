package What_Is_the_output;

import java.util.ArrayList;

/**
 * Created by sj042124 on 20/06/19.
 */
public class Helper {

    void modifyOriginalObject(ArrayList<String> list) {

        //list.clear();
        list.add("New");

        list = new ArrayList<String>();
        list.add("Old");
    }
}

