public class BirtShowTextData extends BirtShowAbstract {

    //初始化BirtShowTextData 以及调用父类的构造方法实例化成员变量
    public BirtShowTextData(BirtShow birtShow) {
        super(birtShow);

    }

    //报表展示方法，里边调用了桥接抽象类的showBrit方法，传入具体的收集方式参数，这个参数就是我们写的适配器，适配多个数据源
    public void showBirt() {
        super.showBirt(new CollectAdapter("text").collect("text"));
    }
}