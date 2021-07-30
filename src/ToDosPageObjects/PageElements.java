package ToDosPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PageElements {
	
WebDriver driver = null;
	
	By NewToDo = By.className("new-todo");
	By FilterCompleted = By.xpath("//a[@href='#/completed']"); 
	By FilterAll = By.xpath("//a[@href='#/']");
	By FilterActive = By.linkText("Active");
	By ClearCompleted = By.className("clear-completed");
	By Complete = By.xpath("//input[@class='toggle']");
	
	
		
  public PageElements(WebDriver driver)
  {
		this.driver = driver;
  }
		
	public void ToDoItem1(String text1)
	
	{
	driver.findElement(NewToDo).sendKeys(text1);
	driver.findElement(NewToDo).sendKeys(Keys.ENTER); 
	}	
	
  public void ToDoItem2(String text2)
	
	{
	driver.findElement(NewToDo).sendKeys(text2);
	driver.findElement(NewToDo).sendKeys(Keys.ENTER); 
	}	
  public void ToDoItem3(String text3)
	
	{
	driver.findElement(NewToDo).sendKeys(text3);
	driver.findElement(NewToDo).sendKeys(Keys.ENTER); 
	}	
  public void ToDoItem4(String text4)
	
	{
	driver.findElement(NewToDo).sendKeys(text4);
	driver.findElement(NewToDo).sendKeys(Keys.ENTER); 
	}	
  
  public void FilterComplete()
	
	{
	driver.findElement(FilterCompleted).click();
			
	}
	
  
  public void FilterAllItems()
	
 	{
 	driver.findElement(FilterAll).click();
 			
 	}
 	
 
  public void CompleteAToDoItem()
	
 	{
 	driver.findElement(Complete).click();
 			
 	}
 	
 
  
	

}
