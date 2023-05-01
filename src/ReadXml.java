import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.HashMap;

public class ReadXml {
    private HashMap<String,Book> books = new HashMap<>();
// to read from the xml and save the data in hashmap
    public  void readFromXml() {

        try {
            File inputFile = new File("C:\\Users\\PC\\Desktop\\spring_boot\\homework\\testng.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputFile);

            document.getDocumentElement().normalize();

            Book bookTemp;
            NodeList nList = document.getElementsByTagName("book");

            for (int temp = 0; temp < nList.getLength(); temp++) {

                Element eElement = (Element) nList.item(temp);
                bookTemp =new Book(eElement.getAttribute("id"),eElement.getElementsByTagName("author").item(0).getTextContent()
                        ,eElement.getElementsByTagName("title").item(0).getTextContent()
                        ,eElement.getElementsByTagName("genre").item(0).getTextContent()
                        ,eElement.getElementsByTagName("price").item(0).getTextContent()
                        ,eElement.getElementsByTagName("publish_date").item(0).getTextContent()
                        ,eElement.getElementsByTagName("description").item(0).getTextContent());
                books.put(eElement.getAttribute("id"),bookTemp);
                //System.out.println(eElement.getElementsByTagName("title").item(0).getTextContent());


            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
// to find the book by its id
    public void findBookById(String id){
        Book findBook= books.get(id);
        if (findBook==null)
            System.out.println("THERE IS NO BOOK WITH THIS ID");
        else
            System.out.println(findBook);
    }

}
