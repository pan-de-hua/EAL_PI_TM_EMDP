package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import com.sap.aii.mapping.api.StreamTransformationException;

import mapping.*;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mapping_IMPBULKFILT_RES_XML jm = new Mapping_IMPBULKFILT_RES_XML();
		String src = "d:\\PI\\queryData\\RES1.txt";
		InputStream in = null;
		try {
			in = new FileInputStream(new File(src));
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		File file = new File("d:\\PI\\queryData\\RES2.txt");
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
