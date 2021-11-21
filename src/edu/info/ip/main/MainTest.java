package edu.info.ip.main;

import edu.info.ip.util.BrightnessDlg;

import java.awt.image.BufferedImage;

import static edu.info.ip.util.ImageUtil.*;

public class MainTest {

    public static void main(String[] args) {
        BufferedImage inputImg= loadImage("./test_images/lena_color_512.bmp");
//        BufferedImage inputImg= loadImage("./test_images/lena_gray_512.bmp");
        displayImage(inputImg, "Original image");
        //displayImage(generateRandom(600,600),"Random Pixels");

//        displayImage(extractBand(inputImg, 'R'),"Red");
//        displayImage(extractBand(inputImg, 'G'),"Green");
//        displayImage(extractBand(inputImg, 'B'),"Blue");
        //displayImage(extractBand(inputImg, 'A'),"Alpha");

//        displayImage(extractBandV2(inputImg, 0),"Redv2");
//        displayImage(extractBandV2(inputImg, 1),"Greenv2");
//        displayImage(extractBandV2(inputImg, 2),"Bluev2");
        //displayImage(extractBandV2(inputImg, 3),"Alphav2");

//        displayImage(flipH(inputImg), "Flip H");
//        displayImage(flipV(inputImg), "Flip V");
//        displayImage(flipH(flipV(inputImg)), "Flip V+H");

//        displayImage(simpleSaltPepperNoise(inputImg,0.03d));

//        BufferedImage grayLevels = grayLevelGenerator(100,20,10,200);
//        displayImage(grayLevels);
//        saveImage(grayLevels,"./out_images/gray_level_100_20_10_200.png", "png");

//        displayImage(pixelate(inputImg,64));

//        displayImage(brightnessV1(inputImg,40), "Brightness V1");
//        displayImage(brightnessV2(inputImg,-40), "Brightness V2");
//        displayImage(brightnessV3(inputImg,40), "Brightness V3");
//
//        displayImage(contrast(inputImg,1.5f), "Contrast");

        // combined action
//        BufferedImage brightness = brightnessV3(inputImg, -40);
//        BufferedImage contrast = contrast(brightness, 1.5f);
//        displayImage(contrast, "Brightness+Contrast");

        BufferedImage testImg = applySettingsDlg(inputImg, new BrightnessDlg());
        displayImage(testImg);
    }
}
