package SeleniumSession;

public class CustomXpath_1 {

	public static void main(String[] args) {

		//xpath: locator not an attribute
				//address of the element
				//1. absolute xpath : /html/body/div[2]/div[1]/ul/li[2]/a
				//2. relative xpath (custom xpath)
				
				//htmltag[@attr='value']
				//input[@name='email']
				//input[@id='input-email'] -- 1
				//*[@id='input-email'] -- 1
				//500 -- 100 inputs
				
				//htmltag[@attr1='value' and @attr2='value']
				//input[@type='text' and @name='email']
				//input[@type='text' and @name='email' and @id='input-email']
				//input[@type='text' and @name='email' and @id]
				//input[@type='text' and @name and @id]
				//input[@type and @name and @id]
				//input --6
				
				//index in xpath:
				// (//input[@type='text'])[1]
				// (//input[@type='text'])[position()=1]
				By.xpath("(//input[@type='text'])[1]");
				
				// (//input[@class='form-control'])[last()]
				// (//input[@class='form-control'])[last()-1]
				
				//dynamic attr:
				//<input id=test_123/>
				//<input id=test_456/>
				//<input id=test_890/>
				//input[starts-with(@id,'test_')]
		
		
	}

}
