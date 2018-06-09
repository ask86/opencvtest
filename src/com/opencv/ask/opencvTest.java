package com.opencv.ask;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

public class opencvTest {
    public static void main(String[] args){
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);  //load the OpenCV Native Library
            Mat mat = Mat.eye(3, 3, CvType.CV_8UC1);		//The Mat.eye represents a identity matrix, and the type of its elements.
            System.out.println("mat = " + mat.dump());
    }
}
