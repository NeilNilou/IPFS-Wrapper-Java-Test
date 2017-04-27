public class Main {

    static String executable = "D:\\Downloads\\go-ipfs\\ipfs.exe\\";

    public static void main(String[] args) {
        System.out.println("IPFS JAVA IMPLEMENTATION");

        IPFS ipfs = new IPFS(executable);
        System.out.println(ipfs.id());

    }
}
