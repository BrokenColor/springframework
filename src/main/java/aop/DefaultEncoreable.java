package aop;

/**
 * Description:
 * <p>
 * Author: GWL
 * Date: Create in 14:06 2020/4/12
 */
public class DefaultEncoreable implements Encoreable {
    @Override
    public void performEncore() {
        System.out.println("DefaultEncoreable");
    }
}
