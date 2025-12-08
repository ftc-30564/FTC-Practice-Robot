package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(group = "Main")
public class Teleop extends LinearOpMode {
    private Drivetrain drivetrain;

    @Override
    public void runOpMode() {
        drivetrain = new Drivetrain(hardwareMap);
        telemetry.update();

        double forward = -gamepad1.left_stick_y;
        double turn = gamepad1.right_stick_x;

        drivetrain.setDrive(forward, turn);

        telemetry.addData("Forward", forward);
        telemetry.addData("Turn", turn);
        telemetry.update();
    }
}
