package dom;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class DomTest {

	
	public static void testDoc() throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = dbf.newDocumentBuilder();
		File f  = new File("D:\\workspace\\aipisoft_channel_platform_war\\src\\main\\resources\\app-datasource.xml");
		Document doc = docBuilder.parse(f);
		Element root = doc.getDocumentElement();
		
		NodeList children = root.getChildNodes();
		for (int i = 0; i < children.getLength(); i++){
			Node child = children.item(i);
			if (child instanceof Element){
				Element childElement = (Element) child;
				Text textNode = (Text) childElement.getFirstChild();
				System.out.println(childElement.getAttribute("id"));
				System.out.println(childElement.getAttribute("class"));
			}
		}
	}
	public static void testXpath()  throws ParserConfigurationException, SAXException, IOException, XPathExpressionException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = dbf.newDocumentBuilder();
		File f  = new File("D:\\workspace\\aipisoft_channel_platform_war\\src\\main\\resources\\app-datasource.xml");
		Document doc = docBuilder.parse(f);
		
		
		XPathFactory xpathFac = XPathFactory.newInstance();
		XPath path = xpathFac.newXPath();
		System.out.println(path.evaluate("/beans/bean[2]/@id", doc));
		
	}
	/**
	 * @param args
	 * @throws XPathExpressionException 
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 * @throws SAXException 
	 */
	public static void main(String[] args) throws XPathExpressionException, ParserConfigurationException, SAXException, IOException {
		
		testXpath();
	}

}
