package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import com.sap.aii.mapping.api.StreamTransformationException;

import mapping.TRUCKDISPATCHINFOFILT_REQ;
import mapping.TRUCKDISPATCHINFOFILT_RES;

public class TRUCKDISPATCHINFOFILT_RES_TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				TRUCKDISPATCHINFOFILT_RES jm = new TRUCKDISPATCHINFOFILT_RES();
				String src = "d:\\PI\\TRUCKDISPATCHINFOFILT\\RES1.txt";
				InputStream in = null;
				try {
					in = new FileInputStream(new File(src));
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				File file = new File("d:\\PI\\TRUCKDISPATCHINFOFILT\\RES2.txt");
				OutputStream os = null;
				try {
					os = new FileOutputStream(file,true);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					jm.execute(in,os);
				} catch (StreamTransformationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

}
