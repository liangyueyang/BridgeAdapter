public abstract class BirtShowAbstract {

    private BirtShow birtShow;

    public BirtShowAbstract(BirtShow birtShow) {
        this.birtShow = birtShow;
    }

    public void showBirt(String s) {
        birtShow.show(s);
    }
}