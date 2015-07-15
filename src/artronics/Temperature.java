package artronics;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

/**
 * Created by jalal on 15/07/15.
 */
public class Temperature {
    private int value;

    public Temperature(int value) {
        this.value = value;
    }

    public Temperature() {
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
    @Override public String toString(){
        return Integer.toString(this.value);
    }
}
