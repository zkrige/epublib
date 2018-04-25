package nl.siegmann.epublib.domain;

/**
 * Created by Zayin Krige on 2018/04/25.
 * zayin@krige.org
 */
public class RenditionLayout {
    private String layout = "reflowable";
    private String orientation = "auto";
    private String spread = "auto";
    private String flow = "auto";

    public RenditionLayout() {
    }

    public RenditionLayout(String layout, String flow, String orientation, String spread) {
        this.layout = layout;
        this.flow = flow;
        this.orientation = orientation;
        this.spread = spread;
    }

    public boolean isFixedLayout() {
        return this.getLayout().equals("pre-paginated");
    }

    public String getLayout() {
        return this.layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getFlow() {
        return this.flow;
    }

    public void setFlow(String flow) {
        this.flow = flow;
    }

    public String getOrientation() {
        return this.orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getSpread() {
        return this.spread;
    }

    public void setSpread(String spread) {
        this.spread = spread;
    }
}
