package company;

//　
public abstract class Employee implements Workable {
    // フィールド
    protected final String name;
    protected final Department department;
    private final String position;
    private final int employeeId;

    // コンストラクター
    public Employee(String name, Department department, String position, int employeeId) {
        this.name = name;
        this.department = department;
        this.position = position;
        this.employeeId = employeeId;
    }

    // 報告メソッド
    public void report(int times) {
        System.out.println(times + "回目の報告をします。役職：" + position + "、名前：" + name);
    }

    // 報告メソッド（オーバーロード）
    public void report() {
        report(1);
    }
    
    // 会議に参加するメソッド
    public abstract void joinMeeting();
    
    //働くメソッドを実装
    @Override
    public void work() {
        System.out.println("正社員として働きます。名前：" + name + slogan);
    }
}
