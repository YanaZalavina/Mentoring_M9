package driver;

public abstract class BaseDriverCreator implements WebDriverCreator{
    WebDriverCreator creator;

    protected BaseDriverCreator(){}
    protected BaseDriverCreator(WebDriverCreator creator){
        this.creator = creator;
    }

}
