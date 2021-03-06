package mapping;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.io.IOUtils;

import com.alibaba.fastjson.JSON;
import com.sap.aii.mapping.api.AbstractTransformation;
import com.sap.aii.mapping.api.StreamTransformationException;
import com.sap.aii.mapping.api.TransformationInput;
import com.sap.aii.mapping.api.TransformationOutput;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.naming.NoNameCoder;
import com.thoughtworks.xstream.io.xml.DomDriver;

import messageType.MT_IMPBULKFILT_RES;

public class Mapping_IMPBULKFILT_RES extends AbstractTransformation{
	@Override
	public void transform(TransformationInput in, TransformationOutput out) throws StreamTransformationException {
		this.execute(in.getInputPayload().getInputStream(), out.getOutputPayload().getOutputStream());
		
	}
	public void execute(InputStream is, OutputStream os)
			throws StreamTransformationException {
		String injson = "";
		String outxml = "";
		try {
			injson = IOUtils.toString(is);
			MT_IMPBULKFILT_RES Obj = JSON.parseObject(injson,MT_IMPBULKFILT_RES.class);  
			 XStream xstream=new XStream(new DomDriver("utf-8", new NoNameCoder()));
			 xstream.processAnnotations(Obj.getClass());
			 outxml =xstream.toXML(Obj);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			os.write(outxml.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
