public class StaticVersusInstance {
    //static members
    static string name = "SharedStaticName";
    static String getName(); {
        return name;
    }
    //instance members
    String objectName;
    String getObjectName() {
        return this.objectName;
    }
}