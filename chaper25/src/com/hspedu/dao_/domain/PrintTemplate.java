package com.hspedu.dao_.domain;


public class PrintTemplate {
  private   String function;
  private Integer fontSize;
  private  String Typesetting;
  private Integer line;
  private Integer style;
  private  Integer show;

    public PrintTemplate() {
    }

    public PrintTemplate(String function, Integer fontSize, String typesetting, Integer line, Integer style, Integer show) {
        this.function = function;
        this.fontSize = fontSize;
        Typesetting = typesetting;
        this.line = line;
        this.style = style;
        this.show = show;
    }

    @Override
    public String toString() {
        return "PrintTemplate{" +
                "function='" + function + '\'' +
                ", fontSize=" + fontSize +
                ", Typesetting='" + Typesetting + '\'' +
                ", line=" + line +
                ", style=" + style +
                ", show=" + show +
                '}';
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public Integer getFontSize() {
        return fontSize;
    }

    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    public String getTypesetting() {
        return Typesetting;
    }

    public void setTypesetting(String typesetting) {
        Typesetting = typesetting;
    }

    public Integer getLine() {
        return line;
    }

    public void setLine(Integer line) {
        this.line = line;
    }

    public Integer getStyle() {
        return style;
    }

    public void setStyle(Integer style) {
        this.style = style;
    }

    public Integer getShow() {
        return show;
    }

    public void setShow(Integer show) {
        this.show = show;
    }
}
