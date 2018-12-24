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

import messageType.IMPBULKFILT_Datarows;
import messageType.MT_IMPBULKFILT_REQ;
import messageType.MT_IMPBULKFILT_RES;
import messageType.QueryDataResponse;

public class Mapping_IMPBULKFILT_RES_XML extends AbstractTransformation{
	@Override
	public void transform(TransformationInput in, TransformationOutput out) throws StreamTransformationException {
		this.execute(in.getInputPayload().getInputStream(), out.getOutputPayload().getOutputStream());
		
	}
	public void execute(InputStream is, OutputStream os)
			throws StreamTransformationException {
		String outxml = "";
		try {
			XStream xstream = new XStream(new DomDriver("utf-8", new NoNameCoder()));
			xstream.processAnnotations(QueryDataResponse.class);
			QueryDataResponse response = (QueryDataResponse) xstream.fromXML(is);
			String sxml = response.getResult();
			if(sxml.startsWith("<![CDATA[")) {
				sxml = sxml.substring(9, sxml.length()-3);
			}
			XStream xstream_1 = new XStream(new DomDriver("utf-8", new NoNameCoder()));
			xstream_1.processAnnotations(IMPBULKFILT_Datarows.class);
			IMPBULKFILT_Datarows datarows = (IMPBULKFILT_Datarows) xstream_1.fromXML(sxml);

			MT_IMPBULKFILT_RES Obj = new  MT_IMPBULKFILT_RES();
			Obj.setData(datarows.getData());
			Obj.setReultMsg(datarows.getReultMsg());
			XStream xstream2=new XStream(new DomDriver("utf-8", new NoNameCoder()));
			xstream2.processAnnotations(Obj.getClass());
			 outxml =xstream2.toXML(Obj);
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
