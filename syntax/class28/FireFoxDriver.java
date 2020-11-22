package class28;

public class FireFoxDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Opening Firefox Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Firefox Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing Firefox Browser");
    }

    @Override
    public void findElement() {
        System.out.println("Finding Element in Firefox");
    }
}
