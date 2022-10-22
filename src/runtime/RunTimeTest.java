package runtime;

public class RunTimeTest {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        runtime.freeMemory();
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.maxMemory());
        runtime.gc();
        System.getProperties().list(System.out);
        System.out.println(System.clearProperty("user.name"));
//        try{
//            runtime.exec("D:\\下载\\Tencent\\QQ\\Bin\\QQScLauncher.exe");
//            Thread.sleep(5000);
//            runtime.exec("D:\\下载\\Tencent\\QQ\\Bin\\QQScLauncher.exe").destroy();
//        }catch (Exception e){
//            e.printStackTrace();
//        }

    }
}
