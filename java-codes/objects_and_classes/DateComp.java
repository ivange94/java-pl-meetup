import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class DateComp {
  
    public static void main(String[] args) throws ParseException {
	SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
	Date johnsDateOfBirth = sf.parse("1995-02-01");
	Date marysDateOfBirth = sf.parse("1992-04-5");
    
	if (johnsDateOfBirth.before(marysDateOfBirth)) {
	    System.out.println("John is older than Mary.");
	}
	else {
	    System.out.println("Mary is older than John");
	}
    }
}