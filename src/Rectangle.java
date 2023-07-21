public class Rectangle {
    private Integer width;
    private Integer heigth;

    Rectangle() {
        this.width = 10;
        this.heigth = 10;
    }

    Rectangle(Integer _width, Integer _heigth){
        this.width = _width;
        this.heigth = _heigth;
    }

    public Integer getHeigth() {
        return heigth;
    }

    public Integer getWidth() {
        return width;
    }

    public void setHeigth(Integer heigth) {
        this.heigth = heigth;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer calculateArea(){
        return this.heigth*this.width;
    }

    public Integer calculatePerimeter(){
        return 2*(this.width+this.heigth);
    }
}
