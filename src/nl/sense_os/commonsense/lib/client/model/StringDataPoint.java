package nl.sense_os.commonsense.lib.client.model;

public class StringDataPoint extends DataPoint {

    protected StringDataPoint() {
        // empty protected constructor
    }

    public final String getValue() {
        return getRawValue();
    }
}
