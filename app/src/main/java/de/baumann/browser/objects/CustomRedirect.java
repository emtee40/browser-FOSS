package de.baumann.browser.objects;

public class CustomRedirect {
    public final String source;
    public final String target;

    public CustomRedirect(String source, String target) {
        this.source = source;
        this.target = target;
    }

// --Commented out by Inspection START (12.08.23, 19:37):
//    public void setSource(String source) {
//        this.source = source;
//    }
// --Commented out by Inspection STOP (12.08.23, 19:37)

    public String getSource() {
        return source;
    }

// --Commented out by Inspection START (12.08.23, 19:55):
//    public void setTarget(String target) {
//        this.target = target;
//    }
// --Commented out by Inspection STOP (12.08.23, 19:55)

    public String getTarget() {
        return target;
    }
}
