//package org.firstinspires.ftc.teamcode.teleop;
//
//import com.acmerobotics.roadrunner.geometry.Pose2d;
//import com.qualcomm.hardware.bosch.BNO055IMU;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.util.ElapsedTime;
//
//import org.checkerframework.checker.units.qual.C;
//import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
//import org.firstinspires.ftc.teamcode.autonomous.Paths;
//import org.firstinspires.ftc.teamcode.robot.DrivetrainConfig;
//import org.firstinspires.ftc.teamcode.robot.MainConfig;
//import org.firstinspires.ftc.teamcode.robotcorelib.math.geometry.Vector;
//import org.firstinspires.ftc.teamcode.robotcorelib.math.utils.MathUtils;
//import org.firstinspires.ftc.teamcode.robotcorelib.motion.followers.ParametricGuidingVectorField;
//import org.firstinspires.ftc.teamcode.robotcorelib.opmode.OpModePipeline;
//import org.firstinspires.ftc.teamcode.robotcorelib.robot.Robot;
//import org.firstinspires.ftc.teamcode.robotcorelib.util.AutoTask;
//import org.firstinspires.ftc.teamcode.robotcorelib.util.Point;
//import org.firstinspires.ftc.teamcode.robotcorelib.util.RobotRunMode;
////import org.firstinspires.ftc.teamcode.vision.apriltag.AprilTagLight;
//import org.firstinspires.ftc.teamcode.vision.apriltag.testing.Projection;
//import org.firstinspires.ftc.teamcode.vision.pixel.RectPipeline;
//import org.openftc.easyopencv.OpenCvCamera;
//import org.openftc.easyopencv.OpenCvCameraFactory;
//import org.openftc.easyopencv.OpenCvCameraRotation;
//import org.openftc.easyopencv.OpenCvWebcam;
//
//import java.sql.Array;
//import java.util.ArrayList;
//import java.util.Objects;
//
//@TeleOp
//public class AutoTest extends OpModePipeline {
//    DrivetrainConfig subsystems = new DrivetrainConfig();
//    AprilTagLight pipeline = new AprilTagLight();
////    DrivetrainConfig subsystems = new DrivetrainConfig();
//
//    private BNO055IMU imu;
//    double foresight;
//    private OpenCvWebcam camera;
//
//    Pose2d robotPose;
//
//    String[][] Colors;
//    int layer = 0;
//
//    @Override
//    public void init() {
////        super.subsystems = subsystems;
//        runMode = RobotRunMode.TELEOP;
//        super.init();
//        imu = hardwareMap.get(BNO055IMU.class, "imu");
//        BNO055IMU.Parameters parameters = new BNO055IMU.Parameters();
//        parameters.mode = BNO055IMU.SensorMode.IMU;
//        parameters.angleUnit = BNO055IMU.AngleUnit.RADIANS;
//        parameters.accelUnit = BNO055IMU.AccelUnit.METERS_PERSEC_PERSEC;
//        parameters.loggingEnabled = false;
//        imu.initialize(parameters);
//        cameraInit();
////        subsystems.drivetrain.init();
//
//    }
//
//    public void loop() {
//        Robot.update();
////        subsystems.intake.breakBeamTelemetry();
//        telemetry.addData("FPS:", camera.getFps());
//        robotPose = Robot.getRobotPose();
//        pipeline.updateAngles(subsystems.drivetrain.getIMU().getAngularOrientation().firstAngle);
//        telemetry.addData("X: ", robotPose.getX());
//        telemetry.addData("Y: ", robotPose.getY());
//        Pose2d cP = pipeline.getPose();
//        telemetry.addData("XCAM ", cP.getX());
//        telemetry.addData("YCAM: ", cP.getY());
//        telemetry.update();
//    }
//    private void cameraInit() {
//        int cameraMonitorViewId = hardwareMap.appContext.getResources().getIdentifier("cameraMonitorViewId", "id", hardwareMap.appContext.getPackageName());
//        camera = OpenCvCameraFactory.getInstance().createWebcam(hardwareMap.get(WebcamName.class, "front_camera"), cameraMonitorViewId);
//        camera.setPipeline(pipeline);
//        camera.showFpsMeterOnViewport(false);
//        camera.setMillisecondsPermissionTimeout(2500); // Timeout for obtaining permission is configurable. Set before opening.
//        camera.openCameraDeviceAsync(new OpenCvCamera.AsyncCameraOpenListener() {
//            @Override
//            public void onOpened() {
//                camera.startStreaming(1280, 720, OpenCvCameraRotation.UPSIDE_DOWN);
//            }
//
//            @Override
//            public void onError(int errorCode) {
//            }
//        });
//    }
//
////    private Vector backboardSolver(String pixel1, String pixel2) {
////        double mosaic = 0.0 + foresight;
////        double height = 0.0;
////        Point targetInList = new Point(0,0);
////        Vector target;
////        for (int o = 0; o < Colors.length-1; o++) {
////            for (int e = 0; e < Colors[o].length; e++) {
////                Double hex = Colors[o][e];
////
////            }
////        }
////
////
////    }
////
////    private boolean isTouchingAdjacentMosaic(int o, int e) {
////        if (e == 7) {return false;}
////        if (e == 0) {return false;}
////        if (o == 12) {return false;}
////        if (o == 0) {return false;}
////        return (Objects.equals(Colors[o][e - 1], Colors[o][e+1]) || Objects.equals(Colors[o-1][e + 1], Colors[o][e]))
////    }
//
//}
