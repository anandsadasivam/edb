package org.dp.inc.emp;

import java.io.File;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.ValidationEventHandler;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.attachment.AttachmentMarshaller;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.Result;
import javax.xml.validation.Schema;

import org.w3c.dom.Node;
import org.xml.sax.ContentHandler;

public class EmployeeBNF implements Serializable, Marshaller {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4153604619069548860L;

	
	//Achievements Record DI after-life
	private EmployeeBNF(String employeeId, String employeeName,
				String socialSecrutiyCode) {
			// TODO Auto-generated constructor stub		
			emp = new Employee(employeeId, employeeName, socialSecrutiyCode);
	}

	@Override
	public <A extends XmlAdapter> A getAdapter(Class<A> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AttachmentMarshaller getAttachmentMarshaller() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ValidationEventHandler getEventHandler() throws JAXBException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Listener getListener() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node getNode(Object arg0) throws JAXBException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getProperty(String arg0) throws PropertyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Schema getSchema() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void marshal(Object arg0, Result arg1) throws JAXBException {
		// TODO Auto-generated method stub

	}

	@Override
	public void marshal(Object arg0, OutputStream arg1) throws JAXBException {
		// TODO Auto-generated method stub

	}

	@Override
	public void marshal(Object arg0, File arg1) throws JAXBException {
		// TODO Auto-generated method stub

	}

	@Override
	public void marshal(Object arg0, Writer arg1) throws JAXBException {
		// TODO Auto-generated method stub

	}

	@Override
	public void marshal(Object arg0, ContentHandler arg1) throws JAXBException {
		// TODO Auto-generated method stub

	}

	@Override
	public void marshal(Object arg0, Node arg1) throws JAXBException {
		// TODO Auto-generated method stub

	}

	@Override
	public void marshal(Object arg0, XMLStreamWriter arg1) throws JAXBException {
		// TODO Auto-generated method stub

	}

	@Override
	public void marshal(Object arg0, XMLEventWriter arg1) throws JAXBException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setAdapter(XmlAdapter arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public <A extends XmlAdapter> void setAdapter(Class<A> arg0, A arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setAttachmentMarshaller(AttachmentMarshaller arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setEventHandler(ValidationEventHandler arg0)
			throws JAXBException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setListener(Listener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setProperty(String arg0, Object arg1) throws PropertyException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSchema(Schema arg0) {
		// TODO Auto-generated method stub

	}	
	
	/**
	 * @return the expEmp
	 */
	public static EmployeeBNF getExpEmp() {
		return expEmp;
	}

	/**
	 * @param expEmp the expEmp to set
	 */
	public static void setExpEmp(EmployeeBNF expEmp) {
		EmployeeBNF.expEmp = expEmp;
	}

	
	/**
	 * @param obj
	 * @return
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		return expEmp.equals(obj);
	}

	/**
	 * @return
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return expEmp.hashCode();
	}

	/**
	 * @return
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return expEmp.toString();
	}


	private static Employee emp;
	private static EmployeeBNF expEmp;

}
