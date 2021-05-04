public class BirtShowJdbcData extends BirtShowAbstract {

    public BirtShowJdbcData(BirtShow birtShow) {
        super(birtShow);

    }
    public void showBirt() {
        super.showBirt(new CollectAdapter("jdbc").collect("jdbc"));
    }
}