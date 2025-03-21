package com.gmail.base;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XML {

	public static void main(String[] args) throws MalformedURLException, SAXException, IOException, ParserConfigurationException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(new URL("http://feed.theplatform.com/f/HNK2IC/atv_usa_showlist").openStream());
		doc.getDocumentElement().normalize();
		 
		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	 
		NodeList nList = doc.getElementsByTagName("item");
	 
		System.out.println("----------------------------");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			 
			Node nNode = nList.item(temp);
	 
			System.out.println("\nCurrent Element :" + nNode.getNodeName());
	 
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	 
				Element eElement = (Element) nNode;
	 
				//System.out.println("Staff id : " + eElement.getAttribute("id"));
				System.out.println("Episode title is  : " + eElement.getElementsByTagName("title").item(0).getTextContent());
				
				System.out.println("Episode title is  : " + eElement.getElementsByTagName("media:category").item(0).getTextContent());
				System.out.println("Episode title is  : " + eElement.getElementsByTagName("media:category").item(0).getTextContent());
			}
		}
	    }
	  
	 

	}


