package com.example.meepmeep;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.core.colorscheme.scheme.ColorSchemeBlueDark;
import com.noahbres.meepmeep.core.colorscheme.scheme.ColorSchemeRedDark;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class MeepMeepTestingNormal {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(800);


        RoadRunnerBotEntity BlueRight = new DefaultBotBuilder(meepMeep)

                .setColorScheme(new ColorSchemeBlueDark())
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(60, 60, Math.toRadians(180), Math.toRadians(180), 16.5)
                .followTrajectorySequence(drive ->
                                drive.trajectorySequenceBuilder(new Pose2d(-36, 60, Math.toRadians(270.00)))

                                        // Spline to drop of Purple Pixel
                                        .splineTo(new Vector2d(-36.00, 32.00), Math.toRadians(270.00))
                                        .setReversed(true)

                                        // Spline to drop off the Orange Pixel at the backboard (1)
                                        .splineToLinearHeading(new Pose2d(52.00, 35.00, Math.toRadians(540.00)), Math.toRadians(360.00))
                                        .setReversed(false)

                                        // Spline to the stack (1)
                                        .splineToConstantHeading(new Vector2d(-15.95, 62.19), Math.toRadians(181.61))
                                        .splineToConstantHeading(new Vector2d(-62.37, 35.5), Math.toRadians(180.63))
                                        .setReversed(true)

                                        // Spline to the backboard (2)
                                        .splineToConstantHeading(new Vector2d(52.00, 35.00), Math.toRadians(-1.05))
                                        .setReversed(false)

                                        // Spline to the stack (2)
                                        .splineToConstantHeading(new Vector2d(-62.37, 35.5), Math.toRadians(182.02))
                                        .setReversed(true)

                                        // Spline to the backboard (3)
                                        .splineToConstantHeading(new Vector2d(52.00, 35.00), Math.toRadians(-1.05))
                                        .setReversed(false)

                                        // Spline to the stack (3)
                                        .splineToConstantHeading(new Vector2d(-62.37, 35.5), Math.toRadians(182.02))
                                        .setReversed(true)

                                        // Spline to the backboard (4)
                                        .splineToConstantHeading(new Vector2d(52.00, 35.00), Math.toRadians(-1.05))
                                        .setReversed(false)

                                        .build()
                );


        RoadRunnerBotEntity BlueLeft = new DefaultBotBuilder(meepMeep)

                .setColorScheme(new ColorSchemeBlueDark())
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(60, 60, Math.toRadians(180), Math.toRadians(180), 16.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(12, 60, Math.toRadians(-90.00)))

                                // Spline to drop off the Purple Pixel
                                .splineTo(new Vector2d(12.00, 32.00), Math.toRadians(270.00))
                                .setReversed(true)

                                // Spline to drop off the Orange Pixel at the backboard (1)
                                .splineToLinearHeading(new Pose2d(52.00, 35.00, Math.toRadians(540.00)), Math.toRadians(360.00))
                                .setReversed(false)

                                // Spline to the stack (1)
                                .splineToConstantHeading(new Vector2d(-15.95, 62.19), Math.toRadians(181.61))
                                .splineToConstantHeading(new Vector2d(-62.37, 35.5), Math.toRadians(180.63))
                                .setReversed(true)

                                // Spline to the backboard (2)
                                .splineToConstantHeading(new Vector2d(52.00, 35.00), Math.toRadians(-1.05))
                                .setReversed(false)

                                // Spline to the stack (2)
                                .splineToConstantHeading(new Vector2d(-62.37, 35.5), Math.toRadians(182.02))
                                .setReversed(true)

                                // Spline to the backboard (3)
                                .splineToConstantHeading(new Vector2d(52.00, 35.00), Math.toRadians(-1.05))
                                .setReversed(false)

                                // Spline to the stack (3)
                                .splineToConstantHeading(new Vector2d(-62.37, 35.5), Math.toRadians(182.02))
                                .setReversed(true)

                                // Spline to the backboard (4)
                                .splineToConstantHeading(new Vector2d(52.00, 35.00), Math.toRadians(-1.05))
                                .setReversed(false)






                                .build()
                );

        RoadRunnerBotEntity RedRight = new DefaultBotBuilder(meepMeep)

                .setColorScheme(new ColorSchemeRedDark())
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(60, 60, Math.toRadians(60), Math.toRadians(60), 16.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(12, -60, Math.toRadians(90)))

                                // Drop off purple Pixels at spike mark
                                .splineTo(new Vector2d(12.00, -32.00), Math.toRadians(90.00))
                                .setReversed(true)

                                // Drop off orange pixel at the backboard (1)
                                .splineToLinearHeading(new Pose2d(52.00, -35.00, Math.toRadians(180.00)), Math.toRadians(-5.30))
                                .setReversed(false)

                                // Spline to the stack (1)
                                .splineToConstantHeading(new Vector2d(-15.95, -62.19), Math.toRadians(181.61))
                                .splineToConstantHeading(new Vector2d(-62.37, -35.5), Math.toRadians(180.63))
                                .setReversed(true)

                                // Spline to the backboard (2)
                                .splineToConstantHeading(new Vector2d(52.00, -35.00), Math.toRadians(-1.05))
                                .setReversed(false)

                                // Spline to the stack (2)
                                .splineToConstantHeading(new Vector2d(-62.37, -35.5), Math.toRadians(182.02))
                                .setReversed(true)

                                // Spline to the backboard (3)
                                .splineToConstantHeading(new Vector2d(52.00, -35.00), Math.toRadians(-1.05))
                                .setReversed(false)

                                // Spline to the stack (3)
                                .splineToConstantHeading(new Vector2d(-62.37, -35.5), Math.toRadians(182.02))
                                .setReversed(true)

                                // Spline to the backboard (4)
                                .splineToConstantHeading(new Vector2d(52.00, -35.00), Math.toRadians(-1.05))
                                .setReversed(false)



                                .build()
                );

        RoadRunnerBotEntity RedLeft = new DefaultBotBuilder(meepMeep)

                .setColorScheme(new ColorSchemeRedDark())
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(60, 60, Math.toRadians(180), Math.toRadians(180), 16.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-36, -60, Math.toRadians(90)))

                                .splineTo(new Vector2d(-36.00, -26.89), Math.toRadians(90.00))
                                .setReversed(true)
                                .splineTo(new Vector2d(-23.12, -36.90), Math.toRadians(7.03))
                                .splineToLinearHeading(new Pose2d(61.43, -35.95, Math.toRadians(00)), Math.toRadians(0.00))

                                // Spline to the stack (2)
                                .splineToConstantHeading(new Vector2d(-62.37, -35.5), Math.toRadians(182.02))
                                .setReversed(true)

                                // Spline to the backboard (3)
                                .splineToConstantHeading(new Vector2d(52.00, -35.00), Math.toRadians(-1.05))
                                .setReversed(false)

                                // Spline to the stack (3)
                                .splineToConstantHeading(new Vector2d(-62.37, -35.5), Math.toRadians(182.02))
                                .setReversed(true)

                                // Spline to the backboard (4)
                                .splineToConstantHeading(new Vector2d(52.00, -35.00), Math.toRadians(-1.05))
                                .setReversed(false)

                                .build()
                );



        meepMeep.setBackground(MeepMeep.Background.FIELD_CENTERSTAGE_JUICE_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
               .addEntity(RedLeft)
                //.addEntity(RedRight)
                //.addEntity(BlueLeft)
                //.addEntity(BlueRight)
                .start();
    }
}