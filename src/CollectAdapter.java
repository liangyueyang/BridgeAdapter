public class CollectAdapter implements CollectText {

    private CollectJDBC collectJDBC;
    private CollectText collect;

    //根据不同的类型创建不同的收集方式
    public CollectAdapter(String type) {
        if (type.equalsIgnoreCase("jdbc")) {
            collectJDBC = new CollectJDBCImpl();
        } else {
            collect = new CollectTextIml();
        }
    }
    @Override
    public String collect(String type) {
        //判断是否是jdbc的方式收集数据
        if (type.equalsIgnoreCase("jdbc")) {
            return collectJDBC.jdbcCollect();
        } else {
            //否则就是以文本文件方式收集数据
            return collect.collect(type);
        }
    }
}