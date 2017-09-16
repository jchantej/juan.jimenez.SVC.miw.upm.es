package juan.jimenez.SVC.miw.upm.es;

public class C32 {

    public String mA() {
        return Thread.currentThread().getStackTrace()[1].getMethodName();
    }

}
