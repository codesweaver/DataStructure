package hash;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;

public class CheckSum {
    public static void main(String[] args) {
        String input1 = "My text";
        String input2 = "My text";
        String input3 = "My different text";

        byte[] input1Bytes = input1.getBytes();
        byte[] input2Bytes = input2.getBytes();
        byte[] input3Bytes = input3.getBytes();

        CRC32 crc32 = new CRC32();
        crc32.update(input1Bytes);
        System.out.printf("input1: %d\n", crc32.getValue());

        crc32.reset();

        crc32.update(input2Bytes);
        System.out.printf("input2: %d\n", crc32.getValue());

        crc32.reset();

        crc32.update(input3Bytes);
        System.out.printf("input3: %d\n", crc32.getValue());

        // 아주 아주 긴 데이터를 읽어오는 중이라고 가정하면
        // 아래와 같은 코드가 됩니다.
        String input = "Very long long text";
        byte[] inputArray = input.getBytes(StandardCharsets.UTF_8);

        InputStream inputStream = new ByteArrayInputStream(inputArray);
        CheckedInputStream checkedInputStream = new CheckedInputStream(inputStream, new CRC32());

        byte[] buffer = new byte[1024];
        try {
            while ((checkedInputStream.read(buffer, 0, buffer.length)) >= 0) {
                // some code here
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
