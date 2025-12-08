package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Drivetrain {
    private DcMotor frontLeftMotor;
    private DcMotor frontRightMotor;


    public Drivetrain(HardwareMap hardwareMap){
        frontLeftMotor = hardwareMap.get(DcMotor.class, "frontLeftMotor");
        frontRightMotor = hardwareMap.get(DcMotor.class, "frontRightMotor");

    }
    public void setDrive(double forward, double turn){
        frontLeftMotor.setPower(forward - turn);
        frontRightMotor.setPower(forward + turn);

    }
}

