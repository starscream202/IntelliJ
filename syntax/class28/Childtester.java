package class28;

public class Childtester {
    public static void main(String[] args) {
        /*MyInterface2 myInterface=new ChildClass();
        myInterface.printNotes();*/
        System.out.println("Chrome------------------");
        ChromeDriver chrome= new ChromeDriver();
        chrome.openBrowser();
        chrome.maximizeWindow();
        chrome.findElement();
        chrome.closeBrowser();
        System.out.println("FireFox-------------------");
        FireFoxDriver firefox= new FireFoxDriver();
        firefox.openBrowser();
        firefox.maximizeWindow();
        firefox.findElement();
        firefox.closeBrowser();

    }
}
