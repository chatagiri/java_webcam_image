/* Requires Webcam Capture API 
   URL(zip)  https://github.com/sarxos/webcam-capture/releases/download/webcam-capture-parent-0.3.10/webcam-capture-0.3.10-dist.zip
 */

import java.io.*;
import java.awt.image.*;;
import javax.imageio.*;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;

public class java_webcam_image{
	
	public static void main(String[] args) throws IOException {

	Webcam webcam = null;

	webcam = Webcam.getDefault();

		if(webcam != null){

		 System.out.println("Webcam:"+ webcam.getName());
		 webcam.open();

		 BufferedImage image = webcam.getImage();
		 ImageIO.write(image, "PNG", new File("/webcam.png")); /* JPEG,PNG,GIF */

		 System.out.println(webcam.getName() +": image saved.");

		}else{
			System.out.println("No cameras detected.");

		}
	}
}