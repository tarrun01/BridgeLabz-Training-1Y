package com.logisticsroutetracker;

public class DeliveryCheckpoint extends Checkpoint {

    public DeliveryCheckpoint(String checkpointId, String locationName, double distanceFromLast,
                               double expectedDuration, double actualDuration) {
        super(checkpointId, locationName, distanceFromLast, expectedDuration, actualDuration);
    }

    @Override
    public boolean isCritical() { return true; }

    @Override
    public String getType() { return "DeliveryCheckpoint"; }

    @Override
    public double calculatePenalty() {
        if (!isDelayed()) return 0.0;
        return (actualDuration - expectedDuration) * 2;
    }
}
