package ToDosPageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class PageElements {
	
WebDriver driver = null;


	//Identify page objects
	By NewToDo = By.className("new-todo");
	By FilterCompleted = By.xpath("//a[@href='#/completed']"); 
	By FilterAll = By.xpath("//a[@href='#/']");
	By FilterActive = By.xpath("//a[@href='#/active']");
	By ClearCompleted = By.className("clear-completed");
	By Complete = By.xpath("//input[@class='toggle']");
	By FirstToDo = By.xpath("/html/body/section/div/section/ul/li[1]/div/label");
	By SecToDo = By.xpath("/html/body/section/div/section/ul/li[2]/div/label");
	By ThirdToDo = By.xpath("/html/body/section/div/section/ul/li[3]/div/label");
	By FourthToDo = By.xpath("/html/body/section/div/section/ul/li[4]/div/label");
	By FourthInput = By.xpath("/html/body/section/div/section/ul/li[4]/input");
	By ToDoCount =By.xpath("/html/body/section/div/footer/span/strong");
	//By EditItem = By.xpath("/html/body/section/div/section/ul/li[4]");
	//By EditItem = By.className("editing");
	By EditItem = By.xpath("//input[@class='edit']");
    By VerifyCompleted = By.xpath("/html/body/section/div/section/ul/li/div/label");
    By Mouseover = By.xpath("/html/body/section/div/section/ul/li[3]/div/label");
	By Delete = By.xpath("/html/body/section/div/section/ul/li[3]/div/button");
		
  public PageElements(WebDriver driver)
  {
		this.driver = driver;
  }
		
	public void ToDoItem1(String text1)
	
	{
		
	driver.findElement(NewToDo).sendKeys(text1);
	driver.findElement(NewToDo).sendKeys(Keys.ENTER); 
	assertEquals(driver.findElement(FirstToDo).getText(), text1);
	System.out.println("First todos item '" + driver.findElement(FirstToDo).getText() + "' has been saved");	
	
	}			
	
  public void ToDoItem2(String text2)
	
	{
	  
	driver.findElement(NewToDo).sendKeys(text2);
	driver.findElement(NewToDo).sendKeys(Keys.ENTER); 
	assertEquals(driver.findElement(SecToDo).getText(), text2);
	System.out.println("Second todos item '" + driver.findElement(SecToDo).getText() + "' has been saved");	
	
	}	
  
  public void ToDoItem3(String text3)
	
	{
	  
	driver.findElement(NewToDo).sendKeys(text3);
	driver.findElement(NewToDo).sendKeys(Keys.ENTER); 
	assertEquals(driver.findElement(ThirdToDo).getText(), text3);
	System.out.println("Third todos item '" + driver.findElement(ThirdToDo).getText() + "' has been saved");	
	
	}	
  
  public void ToDoItem4(String text4)
	
	{
	driver.findElement(NewToDo).sendKeys(text4);
	driver.findElement(NewToDo).sendKeys(Keys.ENTER); 
	assertEquals(driver.findElement(FourthToDo).getText(), text4);
	System.out.println("Fourth todos item '" + driver.findElement(FourthToDo).getText() + "' has been saved");
	
	}	
  
  public void ToDoCount()
  {
    assertEquals(driver.findElement(ToDoCount).getText(),"4");
	System.out.println("Todos count is '" + driver.findElement(ToDoCount).getText() + "'");
  }
    
  
  public void UpdateTodoItem()
   
  {
  
    WebElement ed = driver.findElement(FourthToDo);
	Actions edit = new Actions(driver);
    edit.moveToElement(ed).doubleClick().build().perform();
	driver.findElement(FourthInput).sendKeys(" Application");	
  
  }	  	 	  
	  
	  
  public void CompleteAToDoItem()
	
	{
	driver.findElement(Complete).click();
			
	}
  
  
  public void FilterCompleted()
	
	{
	driver.findElement(FilterCompleted).click();	
	assertEquals(driver.findElement(VerifyCompleted).getText(),"Download");
	System.out.println("Todos item '" + driver.findElement(VerifyCompleted).getText() + "' has been completed");	
			
	}
	
  public void ClearCompletedItems()
  {
		driver.findElement(ClearCompleted).click();	
						
   }
  
  public void Activetodos()
  {
	driver.findElement(FilterActive).click();
	assertEquals(driver.findElement(ToDoCount).getText(),"3");
	System.out.println("Left Todo items count is '" + driver.findElement(ToDoCount).getText() + "'");
  }   
  
   public void FilterAllItems()
	
 	{
 	driver.findElement(FilterAll).click();
 			
 	}
 	
 
   public void DeleteToDoItem()
   
   {
	 	WebElement ele = driver.findElement(Mouseover);
	 	Actions action = new Actions(driver);
	 	action.moveToElement(ele).perform();
	 	driver.findElement(Delete).click();
	 	assertEquals(driver.findElement(ToDoCount).getText(),"2");
		System.out.println("After delete '" + driver.findElement(ToDoCount).getText() + "' items left");	 	
	 			
	}
 	
 
  
	

}
