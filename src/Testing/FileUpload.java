package Testing;
	import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

	public class FileUpload {
	    public static void main(String[] args) throws AWTException {
	        //WebDriver driver = new ChromeDriver();
	        driver.get("https://www.example.com");

	       // WebElement fileInput = driver.findElement(By.id("fileInput"));
	        //fileInput.click();

	        Robot robot = new Robot();
	        robot.delay(1000); // Add delay for the file dialog to open

	        // Provide the file path
	        StringSelection selection = new StringSelection("C:\\path\\to\\file.txt");
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

	        // Simulate Ctrl+V to paste the file path
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_CONTROL);

	        robot.delay(1000); // Add delay before pressing Enter

	        // Press Enter to confirm the file selection
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);

	        // Rest of the code...
	    }
	}



