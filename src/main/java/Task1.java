
public class Task1 {

    public String homeXpath="//a[contains(text(),' Home')]";     // find the home xpath using text
    public String productsXpath="//a[contains(text(),' Products')]"; // find the product xpath using contains text
    public String cartXpath="//a[contains(text(),' Cart')]";    // find the cart xpath using mixed xpath
                                 // which means using relative and direct xpath together
                                 // example : //div/li//a -> since we have single and double slash together in this xpath
                                 //it is called mixed xpath. Do not forget / (Single slash) means it goes to direct child.

    public String signUpLoginXpath="//a[contains(text(),' Signup')]"; // find the relative xpath for signup/login
    public String testCasesXpath="//a[contains(text(),' Test')]"; // Find the relative xpath for testcases
// After you find the xpaths assign values to the strings in the constructor
    public Task1() {
         this.homeXpath = homeXpath;
         this.productsXpath = productsXpath;
         this.cartXpath =cartXpath ;
         this.signUpLoginXpath = signUpLoginXpath;
         this.testCasesXpath = testCasesXpath;
    }


}
