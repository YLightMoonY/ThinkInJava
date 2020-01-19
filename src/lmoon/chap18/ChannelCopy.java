package lmoon.chap18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelCopy {
    private static final int BSIZE = 1024;

    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Arguments: sourcefile destfile");
            System.exit(1);
        }

        FileChannel inFc = new FileInputStream(args[0]).getChannel();
        FileChannel outFc = new FileOutputStream(args[1]).getChannel();
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);

        while (inFc.read(buff) != -1) {
            buff.flip();
            outFc.write(buff);
            buff.clear();
        }
    }
}
