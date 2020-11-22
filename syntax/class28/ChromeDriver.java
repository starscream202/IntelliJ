package class28;

public class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Open Chrome Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Chrome Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing Chrome Window");
    }

    @Override
    public void findElement() {
        System.out.println("Finding Element");
    }
}
