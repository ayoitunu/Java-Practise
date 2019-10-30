

 // Maintains a List<Account>
 import java.util.ArrayList;
 import java.util.List;
 import javax.xml.bind.annotation.Xmlelement;

 public class Accounts {
 // @XmlElement specifies XML element name for each object in the List
 @XmlElement(name="account")
 private List<Account> accounts = new ArrayList<>(); // stores Accounts

// returns the List<Accounts>
 public List<Account> getAccounts() {return accounts;}
 }
