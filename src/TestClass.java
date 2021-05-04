public class TestClass {
    public static void main(String[] args) {
        BirtShowTextData showText = new BirtShowTextData(new BirtShowImpl1());
        showText.showBirt();

        BirtShowJdbcData showJdbc = new BirtShowJdbcData(new BirtShowImpl1());
        showJdbc.showBirt();

        BirtShowTextData showText1 = new BirtShowTextData(new BirtShowImpl2());
        showText1.showBirt();

        BirtShowJdbcData showJdbc1 = new BirtShowJdbcData(new BirtShowImpl2());
        showJdbc1.showBirt();

        /**
         * 执行结果
         *
         *
         * 报表1展示的内容为---我是文本文件收集方式
         * 报表1展示的内容为---我是jdbc收集方式
         * 报表2展示的内容为---我是文本文件收集方式
         * 报表2展示的内容为---我是jdbc收集方式
         *
         */
    }
}