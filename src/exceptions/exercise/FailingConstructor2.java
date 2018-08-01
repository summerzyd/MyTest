package exceptions.exercise;

/**
 * @version 1.0
 * @Description:
 * @author: hxw
 * @date: 2018/8/1 23:36
 */
class FailingConstructor2 {
    private final WithDispose wd1, wd2;
    FailingConstructor2(boolean fail) throws ConstructionException {
        wd1 = new WithDispose(1);
        try {
        // “模拟”其他可能引发异常的代码
            if(fail) throw new ConstructionException();
        } catch(ConstructionException e) {
            wd1.dispose();
            throw e;
        }
        wd2 = new WithDispose(2);
    }
}
