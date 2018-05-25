import org.sikuli.basics.*;
import org.sikuli.script.*;

public class DarrenBennett {
    private Region r;
    private int interval = 3000;

    private Settings settings;

    public Settings settings() {
        Settings.MoveMouseDelay = 0;
        Settings.ObserveScanRate = 0;
        Settings.SlowMotionDelay = 0;
        return settings;
    }


    public DarrenBennett(int x, int y, int w, int h) {
        this.r = new Region(x, y, w, h);
    }

    public boolean clickUi(String element, float similarity, int offsetX, int offsetY) {
        try {
            Pattern p = new Pattern("img/" + element).targetOffset(offsetX, offsetY);
            r.click(p.similar(similarity));
            return true;
        } catch (FindFailed e) {
            return false;
        }
    }

    public boolean clickUi(String element, float similarity) {
        try {
            Pattern p = new Pattern("img/" + element);
            r.click(p.similar(similarity));

            return true;
        } catch (FindFailed e) {
            return false;
        }
    }
}
