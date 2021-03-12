package ai.beans;

public class ColorBean {

    private String foregroundColor;
    private String backgroundColor;
    private String visibleFrame;

    public ColorBean() {
    }

    /**
     * @return the foregroundColor
     */
    public String getForegroundColor() {
        return foregroundColor;
    }

    /**
     * @param foregroundColor the foregroundColor to set
     */
    public void setForegroundColor(String foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    /**
     * @return the backgroundColor
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * @param backgroundColor the backgroundColor to set
     */
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    /**
     * @return the visibleFrame
     */
    public String getVisibleFrame() {
        return visibleFrame;
    }

    /**
     * @param visibleFrame the visibleFrame to set
     */
    public void setVisibleFrame(String visibleFrame) {
        this.visibleFrame = visibleFrame;
    }
}
