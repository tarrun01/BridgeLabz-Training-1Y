public class DocumentTemplate implements Cloneable {
    private String title;
    private String header;
    private String footer;
    private String content;

    public DocumentTemplate(String title, String header, String footer, String content) {
        this.title = title;
        this.header = header;
        this.footer = footer;
        this.content = content;
    }

    public void setTitle(String title) { this.title = title; }
    public void setContent(String content) { this.content = content; }
    public String getTitle() { return title; }

    @Override
    public DocumentTemplate clone() {
        try {
            return (DocumentTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported", e);
        }
    }

    @Override
    public String toString() {
        return "DocumentTemplate{" +
               "title='" + title + "'" +
               ", header='" + header + "'" +
               ", footer='" + footer + "'" +
               ", content='" + content + "'" +
               "}";
    }
}
