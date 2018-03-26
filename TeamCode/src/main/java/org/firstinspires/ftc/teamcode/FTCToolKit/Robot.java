package org.firstinspires.ftc.teamcode.FTCToolKit;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public abstract class Robot {

    public abstract void init(HardwareMap hwMap);
    public abstract void logTelemetry(Telemetry telemetry);
    public void waitFor(double seconds) throws InterruptedException {
        int miliseconds = (int) seconds * 1000 + 1;
        Thread.sleep(miliseconds);
    }

    public void idle() throws InterruptedException {
        Thread.sleep(1);
    }
}