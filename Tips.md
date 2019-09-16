
interface 只是定义接口 ， 需要被子类实现，不含property 。
如果需要属性，则利用

abstract class xxAbsClass implements yyInterface

public class subCls1 extends xxAbsClass {}
public class subCls2 extends xxAbsClass {}

