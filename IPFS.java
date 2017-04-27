/**
 * Created by Bource on 27/04/2017.
 */

import org.omg.SendingContext.RunTime;

import java.io.*;

public class IPFS {

    public String executable;

    public IPFS(String executable) {
        this.executable = executable;
    }

    public String id() {
        StringBuffer output = new StringBuffer();
        Process p;
        try {
            p = Runtime.getRuntime().exec(executable + " id");
            p.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = "";
            while ((line = reader.readLine()) != null) {
                output.append(line + "\n");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return output.toString();
    }
}
