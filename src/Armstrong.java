import javax.swing.plaf.synth.SynthEditorPaneUI;

/**
 * Created by vignesh on 02/10/20.
 */
public class Armstrong {
    public static int arm(int d1,int d2,int d3) {
        d1 = d1 * d1 * d1;
        d2 = d2 * d2 * d2;
        d3 = d3 * d3 * d3;
        return d1 + d2 + d3;
    }

    public static void main(String[] args) {
        System.out.println(arm(1,4,7));
    }
}
